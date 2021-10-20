package FastFood;

public class CardapioAdulto extends Cardapio {

    public CardapioAdulto(double precoBase) {
        super(precoBase);
    }

    @Override
    protected void montar() {
        System.out.println("Montando cardápio adulto");
    }

    @Override
    protected double calcularPreco() {
        return getPrecoBase();
    }
}
