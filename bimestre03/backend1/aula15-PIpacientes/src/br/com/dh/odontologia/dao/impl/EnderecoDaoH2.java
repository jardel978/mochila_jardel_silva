package br.com.dh.odontologia.dao.impl;

import br.com.dh.odontologia.dao.IDao;
import br.com.dh.odontologia.dao.configuracao.DataSource;
import br.com.dh.odontologia.model.Endereco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EnderecoDaoH2 implements IDao<Endereco> {

    private DataSource dataSource;

    public EnderecoDaoH2() {
        this.dataSource = DataSource.getInstancia();
    }

    @Override
    public Endereco salvar(Endereco endereco) {

        Connection connection = dataSource.conectarComBancoDeDados();
        PreparedStatement pstmt = null;

        String query = "INSERT INTO enderecos (" +
                " rua_endereco," +
                " numero_endereco," +
                " bairro_endereco, " +
                " cidade_endereco," +
                " estado_endereco)" +
                " VALUES (?, ?, ?, ?, ?)";

        try {

            pstmt = connection.prepareStatement(query);
            pstmt.setString(1, endereco.getRua());
            pstmt.setString(2, endereco.getNumero());
            pstmt.setString(3, endereco.getBairro());
            pstmt.setString(4, endereco.getCidade());
            pstmt.setString(5, endereco.getEstado());
            pstmt.executeUpdate();

            System.out.println("Endereço salvo com sucesso.");
            pstmt.close();
            connection.close();

        } catch (SQLException exception) {
            exception.printStackTrace();
        }

        return endereco;
    }

    @Override
    public Optional<Endereco> buscar(Integer id) {

        Connection connection = dataSource.conectarComBancoDeDados();
        PreparedStatement pstmt = null;
        Endereco enderecoBuscado = null;

        String query = "SELCET * FROM enderecos WHERE id = ?";

        try {

            pstmt = connection.prepareStatement(query);
            pstmt.setInt(1, id);

            ResultSet resultado = pstmt.executeQuery();
            while (resultado.next()) {

                enderecoBuscado = criarEndereco(resultado);

            }
            pstmt.close();
            connection.close();

        } catch (SQLException exception) {
            exception.printStackTrace();
        }

        return enderecoBuscado != null ? Optional.of(enderecoBuscado) : Optional.empty();
    }

    @Override
    public void excluir(Integer id) {

        Connection connection = dataSource.conectarComBancoDeDados();
        PreparedStatement pstmt = null;

        String query = "DELETE FROM enderecos WHERE id = ?";

        try {

            pstmt = connection.prepareStatement(query);
            pstmt.setInt(1, id);
            pstmt.executeUpdate();

            System.out.println("Endereco excluído com sucesso.");
            pstmt.close();
            connection.close();

        } catch (SQLException exception) {
            exception.printStackTrace();
        }

    }

    @Override
    public List<Endereco> buscarTodos() {

        Connection connection = dataSource.conectarComBancoDeDados();
        PreparedStatement pstmt = null;

        String query = "DELETE FROM enderecos WHERE id_endereco = ?";

        ArrayList<Endereco> listaEnderecos = new ArrayList<>();

        try {

            pstmt = connection.prepareStatement(query);
            ResultSet resultado = pstmt.executeQuery();

            while (resultado.next()) {

                listaEnderecos.add(criarEndereco(resultado));

            }
            pstmt.close();
            connection.close();

        } catch (SQLException exception) {
            exception.printStackTrace();
        }

        return null;
    }

    private Endereco criarEndereco(ResultSet resultado) throws SQLException {

        Endereco enderecoBuscado = new Endereco();
        enderecoBuscado.setId(resultado.getInt("id_endereco"));
        enderecoBuscado.setRua(resultado.getString("rua_endereco"));
        enderecoBuscado.setNumero(resultado.getString("numero_endereco"));
        enderecoBuscado.setBairro(resultado.getString("bairro_endereco"));
        enderecoBuscado.setCidade(resultado.getString("cidade_endereco"));
        enderecoBuscado.setEstado(resultado.getString("estado_endereco"));

        return enderecoBuscado;
    }

}
