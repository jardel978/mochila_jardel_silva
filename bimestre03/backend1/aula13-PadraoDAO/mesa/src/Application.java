package com.dh.farmacia.view;

import com.dh.farmacia.dao.impl.MedicamentoDaoImpl;
import com.dh.farmacia.exception.NoDataException;
import com.dh.farmacia.model.Medicamento;

import java.sql.SQLException;

public class Application {

    public static void main(String[] args) throws ClassNotFoundException, NoDataException {

        Class.forName("org.h2.Driver");
        Medicamento dipirona = new Medicamento("789654123", "Dipirona", "TEUTO", 50, 2.0);
        Medicamento torsilax = new Medicamento("123654789", "Torsilax", "NEO QUÍMICA", 30, 7.50);

        MedicamentoDaoImpl medicamentoDao = new MedicamentoDaoImpl();

        medicamentoDao.adicionar(dipirona);
        medicamentoDao.adicionar(torsilax);

        try {
            System.out.println(medicamentoDao.listarMedicamentos());
        } catch (SQLException exception) {
            exception.printStackTrace();
        }

        System.out.println(medicamentoDao.pesquisar(2));
        System.out.println(medicamentoDao.pesquisar(7));
        medicamentoDao.remover(3);

        try {
            System.out.println(medicamentoDao.listarMedicamentos());
        } catch (SQLException exception) {
            exception.printStackTrace();
        }

    }

}
