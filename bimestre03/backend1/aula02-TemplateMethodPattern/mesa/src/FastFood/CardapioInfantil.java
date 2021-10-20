package FastFood;

public class CardapioInfantil extends Cardapio {

    private double taxaPresente;

    public CardapioInfantil(double precoBase, double taxaPresente) {
        super(precoBase);
        this.taxaPresente = taxaPresente;
    }

    @Override
    protected void montar() {
        System.out.println("Montando um cardápio infantil com surpresa");
    }

    @Override
    protected double calcularPreco() {
        return getPrecoBase() + taxaPresente;
    }
}
