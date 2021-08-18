package primeiraClasse;

public class Cliente {
    /*Para resolver um problema, devemos criar uma classe cliente. Um cliente tem um número de cliente, o nome e uma
     dívida. Para registrar esse cliente, teremos que possuir seu número e seu nome. Um cliente pode aumentar sua dívida
     ou quitar
     Atributos:
     numeroCliente: Int
     nome: String
     divida: Double
     Métodos:
     Cliente( int numero, String nome)
     aumentarDivida(Double valor)
     pagarDivida()
*/

    private Integer numero;
    private String nome;
    private Double divida;

    public Cliente(Integer numero, String nome){//criando o construtor da classe
        this.nome = nome;
        this.numero = numero;
        this.divida = 0.0;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public Double getDivida() {
        return divida;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDivida(Double divida) {//é void porque apenas seta(dá um valor) para o atributo, não retorna valores.
        this.divida = divida;
    }

    public String aumentarDivida(Double valor) {
        this.divida = this.divida + valor;
        return  "Sua divida aumentou" + this.divida;
    }

    public String pagarDivida() {
        Double valorNaoPago = this.divida;
        this.divida = 0.0;
        return "Pagamento de " + valorNaoPago + " recebido!";
    }

}
