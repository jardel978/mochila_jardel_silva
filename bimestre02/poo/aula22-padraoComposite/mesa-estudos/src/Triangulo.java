public class Triangulo implements Figura{

    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        double area = (this.base * this.altura)/2;
        return area;
    }

    @Override
    public String toString() {
        return "\nTriangulo{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }
}
