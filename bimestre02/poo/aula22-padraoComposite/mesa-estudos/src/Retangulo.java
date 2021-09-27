public class Retangulo implements Figura{

    private double altura;
    private double largura;

    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public double calcularArea() {
        double area = this.altura * this.largura;
        return area;
    }

    @Override
    public String toString() {
        return "\nRetangulo{" +
                "altura=" + altura +
                ", largura=" + largura +
                '}';
    }
}
