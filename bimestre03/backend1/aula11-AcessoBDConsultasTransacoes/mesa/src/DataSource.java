import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DataSource {

    private String url;
    private String port;
    private String dataBase;
    private String hostName;
    private String userName;
    private String password;

    private Connection connection;
    private static DataSource instancia;

    private DataSource() {
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

    public static DataSource getInstance() {
        if(instancia == null)
            instancia = new DataSource();

        return instancia;
    }

    public void closeConectionDataSource() {
        try {
            this.connection.close();
            System.out.println("Banco de Dados desconectado.");
        } catch (Exception ex) {
            System.err.println("Erro ao desconectar com o Banco de Dados." + ex.getMessage());
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
