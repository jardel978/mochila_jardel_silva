package br.com.dh.odontologia.dao.impl;

import br.com.dh.odontologia.dao.IDao;
import br.com.dh.odontologia.dao.configuracao.DataSource;
import br.com.dh.odontologia.model.Paciente;
import br.com.dh.odontologia.util.Util;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PacienteDaoH2 implements IDao<Paciente> {

    private DataSource dataSource;
    private EnderecoDaoH2 enderecoDaoH2;

    public PacienteDaoH2(EnderecoDaoH2 enderecoDaoH2) {
        this.dataSource = DataSource.getInstancia();
        this.enderecoDaoH2 = enderecoDaoH2;
    }

    @Override
    public Paciente salvar(Paciente paciente) {
        Connection connection = dataSource.conectarComBancoDeDados();
        PreparedStatement pstmt = null;
        paciente.setEndereco(enderecoDaoH2.salvar(paciente.getEndereco()));

        String query = "INSERT INTO pacientes (" +
                        " nome_paciente," +
                        " sobrenome_paciente," +
                        " rg_paciente," +
                        " data_cadastro_paciente)" +
                        "VALUES(?, ?, ?, ?, ?);";

        try {

            pstmt = connection.prepareStatement(query);
            pstmt.setString(1, paciente.getNome());
            pstmt.setString(2, paciente.getSobrenome());
            pstmt.setString(3, paciente.getRg());
            pstmt.setTimestamp(4, Util.dateToTimestamp((paciente.getDataCadastro())));
            pstmt.setInt(5, paciente.getEndereco().getId());
            pstmt.executeUpdate();

            System.out.println("Paciente adicionado com sucesso!");
            pstmt.close();

        } catch (SQLException exception) {
            exception.printStackTrace();
        }

        return paciente;
    }

    @Override
    public Optional<Paciente> buscar(Integer id) {
        Connection connection = dataSource.conectarComBancoDeDados();
        PreparedStatement pstmt = null;
        Paciente pacienteBuscado = null;

        String query = "SELECT id_paciente, nome_paciente, sobrenome_paciente, rg_paciente, data_cadastro_paciente" +
                " FROM pacientes WHERE id_paciente = ?";

        try {

            pstmt = connection.prepareStatement(query);
            pstmt.setInt(1, id);

            ResultSet resultado = pstmt.executeQuery();

            while (resultado.next()) {

                pacienteBuscado = gerarPaciente(resultado);

            }
            System.out.println("Paciente encontrado com sucesso: ");
            pstmt.close();

        } catch (SQLException exception) {
            exception.printStackTrace();
        }

        return pacienteBuscado != null ? Optional.of(pacienteBuscado) : Optional.empty();
    }

    @Override
    public void excluir(Integer id) {

        Connection connection = dataSource.conectarComBancoDeDados();
        PreparedStatement pstmt = null;

        String query = "DELETE FROM MEDICAMENTOS WHERE id = ?";

        try {
            pstmt = connection.prepareStatement(query);
            pstmt.setInt(1, id);
            pstmt.executeUpdate();

            System.out.println("Paciente excluído com sucesso.");
            pstmt.close();

        } catch (SQLException exception) {
            exception.printStackTrace();
        }

    }

    @Override
    public List<Paciente> buscarTodos() {

        Connection connection = dataSource.conectarComBancoDeDados();
        PreparedStatement pstmt = null;
        ArrayList<Paciente> listaPacientes = new ArrayList<>();

        String query = "SELECT * FROM MEDICAMENTOS;";

        try {

            pstmt = connection.prepareStatement(query);
            ResultSet resultado = pstmt.executeQuery();

            while (resultado.next()) {

                listaPacientes.add(gerarPaciente(resultado));

            }
            pstmt.close();

        } catch (SQLException exception) {
            exception.printStackTrace();
        }

        return listaPacientes;
    }

    private Paciente gerarPaciente(ResultSet resultado) throws SQLException {
        Paciente paciente = new Paciente();
        paciente.setId(resultado.getInt("id_paciente"));
        paciente.setNome(resultado.getString("nome_paciente"));
        paciente.setSobrenome(resultado.getString("sobrenome_paciente"));
        paciente.setRg(resultado.getString("rg_paciente"));
        paciente.setDataCadastro(resultado.getDate("data_cadastro_paciente"));
        paciente.setEndereco(enderecoDaoH2.buscar(resultado.getInt("id_endereco")).orElse(null));

        return paciente;
    }

}
