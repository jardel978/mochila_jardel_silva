package com.Viajar;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class FacadeViajar implements IFacadeViajar {

    private ApiVoos apiVoos;
    private ApiHoteis apiHoteis;
    private SistemaCadastro sistemaCadastro;

    public FacadeViajar(SistemaCadastro sistemaCadastro) {
        this.apiVoos = new ApiVoos();
        this.apiHoteis = new ApiHoteis();
        this.sistemaCadastro = sistemaCadastro;
    }

    @Override
    public void buscar(String destino, LocalDate dataIda, LocalDate dataVolta) {

        ArrayList<Voo> voosDisponiveis = apiVoos.buscarVoo(sistemaCadastro);
        ArrayList<Hotel> hoteisDisponiveis = apiHoteis.buscarHotel(sistemaCadastro);

        if (voosDisponiveis.size() > 0) {
            for (Voo voo : voosDisponiveis) {
                if (voo.getDestino().equalsIgnoreCase(destino) && voo.getDataPartida().equals(dataIda) && voo.getDataRetorno().equals(dataVolta)) {
                    System.out.println("=================== Viajar.com ===================");
                    System.out.println("Voo Disponível para " + destino + " de acordo com as datas escolhidas: " + voo);

                    if (hoteisDisponiveis.size() > 0) {
                        for (Hotel hotel : hoteisDisponiveis) {
                            if (hotel.getCidade().equalsIgnoreCase(voo.getDestino()) && hotel.getDataEntrada().equals(dataIda) && hotel.getDataSaida().equals(dataVolta)) {
                                System.out.println("Hotel disponível em " + destino + " de acordo com as datas escolhidas: " + hotel);
                                System.out.println("==================================================\n");
                            }
                        }
                    }
                }
            }
        } else
            System.out.println("Sem voos ou hotéis disponíveis para " + destino);

    }
}