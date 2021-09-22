import java.util.ArrayList;

public class Carrinho {

    private Estado estado;
    private ArrayList<Produto> produtos = new ArrayList<Produto>();

    public Carrinho() {
        this.estado = new Vazio(this);
    }

    public void addProduto(Produto p) {
        this.produtos.add(p);
    }

    public void cancelar() {
        if (produtos.size() > 0) {
            this.produtos.clear();
            this.estado = new Vazio(this);
            System.out.println("Cancelado!");
        } else
            System.out.println("Carrinho sem itens para cancelar!");
    }

    public void retornar(int opcao, Produto p) {
        if(opcao == 1)
            addProduto(p);
        else if (opcao == 2)
            cancelar();
        else if (opcao == 3)
            pagando();
        else
            System.out.println("Opção inválida");
    }

    public void vazio() {

    }
    public void carregando() {

    }
    public void pagando() {

    }
    public void fechado() {
        System.out.println("Carrinho fechado!");
        this.estado = new Vazio(this);
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }
}
