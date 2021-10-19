package com.Viajar;

import java.time.LocalDate;
import java.util.Date;

public class Hotel {

    private LocalDate dataEntrada;
    private LocalDate dataSaida;
    private String cidade;
    private String nome;

    public Hotel(LocalDate dataEntrada, LocalDate dataSaida, String cidade, String nome) {
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.cidade = cidade;
        this.nome = nome;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public LocalDate getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(LocalDate dataSaida) {
        this.dataSaida = dataSaida;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "dataEntrada=" + dataEntrada +
                ", dataSaida=" + dataSaida +
                ", cidade='" + cidade + '\'' +
                '}';
    }
}
