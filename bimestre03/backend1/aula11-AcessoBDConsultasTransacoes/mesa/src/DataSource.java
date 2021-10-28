import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DataSource {//usando padrão Singleton para criação da classe de conexão com o Banco de Dados

    private static DataSource instancia;

    private String url;
    private String port;
    private String dataBase;
    private String hostName;
    private String userName;
    private String password;

    private Connection connection;

    private DataSource() {//construtor
        try {
            this.port = "8082";
            this.dataBase = "~/test";
            this.hostName = "localhost";
            this.userName = "sa";
            this.password = "";
            this.url = "jdbc:h2:tcp://" + hostName + "/" + dataBase;
            this.connection = DriverManager.getConnection(url, userName, password);
        } catch (SQLException ex) {
            System.err.println("ERRO na conexão..." + ex.getMessage());
        } catch (Exception ex) {
            System.err.println("ERRO: " + ex.getMessage());
        }
    }

    public static DataSource getInstance() {//método que permite criação e dá acesso a apenas uma instância dessa classe
        if(instancia == null)
            instancia = new DataSource();

        return instancia;
    }

    public void closeConectionDataSource() {//método que encerra a conexão com o Banco de Dados
        try {
            this.connection.close();
            System.out.println("\nBanco de Dados desconectado.");
        } catch (Exception ex) {
            System.err.println("Erro ao desconectar com o Banco de Dados." + ex.getMessage());
        }
    }

    public Connection getConnection() {//método que retorna a conexão
        return connection;
    }
}
