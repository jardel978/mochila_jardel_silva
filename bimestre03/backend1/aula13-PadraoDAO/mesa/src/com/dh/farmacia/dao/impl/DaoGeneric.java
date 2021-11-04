package com.dh.farmacia.dao.impl;

import com.dh.farmacia.dao.DataSource;
import com.dh.farmacia.dao.IGenericDao;
import com.dh.farmacia.exception.CommitException;
import com.dh.farmacia.exception.NoDataException;
import com.dh.farmacia.model.Medicamento;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoGeneric<T, K> implements IGenericDao<T, K> {

    private final DataSource dataSource;
    private final Connection con;
    private PreparedStatement pstm = null;

    public DaoGeneric() {
        this.dataSource = DataSource.getInstancia();
        this.con = dataSource.getConnection();
    }

//    @Override
//    public boolean adicionar(T entidade) {
//        String query = "INSERT INTO MEDICAMENTOS (id, codigo, laboratorio, quantidade, preco)" +
//                "VALUES(?, ?, ?, ?, ?, ?)";
//
//        try{
//            pstm = con.prepareStatement(query);
//            pstm.
//
//        } catch (SQLException ex) {
//            System.err.println("Erro ao buscar lista de medicamentos. " + ex.getMessage());
//        }
//
//        return true;
//    }

//    @Override
//    public T pesquisar(K id) {
//        String query = "SELECT * FROM MEDICAMENTOS WHERE id = ?";
//
//        try{
//            pstm = con.prepareStatement(query);
//            pstm.setInt(1, (int) id);
//            ResultSet resultado = pstm.executeUpdate();
//
//
//        } catch (SQLException ex) {
//            System.err.println("Erro ao excluir medicamento. " + ex.getMessage());
//        }
//        return null;
//    }

//    @Override
//    public boolean salvar(T entidade) {
//        return false;
//    }

    @Override
    public boolean remover(K id) throws NoDataException {
            String query = "DELETE FROM MEDICAMENTOS WHERE id = ?";

            try{
                pstm = con.prepareStatement(query);
                pstm.setInt(1, (Integer) id);
                pstm.executeUpdate();

                return true;

            } catch (SQLException ex) {
                System.err.println("Erro ao excluir medicamento. " + ex.getMessage());
                return false;
            }
    }

//    @Override
//    public void commit() throws CommitException {
//
//    }

    public DataSource getDataSource() {
        return dataSource;
    }


    public Connection getCon() {
        return con;
    }


    public PreparedStatement getPstm() {
        return pstm;
    }

}
