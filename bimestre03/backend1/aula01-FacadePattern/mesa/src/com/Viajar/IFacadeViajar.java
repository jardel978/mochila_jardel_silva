package com.Viajar;

import java.time.LocalDate;
import java.util.Date;

public interface IFacadeViajar {

    public void buscar(String destino, LocalDate dataIda, LocalDate dataVolta);

}
