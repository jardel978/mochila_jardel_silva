package primeiraClasse;
/*Criando a classe Produto*/
    public class Produto {
        private String nome;//argumentos privados
        private String codigo;
        private Double preco_venda;
        private Integer estoque;
        private String tipo = "Instrumento Musical";//uma classe pode ter variáveis. Uma VARIÁVEL DE CLASSE
        //nada masi é que uma variável que tem valor comum para todos os obj que forem instanciados por essa classe
        //ex: nesse caso, todos os obj criados com essa classe Produto terão o tipo = Instrumento Musical. É comum
        //para todos!

        //Criando getters e setters para dar valores e pegar os valores dos atributos
        public void setCodigo(String codigo) {
            this.codigo = codigo;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setEstoque(Integer estoque) {
            this.estoque = estoque;
        }

        public void setPreco_venda(Double preco_venda) {
            this.preco_venda = preco_venda;
        }

        public String getNome() {
            return nome;
        }

        public String getCodigo() {
            return codigo;
        }

        public Integer getEstoque() {
            return estoque;
        }

        public Double getPreco_venda() {
            return preco_venda;
        }

    public String getTipo() {
        return tipo;
    }
}


