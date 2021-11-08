package dao.imple;

import dao.IDaoGenerico;
import dao.configuracao.SingletonConfigJDBC;
import model.Endereco;
import model.Paciente;
import org.apache.log4j.Logger;
import util.Util;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class PacienteDaoH2Imple implements IDaoGenerico<Paciente> {

    private SingletonConfigJDBC singletonConfigJDBC;
    private EnderecoDaoH2Imple enderecoDaoH2;
    final static Logger log = Logger.getLogger(PacienteDaoH2Imple.class);

    public PacienteDaoH2Imple(EnderecoDaoH2Imple enderecoDaoH2) {
        this.singletonConfigJDBC = SingletonConfigJDBC.getInstancia();
        this.enderecoDaoH2 = enderecoDaoH2;
    }

    @Override
    public Paciente salvar(Paciente paciente) {
        log.debug("Registrando paciente : " + paciente.toString());
        Connection conexao = singletonConfigJDBC.conectarComBancoDeDados();
        PreparedStatement pstmt = null;
        paciente.setEndereco(enderecoDaoH2.salvar(paciente.getEndereco()));

        String query = String.format("INSERT INTO pacientes (" +
                        " nome_paciente," +
                        " sobrenome_paciente," +
                        " rg_paciente," +
                        " data_cadastro_paciente," +
                        " id_endereco) " +
                        "VALUES ('%s','%s','%s','%s','%s');", paciente.getNome(),
                paciente.getSobrenome(), paciente.getRg(),
                Util.dateToTimestamp(paciente.getDataCadastro()),
                paciente.getEndereco().getId());


        try {
            pstmt = conexao.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
            pstmt.executeUpdate();
            ResultSet keys = pstmt.getGeneratedKeys();
            if (keys.next())
                paciente.setId(keys.getInt(1));
            pstmt.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return paciente;
    }

    @Override
    public Optional<Paciente> buscar(Integer id) {

        log.debug("Buscando paciente com id  : " + id);
        Connection conexao = singletonConfigJDBC.conectarComBancoDeDados();
        PreparedStatement pstmt = null;

        String query = String.format("SELECT " +
                "id_paciente, nome_paciente, sobrenome_paciente, rg_paciente, data_cadastro_paciente, id_endereco " +
                "FROM pacientes WHERE id_paciente = '%s';", id);

        Paciente paciente = null;
        try {
            pstmt = conexao.prepareStatement(query);
            ResultSet resultado = pstmt.executeQuery();
            while (resultado.next()) {

                paciente = criarObjetoPaciente(resultado);
            }

            pstmt.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


        return paciente != null ? Optional.of(paciente) : Optional.empty();
    }

    @Override
    public void excluir(Integer id) {

        log.debug("Excluindo paciente com id: " + id);
        Connection conexao = singletonConfigJDBC.conectarComBancoDeDados();
        PreparedStatement pstmt = null;

        String query = String.format("DELETE FROM pacientes WHERE id_paciente = '%s';", id);

        try {
            pstmt = conexao.prepareStatement(query);
            pstmt.executeUpdate();
            pstmt.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public List<Paciente> buscarTodos() {

        log.debug("Buscando todos os pacientes");
        Connection conexao = singletonConfigJDBC.conectarComBancoDeDados();
        PreparedStatement pstmt = null;

        String query = "SELECT * FROM pacientes;";

        List<Paciente> pacientes = new ArrayList<>();
        try {
            pstmt = conexao.prepareStatement(query);
            ResultSet resultado = pstmt.executeQuery();
            while (resultado.next()) {

                pacientes.add(criarObjetoPaciente(resultado));
            }

            pstmt.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return pacientes;
    }

    private Paciente criarObjetoPaciente(ResultSet result) throws SQLException {

        Integer idPaciente = result.getInt("id_paciente");
        String nome = result.getString("nome_paciente");
        String sobrenome = result.getString("sobrenome_paciente");
        String rg = result.getString("rg_paciente");
        Date dataCadastro = result.getDate("data_cadastro_paciente");
        Endereco endereco = enderecoDaoH2.buscar(result.getInt("id_endereco")).orElse(null);
        return new Paciente(idPaciente, nome, sobrenome, rg, dataCadastro, endereco);

    }
}





