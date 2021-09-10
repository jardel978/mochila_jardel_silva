public class Jogador implements Comparavel{

    private String nome;
    private int numCamisa;
    private boolean lesionado;
    private boolean titular;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumCamisa() {
        return numCamisa;
    }

    public void setNumCamisa(int numCamisa) {
        this.numCamisa = numCamisa;
    }

    public boolean isLesionado() {
        return lesionado;
    }

    public void setLesionado(boolean lesionado) {
        this.lesionado = lesionado;
    }

    public boolean isTitular() {
        return titular;
    }

    public void setTitular(boolean titular) {
        this.titular = titular;
    }

    public Jogador(String nome, int numCamisa, boolean lesionado, boolean titular) {
        this.nome = nome;
        this.numCamisa = numCamisa;
        this.lesionado = lesionado;
        this.titular = titular;
    }

    @Override
    public int compareTo(Jogador jogador) {//sobrescrevendo o método para comparar obj
        //compara esse jogador com o jogador passado com parâmetro
        if(this.numCamisa == jogador.numCamisa) {
            return 0;
        }else if (this.numCamisa > jogador.numCamisa)
            return 1;
        else
            return -1;
    }
}
