package exProposto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataSource {

    private String url;
    private String userName;
    private String password;
    private Connection connection;
    private static DataSource instancia;

    private DataSource() {
        try{
            this.url = "jdbc:h2:tcp://localhost/~/test";
            this.userName = "sa";
            this.password = "";
            this.connection = DriverManager.getConnection(url, userName, password);
            System.out.println("Conectado ao Banco de Dados.");
        }
        catch (SQLException ex) {
            System.err.println("ERROR na Conexão " + ex.getMessage());
        } catch (Exception ex) {
            System.err.println("Erro geral " + ex.getMessage());
        }
    }

    public static DataSource getInstance() {
        if (instancia == null)
            instancia = new DataSource();

        return instancia;
    }

    public void closeConectionDataSource() {
        try {
            this.connection.close();
            System.out.println("Banco de Dados Desconectado.");
        } catch (Exception ex) {
            System.err.println("ERRO ao desconectar." + ex.getMessage());
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
