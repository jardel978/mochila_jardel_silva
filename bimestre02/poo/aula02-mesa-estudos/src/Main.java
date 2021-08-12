import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    /*EXERCÍCIO O1
    Faça uma função que, dado um número, indique se é um número primo ou não. Um número primo é aquele que só pode
    ser dividido por 1 e ele mesmo. Por exemplo: 25 não é primo, pois 25 é divisível por 1, 5 e 25. 17 é primo
    porque só pode ser dividido por 1 e por 17.
    Para usar esta função que iremos criar  em um programa, podemos  permitir a entrada de apenas um número para
    verificar se o número é primo ou não.
    Para resolvê-lo, use a função obtida no exercício desenvolvido na aula assíncrona, Boolean e Divisível (int n, int divisor).*/

    ehPrimo(173);
    ehPrimo(100);
    System.out.println("----------------------------------------------------------------------------");


    /*EXERCÍCIO 02:
    Escreva uma função que receba três números e retorne o máximo dos três números.
    int maximoEntreTresNumeros(int umNumeroA, int umNumeroB, int umNumeroC)
    Em seguida, faça um programa que permita a entrada de 3 valores, use a função e exiba o resultado.*/

        /*int verificacao = numMaximo(20, 30, 40);
        System.out.println(verificacao);*/

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número:");
        int first = entrada.nextInt();
        System.out.println("Digite outro número:");
        int second = entrada.nextInt();
        System.out.println("Digite outro número:");
        int third = entrada.nextInt();
        System.out.println("O maior dos números digitados foi: " + numMaximo(first, second, third));
        System.out.println("----------------------------------------------------------------------------");

        //usando a segunda função criada com o mesmo objetivo:
        System.out.println("O maior dos números digitados foi: " + numMaximoDois(first, second, third));

    }

    //Função para exercício 01
    static void ehPrimo(int numero){
        int contadorDeDivisores = 0;
        if(numero > 0){
            for(int i = numero; i >= 1; i--){
                if (numero % i == 0){
                    contadorDeDivisores++;
                }
            }
            if(contadorDeDivisores == 2){
                System.out.println(numero + " é primo!");
            } else {
                System.out.println(numero + " não é primo!");
            }
        }
    }


    //Funções para exercício 02
    static int numMaximo(int first, int second, int third) {
        int maxMiddle;
        int maxTotal;
        if(first > second){
            maxMiddle = first;
            maxTotal = maxMiddle;
        } else{
            maxMiddle = second;
            maxTotal = maxMiddle;
        }
        if(maxMiddle > third){
            maxTotal = maxMiddle;
        } else {
            maxTotal = third;
        }
        return maxTotal;
    }

    //explorando outras resoluções
    static int numMaximoDois(int first, int second, int third){
        int maximo = 0;
        if(first > second){
            maximo = first;
        } else {
            maximo = second;
        }
        if(Math.max(maximo, third) == third){
            maximo = third;
        }
        return maximo;
    }
}
