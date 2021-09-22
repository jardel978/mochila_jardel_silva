public class Vazio implements Estado{

    private Carrinho carrinho;

    public Vazio(Carrinho carrinho) {
        this.carrinho = carrinho;
    }

    @Override
    public void vazio() {
        System.out.println("Está vazio!");
    }

    @Override
    public void carregando() {

    }

    @Override
    public void pagando() {

    }

    @Override
    public void fechado() {

    }
}
