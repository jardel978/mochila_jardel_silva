public class Circulo implements Figura{

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        double pi = 3.14;
        double area = (raio * raio) * pi;
        return area;
    }

    @Override
    public String toString() {
        return "\nCirculo{" +
                "raio=" + raio +
                '}';
    }
}
