import java.sql.*;
import java.util.Random;

public class App {

    public static void main(String[] args) throws Exception{

        Class.forName("org.h2.Driver");
        DataSource dataSource = DataSource.getInstance();

        Connection connection = dataSource.getConnection();
        Statement statement = connection.createStatement();

        String sqlCreateTable = "DROP TABLE IF EXISTS FIGURA; CREATE TABLE FIGURA(id INT PRIMARY " +
                "KEY, figura VARCHAR(20), cor VARCHAR(15));";
        statement.execute(sqlCreateTable);


        System.out.println(gerarId());
        System.out.println(gerarId());
        System.out.println(gerarId());

        Figura cir01 = new Figura(gerarId(), "Circulo", "Vermelho");
        Figura cir02 = new Figura(gerarId(), "Circulo", "Azul");
        Figura quad01 = new Figura(gerarId(), "Quadrado", "Verde");
        Figura quad02 = new Figura(gerarId(), "Quadrado", "Amarelo");
        Figura quad03 = new Figura(gerarId(), "Quadrado", "Rosa");

        inserirDadosTabela(cir01, statement);
        inserirDadosTabela(cir02, statement);
        inserirDadosTabela(quad01, statement);
        inserirDadosTabela(quad02, statement);
        inserirDadosTabela(quad03, statement);

        consultarTabelaPorCor(statement, "Vermelho");
        System.out.println("\n-----------------Consultando todos os dados da tabela-----------------");
        consultarTabelaGeral(statement, "Figura");

        dataSource.closeConectionDataSource();


    }

    public static int gerarId() {
        Random random = new Random();
        int count = random.nextInt(100);
        return count;
    }

    public static void inserirDadosTabela(Figura figura, Statement statement) throws SQLException{
        try {
            String sqlInsert = "INSERT INTO FIGURA VALUES(" + figura.getID() + ", '" + figura.getFigura().toLowerCase() +
                    "', '" + figura.getCor().toLowerCase() + "');";
            statement.execute(sqlInsert);
            System.out.println("Informações guardadas com sucesso!");
        } catch (SQLException ex) {
            System.err.println("ERRO ao tentar guardar informações. " + ex.getMessage());
        }
    }

    public static void consultarTabelaGeral(Statement statement, String nomeTabela) throws SQLException{
        try {
            String query = "SELECT * FROM " + nomeTabela.toLowerCase() + ";";
            System.out.println("Buscando informações em nosso Banco de Dados...");
            ResultSet resultSet = statement.executeQuery(query);
            System.out.println("Tabela: " + nomeTabela.toUpperCase());

            while (resultSet.next()) {
                System.out.println(
                        "id: " + resultSet.getInt(1) +
                                ", figura: " + resultSet.getString(2) +
                                        ", cor: " + resultSet.getString(3));
            }
        } catch (SQLException ex) {
            System.err.println("ERRO ao tentar consultar informação. " + ex.getMessage());
        }
    }

    public static void consultarTabelaPorCor(Statement statement, String cor) throws SQLException{
        try {
            String query = "SELECT id, figura, cor FROM FIGURA WHERE `cor` = '" + cor.toLowerCase() + "';";
            System.out.println("Buscando informação em nosso Banco de Dados...");
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                System.out.println(
                        "id: " + resultSet.getInt(1) +
                                ", figura: " + resultSet.getString(2) +
                                        ", cor: " + resultSet.getString(3));
            }
        } catch (SQLException ex) {
            System.err.println("ERRO ao tentar consultar informação. " + ex.getMessage());
        }
    }
}
