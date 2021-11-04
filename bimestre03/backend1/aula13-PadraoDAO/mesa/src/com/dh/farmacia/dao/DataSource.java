package com.dh.farmacia.dao;

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

    public DataSource() {
        try{
            this.dataBase = "~/test";
            this.hostName = "localhost";
            this.userName = "sa";
            this.password = "";
            this.url = "jdbc:h2:tcp://" + hostName + "/" + dataBase;
            this.connection = DriverManager.getConnection(url, userName, password);
            System.out.println("Conectado ao Banco de Dados.");
        } catch (SQLException ex) {
            System.err.println("ERROR na Conexão " + ex.getMessage());
        } catch (Exception ex) {
            System.err.println("Erro geral " + ex.getMessage());
        }
    }

    public static DataSource getInstancia() {
        if(instancia == null)
            instancia = new DataSource();

        return instancia;
    }

    public void closeConnectionDataSource() {
        try {
            connection.close();
            System.out.println("Conexão encerrada!");
        } catch (Exception ex) {
            System.err.println("Erro ao encerrar conexão com Banco de Dados. " + ex.getMessage());
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
