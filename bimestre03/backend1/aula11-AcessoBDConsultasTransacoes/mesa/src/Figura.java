public class Figura {

    private int ID;
    private String figura;
    private String cor;

    public Figura(int ID, String figura, String cor) {
        this.ID = ID;
        this.figura = figura;
        this.cor = cor;
    }

    public int getID() {
        return ID;
    }

    public String getFigura() {
        return figura;
    }

    public String getCor() {
        return cor;
    }
}
