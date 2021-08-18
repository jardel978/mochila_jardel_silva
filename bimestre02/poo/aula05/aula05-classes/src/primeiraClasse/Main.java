package primeiraClasse;

public class Main {
    public static void main(String[] args) {
    //  TIPO    NOMEOBJ CONST   CLASSE => o a classe criada passa a ser também um tipo de obj... tal como String etc.
        Produto piano = new Produto();//instanciando um novo produto derivado da classe Produto
        piano.setNome("Piano Steinway");//usando método set para dar valor ao atributo nome
        piano.setCodigo("Model B - Spirio | r");//set para dar valor ao atributo codigo

        exibirCodigo(piano);//invocando o método que recebe o obj piano criado.
        System.out.println(piano.getEstoque());//retornará um null pois não foi dado valor

    //EM AULA:
        Cliente cliente = new Cliente(01, "Jardel");//instanciando um novo obj cliente
        System.out.println(cliente.getNome());
        System.out.println(cliente.getDivida());
        cliente.aumentarDivida(500.00);
        System.out.println(cliente.getDivida());
        cliente.setNome("Já");//setando novo nome
        System.out.println(cliente.getNome());
        System.out.println(cliente.pagarDivida());
        System.out.println(cliente.getDivida());
    }

    static void exibirCodigo(Produto produto) {//criando um método que receberá um Obj (como parâmentro)
    // do tipo Produto que nada mais é que a classe que criamos. Assim teremos aceaao aos métodos
    //da classe Produto e podemos usá-las.
        System.out.println("Código de " + produto.getNome() + " é: " + produto.getCodigo());
    }


}
