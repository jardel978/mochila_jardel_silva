import java.util.Locale;

public class SerieProxy implements ISerie{

    private int qtdViews;
    private GradeSerie gradeSerie;

    public SerieProxy(GradeSerie gradeSerie) {
        qtdViews = 0;
        this.setGradeSerie(gradeSerie);
    }

    @Override
    public String getSerie(String nome) throws SerieNaoHabilitadaException {
         String result = "";
        if(this.gradeSerie.getSerie(nome).equalsIgnoreCase("www." + nome.toLowerCase().replaceAll(" ", "") + ".com.br")) {
            contarViews();
            if (qtdViews > 5) {
                throw new SerieNaoHabilitadaException("Você excedeu o número de reproduções permitidas pelo seu " +
                        "plano! Faça um upgrade e tenha reproduções ilimitadas!");
            } else {
                result = this.gradeSerie.getSerie(nome);
            }
        }
        return result;
    }

    public void contarViews() {
        int contador = qtdViews += 1;
        this.setQtdViews(contador);
    }

    public void setGradeSerie(GradeSerie gradeSerie) {
        this.gradeSerie = gradeSerie;
    }

    public void setQtdViews(int qtdViews) {
        this.qtdViews = qtdViews;
    }
}
