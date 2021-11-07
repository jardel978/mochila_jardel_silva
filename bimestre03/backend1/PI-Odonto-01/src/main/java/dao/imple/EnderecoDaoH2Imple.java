package dao.imple;

import dao.IDaoGenerico;
import dao.configuracao.SingletonConfigJDBC;
import model.Endereco;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EnderecoDaoH2Imple implements IDaoGenerico<Endereco> {

    private SingletonConfigJDBC singletonConfigJDBC;

    public EnderecoDaoH2Imple() {
        this.singletonConfigJDBC = SingletonConfigJDBC.getInstancia();
    }

    @Override
    public Endereco salvar(Endereco endereco) {
        Connection conexao = singletonConfigJDBC.conectarComBancoDeDados();
        PreparedStatement pstmt = null;
        String query = String.format("INSERT INTO enderecos (" +
                        " rua_endereco," +
                        " numero_endereco," +
                        " bairro_endereco, " +
                        " cidade_endereco," +
                        " estado_endereco) VALUES ('%s','%s','%s','%s', '%s');", endereco.getRua(),
                endereco.getNumero(), endereco.getBairro(), endereco.getCidade(), endereco.getEstado());
        try {
            pstmt = conexao.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
            pstmt.executeUpdate();
            ResultSet keys = pstmt.getGeneratedKeys();
            if(keys.next())
                endereco.setId(keys.getInt(1));
            pstmt.close();
            conexao.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return endereco;
    }

    @Override
    public Optional<Endereco> buscar(Integer id) {
        Connection conexao = singletonConfigJDBC.conectarComBancoDeDados();
        PreparedStatement pstmt = null;

        String query = String.format("SELECT " +
                " id_endereco, rua_endereco, numero_endereco, bairro_endereco, cidade_endereco, estado_endereco" +
                " FROM enderecos WHERE id_endereco = '%s';", id);

        Endereco endereco = null;
        try {
            pstmt = conexao.prepareStatement(query);
            ResultSet resultado = pstmt.executeQuery();
            while (resultado.next()) {
                endereco = criarObjetoEndereco(resultado);
            }

            pstmt.close();
            conexao.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return  endereco != null ? Optional.of(endereco) : Optional.empty();
    }

    @Override
    public void excluir(Integer id) {
        Connection conexao = singletonConfigJDBC.conectarComBancoDeDados();
        PreparedStatement pstmt = null;

        String query = String.format("DELETE FROM enderecos WHERE id_endereco = '%s';", id);

        try {
            pstmt = conexao.prepareStatement(query);
            pstmt.executeUpdate();
            pstmt.close();
            conexao.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    @Override
    public List<Endereco> buscarTodos() {
        Connection conexao = singletonConfigJDBC.conectarComBancoDeDados();
        PreparedStatement pstmt = null;

        String query = "SELECT * FROM enderecos;";

        List<Endereco> enderecos = new ArrayList<>();
        try {
            pstmt = conexao.prepareStatement(query);
            ResultSet result = pstmt.executeQuery();
            while (result.next()) {

                enderecos.add(criarObjetoEndereco(result));

            }

            pstmt.close();
            conexao.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return enderecos;
    }

    private Endereco criarObjetoEndereco(ResultSet resultado) throws SQLException {
        Integer id = resultado.getInt("id_endereco");
        String rua = resultado.getString("rua_endereco");
        String numero = resultado.getString("numero_endereco");
        String bairro = resultado.getString("bairro_endereco");
        String cidade = resultado.getString("cidade_endereco");
        String estado = resultado.getString("estado_endereco");
        return new Endereco(id, rua, numero, bairro, cidade, estado);
    }
}



