public class Produto {
    private String descricao;
    private  double preco;

    public Produto(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "descricao='" + descricao + '\'' +
                ", preco=" + preco +
                '}';
    }
}
