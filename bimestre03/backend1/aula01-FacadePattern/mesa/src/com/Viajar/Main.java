package com.Viajar;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        SistemaCadastro sistemaCadastroViajar = new SistemaCadastro();
        FacadeViajar facadeViajar = new FacadeViajar(sistemaCadastroViajar);

        System.out.println("Pesquisa sem dados cadastrados");
        facadeViajar.buscar("Rio de Janeiro", LocalDate.of(2021, 12, 20), LocalDate.of(2021, 12, 29));


//        Adicionando Voos e Hoteis ao sistema

        Voo vooRj01 = new Voo(LocalDate.of(2021, 12, 20), LocalDate.of(2021, 12, 29), "Belo Horizonte", "Rio de Janeiro");
        Voo vooRj02 = new Voo(LocalDate.of(2021, 12, 22), LocalDate.of(2022, 12, 02), "Belo Horizonte", "Rio de Janeiro");
        Voo vooPs01 = new Voo(LocalDate.of(2021, 12, 26), LocalDate.of(2022, 01, 07), "Belo Horizonte", "Porto Seguro");
        sistemaCadastroViajar.addVoo(vooRj01, vooRj02, vooPs01);


        Hotel copacabanaPalace = new Hotel(LocalDate.of(2021, 12, 20), LocalDate.of(2021, 12, 29), "Rio de Janeiro", "Copacabana Palace");
        Hotel villaMiola = new Hotel(LocalDate.of(2021, 12, 26), LocalDate.of(2022, 01, 07), "Porto Seguro", "Villa Miola");
        sistemaCadastroViajar.addHotel(copacabanaPalace, villaMiola);

        System.out.println("\n Nova pesquisa com voo e hotel cadastrado");
        facadeViajar.buscar("Rio de Janeiro", LocalDate.of(2021, 12, 20), LocalDate.of(2021, 12, 29));
        facadeViajar.buscar("Porto Seguro", LocalDate.of(2021, 12, 26), LocalDate.of(2022, 01, 07));

    }
}
