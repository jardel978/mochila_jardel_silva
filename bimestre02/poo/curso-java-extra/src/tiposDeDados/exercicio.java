package tiposDeDados;

import java.util.Scanner;

public class exercicio {
    public static void main(String[] args) {
        /*
Leia um número no console e depois faça o cálculo do quadrado desse número e exiba o resultado no console.
Lembrando que o quadrado de um número é calculado multiplicando-se o número por ele mesmo.
Por exemplo, para encontrar o quadrado de 2 é preciso multiplicar o 2 por 2, tendo como resultado o número 4.*/
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número:");
        Integer numUm = entrada.nextInt();
        Integer quadrado = numUm * numUm;
        System.out.println("O quadrado de " + numUm + " é: " + quadrado);
/*Crie um programa que lê, do console, o nome e o sobrenome de uma pessoa e depois imprime o nome completo.
Para isso, você vai precisar de duas variáveis: a primeira você pode chamar de "nome" e a segunda de "sobrenome".
Por último, você vai juntar o nome e o sobrenome em uma única impressão.*/

        System.out.println("Digite seu nome:");
        String nome = entrada.next();
        System.out.println("Digite seu sobrenome:");
        String sobrenome = entrada.next();
        System.out.println("Olá. " + nome + " " + sobrenome + ". Seja Bem-Vindo!");

/*O seu programa deve receber a nota do aluno pelo console e depois você vai fazer uma operação lógica para saber se a
nota do aluno é maior que 70. O resultado dessa operação lógica deve ser atribuido a uma variável do tipo Boolean.
Por último, você deve utilizar a variável do tipo Boolean com a estrutura de decisão if para imprimir, no console, uma
mensagem que vai dizer se o aluno passou ou não passou.*/

        System.out.println("Digite a nota do aluno:");
        Double notaAluno = entrada.nextDouble();

        if(notaAluno > 70){
            System.out.println("Aluno aprovado");
        } else {
            System.out.println("Aluno reprovado");
        }

/*Crie um programa que vai receber do usuário o valor do produto e a quantidade do produto que se deseja.
Com essas informações encontre o subtotal que será o valor do produto multiplicado pela quantidade.

Depois você vai precisar usar uma estrutura de decisão. Se a quantidade desejada do produto for maior que 10 unidades,
vai ser preciso dar um desconto de 10% em cima do subtotal, mas se for menor que 10, você NÃO aplica desconto algum.

Para encontrar o valor referente ao percentual de desconto (que vai ser 0% ou 10%, dependendo da quantidade) você
multiplica o subtotal pelo próprio percentual e divide tudo por 100.
Tendo o valor referente ao percentual de desconto, você vai retirar esse valor do subtotal. O que sobrar será o valor
total final e deverá ser apresentado no console.*/

        System.out.print("Valor do Produto: ");
        Double valor = entrada.nextDouble();
        System.out.print("Qual a quantidade do Produto desejada: ");
        Integer quantidade = entrada.nextInt();
        Double valorTotalCompra = valor * quantidade;

        if (quantidade > 10) {
        valorTotalCompra = valorTotalCompra * 0.9;
        }
        System.out.println("Valor total da compra: " + valorTotalCompra);
    }
}