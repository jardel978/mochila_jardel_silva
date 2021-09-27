public class Principal {
    public static void main(String[] args) {

//        - Um vagão com um retângulo de 5 x 4 e três círculos de raio 1 e calcular a superfície total.

        Trem vagao = new Trem();
        Retangulo retanguloVagao = new Retangulo(5.0,4.0);
        Circulo circuloVagão = new Circulo(1.0);
        vagao.addFigura(retanguloVagao);
        vagao.addFigura(circuloVagão);
        vagao.addFigura(circuloVagão);
        vagao.addFigura(circuloVagão);

        System.out.println(vagao.calcularArea());
        System.out.println(vagao.getListaFiguras());

//        - Uma locomotiva com um retângulo de 6 x 4, dois círculos de raio 1, um triângulo de 2 x 2 e calcular a superfície total da locomotiva.

        Trem locomotiva = new Trem();
        Retangulo retanguloLocomotiva = new Retangulo(6.0,4.0);
        Circulo circuloLocomotiva = new Circulo(1.0);
        Triangulo trianguloLocomotiva = new Triangulo(2.0,2.0);
        locomotiva.addFigura(retanguloLocomotiva);
        locomotiva.addFigura(circuloLocomotiva);
        locomotiva.addFigura(circuloLocomotiva);
        locomotiva.addFigura(trianguloLocomotiva);

        System.out.println(locomotiva.calcularArea());
        System.out.println(locomotiva.getListaFiguras());

    }
}
