package exProposto;

import java.sql.*;
import java.time.LocalDate;
import java.util.Random;


public class Main {

    public static void main(String[] args) throws SQLException {
        DataSource dataSource = DataSource.getInstance();

        Connection connection = dataSource.getConnection();
        Statement stmt = connection.createStatement();

        String createTable = "DROP TABLE IF EXISTS EMPLOYEE; \n" + "CREATE TABLE EMPLOYEE(ID INT PRIMARY KEY, " +
                "NOME VARCHAR(255), IDADE INT, EMPRESA VARCHAR(30), DATA DATE)";
        stmt.execute(createTable);

        Random random = new Random();
        Employee jardel = new Employee(random.nextInt(100), "Jardel", 24, "Digital House", LocalDate.of(2022,04,04));
        Employee carlos = new Employee(random.nextInt(100), "Carlos", 36, "Google", LocalDate.of(2019,10,12));
        Employee camila = new Employee(random.nextInt(100), "Camila", 27, "Facebook", LocalDate.of(2020,05,20));

        String jardelInsertSql = inserirDadosTabela(jardel);
        String carlosInsertSql = inserirDadosTabela(carlos);
        String camilaInsertSql = inserirDadosTabela(camila);
        stmt.execute(jardelInsertSql);
        stmt.execute(carlosInsertSql);
        stmt.execute(camilaInsertSql);


//        String insertSql =
//                "INSERT INTO EMPLOYEE VALUES(" + random.nextInt(100) + ", 'Jardel', 24, 'Digital House', '2022-04-04');\n" +
//                "INSERT INTO EMPLOYEE VALUES(" + random.nextInt(100) + ", 'Carlos', 36, 'Google', '2019-10-12');\n" +
//                "INSERT INTO EMPLOYEE VALUES(" + random.nextInt(100) + ", 'Camila', 27, 'Facebook', '2020-05-20');\n";
//        stmt.execute(insertSql);


        String sqlConsulta = "SELECT * FROM EMPLOYEE";
        ResultSet rd = stmt.executeQuery(sqlConsulta);
        while(rd.next()) {
            System.out.println("id: " + rd.getInt(1) + ", Nome: " + rd.getString(2) +
                    ", Idade: " + rd.getString(3) + ", Empresa: " + rd.getString(4) +
                    ", Data de Entrada: " + rd.getString(5).replaceAll("-", "/"));
        }

        dataSource.closeConectionDataSource();
    }

    public static String inserirDadosTabela(Employee emp) {
        return "INSERT INTO EMPLOYEE VALUES(" + emp.getID() + ", '" +  emp.getNome() + "', " + emp.getIdade() +
                ", '" + emp.getEmpresa() + "', '" + emp.getData().toString() + "');\n";
    }
}
