package com.dh.farmacia.dao.impl;

import com.dh.farmacia.dao.DataSource;
import com.dh.farmacia.dao.IMedicamentoDao;
import com.dh.farmacia.model.Medicamento;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MedicamentoDaoImpl extends DaoGeneric<Medicamento, Integer> implements IMedicamentoDao {

    private Connection con;
    private PreparedStatement pstm = null;

    public MedicamentoDaoImpl() {
        this.con = super.getCon();
    }

    //desnecessário chamar/reescrever métodos da superclasse uma vez que usei o DAO genérico e herança.

    public ArrayList<Medicamento> listarMedicamentos() throws SQLException{

        String query = "SELECT * FROM MEDICAMENTOS;";
        ArrayList<Medicamento> listaMedicamentos = new ArrayList<>();
        try{
            pstm = con.prepareStatement(query);
            ResultSet resultado = pstm.executeQuery();

            while (resultado.next()) {
                Medicamento medicamento = new Medicamento();
                medicamento.setId(resultado.getInt("id"));
                medicamento.setCodigo(resultado.getString("codigo"));
                medicamento.setNome(resultado.getString("nome"));
                medicamento.setLaboratorio(resultado.getString("laboratorio"));
                medicamento.setQuantidade(resultado.getInt("quantidade"));
                medicamento.setPreco(resultado.getDouble("preco"));

                listaMedicamentos.add(medicamento);
        }

        } catch (SQLException ex) {
            System.err.println("Erro ao buscar lista de medicamentos. " + ex.getMessage());
        }

        return listaMedicamentos;
    }

    public Medicamento pesquisar(Integer id) {
        String query = "SELECT * FROM MEDICAMENTOS WHERE id = ?";
        Medicamento medicamento = new Medicamento();

        try{
            pstm = con.prepareStatement(query);
            pstm.setInt(1, id);

            ResultSet resultado = pstm.executeQuery();
            while (resultado.next()) {
                medicamento.setId(resultado.getInt("id"));
                medicamento.setCodigo(resultado.getString("codigo"));
                medicamento.setNome(resultado.getString("nome"));
                medicamento.setLaboratorio(resultado.getString("laboratorio"));
                medicamento.setQuantidade(resultado.getInt("quantidade"));
                medicamento.setPreco(resultado.getDouble("preco"));
            }
        } catch (SQLException ex) {
            System.err.println("Erro ao excluir medicamento. " + ex.getMessage());
        }
        return medicamento;
    }

    public boolean adicionar(Medicamento medicamento) {
        String query = "INSERT INTO MEDICAMENTOS (codigo, nome, laboratorio, quantidade, preco)" +
                "VALUES(?, ?, ?, ?, ?)";

        try{
            pstm = con.prepareStatement(query);
            pstm.setString(1, medicamento.getCodigo());
            pstm.setString(2, medicamento.getNome());
            pstm.setString(3, medicamento.getLaboratorio());
            pstm.setInt(4, medicamento.getQuantidade());
            pstm.setDouble(5, medicamento.getPreco());
            pstm.executeUpdate();

            return true;

        } catch (SQLException ex) {
            System.err.println("Erro ao adicionar medicamento. " + ex.getMessage());
            return false;
        }
    }

    public boolean alterar(Medicamento medicamento) {
        String query = "UPDATE MEDICAMENTOS SET codigo = ?, nome = ?, laboratorio = ?, quantidade = ?, preco = ?" +
                "WHERE id = ?;";

        try{
            pstm = con.prepareStatement(query);
            pstm.setString(1, medicamento.getCodigo());
            pstm.setString(2, medicamento.getNome());
            pstm.setString(3, medicamento.getLaboratorio());
            pstm.setInt(4, medicamento.getQuantidade());
            pstm.setDouble(5, medicamento.getPreco());
            pstm.setInt(6, medicamento.getId());
            pstm.executeUpdate();

            return true;

        } catch (SQLException ex) {
            System.err.println("Erro ao atualizar medicamento. " + ex.getMessage());
            return false;
        }
    }

}
