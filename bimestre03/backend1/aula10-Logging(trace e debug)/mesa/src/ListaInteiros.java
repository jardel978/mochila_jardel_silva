import org.apache.log4j.Logger;

import java.util.ArrayList;

public class ListaInteiros {

    private static final Logger logger = Logger.getLogger(ListaInteiros.class);
    private ArrayList<Integer> listaDeInteiros = new ArrayList<>();

    public ListaInteiros(Integer ...inteiros) {
        for(int i = 0; i < inteiros.length; i++) {
            listaDeInteiros.add(inteiros[i]);
        }
    }

    public void verificarLista() throws Exception{
        if(listaDeInteiros.size() > 5 && listaDeInteiros.size() < 10)
            logger.info("O comprimento da lista é maior que 5");
        if(listaDeInteiros.size() > 10)
            logger.info("O comprimento da lista é maior que 10");
        if(listaDeInteiros.size() == 0) {
            logger.error("A lista é igual a zero.");
            throw new Exception("Lista vazia!");
        }
    }

    public void calcularMedia() {
        double soma = 0;
        double media = 0;
        for (int i = 0; i < listaDeInteiros.size(); i++){
           soma = soma + listaDeInteiros.get(i);
           media = soma/Double.valueOf(listaDeInteiros.size());
        }
           System.out.println("**Valores da lista: " + listaDeInteiros.toString() + " => " + listaDeInteiros.size() + "\n  " +
                   " Media desses " +
                   "valores: (" + soma +
                   "/" + listaDeInteiros.size() + ") = "+ media + "\n");
    }

    public void maxMin() {

        if (listaDeInteiros.size() == 0)
            logger.error("Sem valores máximos ou mínimos - Lista Vazia! \n");
        else {
            int min = listaDeInteiros.get(0), max = 0, total = 0;
            for (int n : listaDeInteiros) {
                if (n < min) min = n;

                if (n > max) max = n;

                if (n > 0) total += n;
            }
            System.out.println("Menor valor da lista: " + min);
            System.out.println("Maior valor da lista: " + max);
            System.out.println("Soma: " + total + "\n");
        }
    }
    public ArrayList<Integer> getListaDeInteiros() {
        return listaDeInteiros;
    }

    public void setListaDeInteiros(ArrayList<Integer> listaDeInteiros) {
        this.listaDeInteiros = listaDeInteiros;
    }
}
