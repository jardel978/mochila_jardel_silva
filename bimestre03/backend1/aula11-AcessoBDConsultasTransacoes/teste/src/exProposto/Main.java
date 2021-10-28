package exProposto;

import java.sql.*;


public class Main {

    public static void main(String[] args) throws SQLException {
        DataSource dataSource = DataSource.getInstance();

        Connection connection = dataSource.getConnection();
        Statement stmt = connection.createStatement();

        String createTable = "DROP TABLE IF EXISTS EMPLOYEE; \n" + "CREATE TABLE EMPLOYEE(ID INT PRIMARY KEY, " +
                "NOME VARCHAR(255), IDADE INT, EMPRESA VARCHAR(30), DATA DATE)";
        stmt.execute(createTable);

        String insertSql =
                "INSERT INTO EMPLOYEE VALUES(1, 'Jardel', 24, 'Digital House', '2022-04-04');\n" +
                "INSERT INTO EMPLOYEE VALUES(2, 'Carlos', 36, 'Google', '2019-10-12');\n" +
                "INSERT INTO EMPLOYEE VALUES(3, 'Jardel', 24, 'Facebook', '2020-05-20');\n";
        stmt.execute(insertSql);


        String sqlConsulta = "SELECT * FROM EMPLOYEE";

        ResultSet rd = stmt.executeQuery(sqlConsulta);
        while(rd.next()) {
            System.out.println("id: " + rd.getInt(1) + ", Nome: " + rd.getString(2) +
                    ", Idade: " + rd.getString(3) + ", Empresa: " + rd.getString(4) +
                    ", Data de Entrada: " + rd.getString(5).replaceAll("-", "/"));
        }

        dataSource.closeConectionDataSource();
    }
}
