package dao.configuracao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingletonConfigJDBC {


    private String jdbcDriver;
    private String dbUrl;
    private String nomeUsuario;
    private String senhaDb;
    private static SingletonConfigJDBC instancia;

    private SingletonConfigJDBC() {
        this.jdbcDriver = "org.h2.Driver";
//        this.dbUrl = "jdbc:h2:~/clinica;DB_CLOSE_DELAY=-1;INIT=RUNSCRIPT FROM 'DATA.SQL';";
        this.dbUrl = "jdbc:h2:tcp://localhost/~/test;DB_CLOSE_DELAY=-1;INIT=RUNSCRIPT FROM" +
                "'~/Documents/curso_ctd/mochila_jardel_silva/bimestre03/backend1/PI-Odonto-01/data.sql';";
        this.nomeUsuario = "sa";
        this.senhaDb = "";
    }

    public static SingletonConfigJDBC getInstancia() {
        if(instancia == null)
            instancia = new SingletonConfigJDBC();

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

