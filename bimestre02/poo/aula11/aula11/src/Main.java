import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        // Impressora impressora = new Impressora() { Casting implicito}
        //impressora não pode ser instanciado por ser abstrata

        Impressora impressora = new ImpressoraEpson("xx", "w-fi", LocalDate.of(2005, 5, 21), 10, 50);
        impressora = new ImpressoraCannon("cc150", "cabo", LocalDate.of(2006, 7, 17), 20, 30);
        //dando à impressora novas características de Impressoras Cannon
    }
}

