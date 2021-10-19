package com.Viajar;

import java.util.ArrayList;

public class SistemaCadastro {

    private ArrayList<Voo> listaVoos;
    private ArrayList<Hotel> listaHoteis;

    public SistemaCadastro() {
        this.listaVoos =  new ArrayList<>();
        this.listaHoteis =  new ArrayList<>();
    }

    public void addVoo(Voo ...voo) {
        for(Voo v : voo) {
            listaVoos.add(v);
        }
    }

    public void addHotel(Hotel ...hotel) {
        for(Hotel h : hotel) {
            listaHoteis.add(h);
        }
    }

    public ArrayList<Voo> getListaVoos() {
        return listaVoos;
    }

    public ArrayList<Hotel> getListaHoteis() {
        return listaHoteis;
    }

    @Override
    public String toString() {
        return "SistemaCadastro{" +
                "listaVoos=" + listaVoos +
                ", listaHoteis=" + listaHoteis +
                '}';
    }
}
