import java.util.ArrayList;

public class Trem implements Figura{

    private ArrayList<Figura> listaFiguras = new ArrayList<>();

    public Trem(){};

    @Override
    public double calcularArea() {
        double areaTotal = 0;
        for (Figura figura : listaFiguras) {
            areaTotal += figura.calcularArea();
        }
        return areaTotal;
    }

    public void addFigura(Figura figura) {
        listaFiguras.add(figura);
    }

    public ArrayList<Figura> getListaFiguras() {
        return listaFiguras;
    }

    @Override
    public String toString() {
        return "Trem{" +
                "listaFiguras=" + listaFiguras +
                '}';
    }
}
