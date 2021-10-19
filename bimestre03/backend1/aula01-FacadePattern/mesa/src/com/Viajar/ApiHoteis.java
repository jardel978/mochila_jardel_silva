package com.Viajar;

import java.util.ArrayList;

public class ApiHoteis {

    public ArrayList<Hotel> buscarHotel(SistemaCadastro sistemaCadastro) {
        return sistemaCadastro.getListaHoteis();
    }

}

