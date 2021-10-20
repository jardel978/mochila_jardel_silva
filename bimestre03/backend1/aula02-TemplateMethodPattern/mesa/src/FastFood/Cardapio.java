package FastFood;

public abstract class Cardapio {

    private double precoBase;

    public Cardapio(double precoBase) {
        this.precoBase = precoBase;
    }

    public void preparacao() {
        montar();
        double valorPedido = calcularPreco();
        System.out.println("Valor do Cardápio: " + valorPedido);
    }

    protected abstract void montar();
    protected abstract double calcularPreco();

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }
}
