package com.Viajar;

import java.util.ArrayList;

public class ApiVoos {

    public ArrayList<Voo> buscarVoo(SistemaCadastro sistemaCadastro) {
        return sistemaCadastro.getListaVoos();
    }
}
