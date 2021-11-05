package br.com.dh.odontologia.dao.configuracao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataSource {

    private String jdbcDriver;
    private String dbUrl;
    private String nomeUsuario;
    private String senhaDb;
    private static DataSource instancia;

//    public DataSource(String jdbcDriver, String dbUrl, String nomeUsuario, String senhaDb) {
//        this.jdbcDriver = jdbcDriver;
//        this.dbUrl = dbUrl;
//        this.nomeUsuario = nomeUsuario;
//        this.senhaDb = senhaDb;
//    }

    private DataSource() {
        this.jdbcDriver = "org.h2.Driver";
//        this.dbUrl = "jdbc:h2:~/clinica; DB_CLOSE_DELAY=-1; INIT=RUNSCRIPT FROM 'DATA.SQL'";
        this.dbUrl = "jdbc:h2:tcp://localhost/~/test;DB_CLOSE_DELAY=-1;INIT=RUNSCRIPT FROM" +
                "'~/Documents/curso_ctd/mochila_jardel_silva/bimestre03/backend1/aula15-PIpacientes/data.sql';";
        this.nomeUsuario = "sa";
        this.senhaDb = "";
    }

    public static DataSource getInstancia() {
        if(instancia == null)
            instancia = new DataSource();

        return instancia;
    }

    public Connection conectarComBancoDeDados() {

        Connection con = null;
        try {
            con = DriverManager.getConnection(dbUrl, nomeUsuario, senhaDb);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

}
