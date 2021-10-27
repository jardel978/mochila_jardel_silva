import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.util.ArrayList;

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {

        BasicConfigurator.configure();

        ListaInteiros listaInteirosUm = new ListaInteiros(5, 10, 20, 5, 10, 10);
        ListaInteiros listaInteirosDois = new ListaInteiros(5, 10, 20, 5, 10, 10, 7, 15, 1, 12, 28, 4, 6 , 10);
        ListaInteiros listaInteirosTres = new ListaInteiros();

        try {
            listaInteirosUm.verificarLista();
            listaInteirosDois.verificarLista();
            listaInteirosTres.verificarLista();
        }catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        listaInteirosUm.calcularMedia();
        listaInteirosUm.maxMin();

        listaInteirosDois.calcularMedia();
        listaInteirosDois.maxMin();

        listaInteirosTres.calcularMedia();
        listaInteirosTres.maxMin();

    }

}
