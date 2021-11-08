package dao.imple;

import dao.IDaoGenerico;
import dao.configuracao.SingletonConfigJDBC;
import model.Dentista;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DentistaDaoH2Imple implements IDaoGenerico<Dentista> {

        private SingletonConfigJDBC singletonConfigJDBC;
        final static Logger log = Logger.getLogger(DentistaDaoH2Imple.class);

    public DentistaDaoH2Imple() {
        this.singletonConfigJDBC = SingletonConfigJDBC.getInstancia();
    }

    @Override
    public Dentista salvar(Dentista dentista) {

        log.debug("Registrando dentista : " + dentista.toString());
        Connection conexao = singletonConfigJDBC.conectarComBancoDeDados();
        PreparedStatement pstmt = null;

        String query = String.format("INSERT INTO dentistas (" +
                        " numero_matricula_dentista," +
                        " nome_dentista," +
                        " sobrenome_dentista) " +
                        " VALUES ('%s','%s','%s');",
                        dentista.getNumMatricula(),
                        dentista.getNome(),
                        dentista.getSobrenome());

        try {
            pstmt = conexao.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
            pstmt.executeUpdate();
            ResultSet keys = pstmt.getGeneratedKeys();
            if(keys.next())
                dentista.setId(keys.getInt(1));
            pstmt.close();
            conexao.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return dentista;
    }

    @Override
    public Optional<Dentista> buscar(Integer id) {

        log.debug("Buscando dentista com id  : " + id + "...");
        Connection conexao = singletonConfigJDBC.conectarComBancoDeDados();
        PreparedStatement pstmt = null;

        String query = String.format("SELECT " +
                " id_dentista," +
                " numero_matricula_dentista," +
                " nome_dentista," +
                " sobrenome_dentista " +
                " FROM dentistas WHERE id_dentista = '%s';", id);

        Dentista dentista = null;
        try {
            pstmt = conexao.prepareStatement(query);
            ResultSet resultado = pstmt.executeQuery();
            while (resultado.next()) {
                dentista = criarObjetoDentista(resultado);
            }

            pstmt.close();
            conexao.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return  dentista != null ? Optional.of(dentista) : Optional.empty();
    }

    @Override
    public void excluir(Integer id) {

        log.debug("Excluindo dentista com id: " + id + "...");
        Connection conexao = singletonConfigJDBC.conectarComBancoDeDados();
        PreparedStatement pstmt = null;

        String query = String.format("DELETE FROM dentistas WHERE id_dentista = '%s';", id);

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
    public List<Dentista> buscarTodos() {

        log.debug("Buscando todos os dentistas...");
        Connection conexao = singletonConfigJDBC.conectarComBancoDeDados();
        PreparedStatement pstmt = null;

        String query = "SELECT * FROM dentistas;";

        List<Dentista> dentistas = new ArrayList<>();

        try {

            pstmt = conexao.prepareStatement(query);
            ResultSet result = pstmt.executeQuery();

            while (result.next()) {

                dentistas.add(criarObjetoDentista(result));

            }

            pstmt.close();
            conexao.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return dentistas;
    }

    private Dentista criarObjetoDentista(ResultSet resultado) throws SQLException {
        Integer id = resultado.getInt("id_dentista");
        String numMatricula = resultado.getString("numero_matricula_dentista");
        String nome = resultado.getString("nome_dentista");
        String sobrenome = resultado.getString("sobrenome_dentista");
        return new Dentista(id, numMatricula, nome, sobrenome);
    }

}
