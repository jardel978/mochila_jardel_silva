package FastFood;

public class CardapioVegetariano extends Cardapio {

    private double valorContainer;
    private double taxa = 1.01;//1% do valor total

    public CardapioVegetariano(double precoBase, double valorContainer) {
        super(precoBase);
        this.valorContainer = valorContainer;
    }

    @Override
    protected void montar() {
        System.out.println("Montando um cardápio vegetariano com adicionais");
    }

    @Override
    protected double calcularPreco() {
        double valorPedido = ((getPrecoBase() + valorContainer) * taxa);
        return valorPedido;
    }
}
