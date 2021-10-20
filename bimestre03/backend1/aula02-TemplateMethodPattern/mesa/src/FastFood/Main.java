package FastFood;

public class Main {

    public static void main(String[] args) {
        Cardapio cardapioUm = new CardapioAdulto(35.5);
        Cardapio cardapioDois = new CardapioInfantil(23.45, 7.0);
        Cardapio cardapioTres= new CardapioVegetariano(43.20, 5.0);

        cardapioUm.preparacao();
        System.out.println("-----------------------------------------------------------------------");
        cardapioDois.preparacao();
        System.out.println("-----------------------------------------------------------------------");
        cardapioTres.preparacao();

    }
}
