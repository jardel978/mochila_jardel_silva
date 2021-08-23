package tiposDeDados;

public class variaveis {
    public static void main(String[] args) {
        //Numéricos:
        //inteiros
        Byte numeroByte = 127; //-128 até 127
        Short numeroShort = 127; //-32768 até 32767
        Integer numeroInteger = 127; //-2147483648 até 2147483648 (MAIS USADO PARA INTEIROS)
        Long numeroLong = 1L; //-9.223372037*10^10 até 9.223372037*10^10 (tem que ter o L após o número)
        //decimais
         Float numeroFloat = 1.2f; // até (tem que colocar o f)
         Double numeroDouble = 12.3; // até  (MAIS USADO PARA DECIMAIS)

        System.out.println(numeroInteger);

        //Texto:

        String meuTexto = "Olá, Mundo!";
        Character caractere = 'a'; //quase não usa, entre aspas simples

        //Lógicos (Booleanos)
        Boolean verdade = true;
        Boolean falso = false;

        Integer idade = 24;
        Boolean podeTerCnh = idade >= 18;
        System.out.println("Com " + idade + " já pode tirar carteira? " + podeTerCnh);
        //ou:
        if(podeTerCnh) {
            System.out.println("Com " + idade + " já pode tirar carteira? " + podeTerCnh);
        } else {
            System.out.println("Com " + idade + " já pode tirar carteira? " + podeTerCnh);
        }

        //Os tipos primitivos são aqueles com iniciais minúsculas. (a diferença entre um normal e um primitivo é que
        //um primitivo não aceita valores nulos. EX: Integer numero = null; OK/ int numero = null; NOT
        //String não tem primitivo.

        //Constantes: uma variável CONSTANTE. O valor não varia!

        final Integer naoMudaNunca = 10;//é bom usar constantes para valores que não mudam e que precisam ser usados
        //em muitos lugares!

        //Constantes staticas
         final Integer IDADE_STATICA_CONSTANTE = 18;
    }
}
