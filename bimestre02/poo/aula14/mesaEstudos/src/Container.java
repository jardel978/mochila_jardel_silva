public class Container {

    private int num;
    private String paisOrigem;
    private String marca;

    public Container(int num, String marca) {
        this.num = num;
        this.marca = marca;
    }

    public void setPaisOrigem(String paisOrigem) {
        if(paisOrigem.equalsIgnoreCase("china") || paisOrigem.equalsIgnoreCase("eua") || paisOrigem.equalsIgnoreCase("brasil")
                || paisOrigem.equalsIgnoreCase("russia") || paisOrigem.equalsIgnoreCase("canada"))
            this.paisOrigem = paisOrigem;
        else
            this.paisOrigem = "Desconhecido";
    }

    public int getNum() {
        return num;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public String getMarca() {
        return marca;
    }

    public int compareTo(Container container) {
        if(this.num > container.num)
            return 0;
        else
            return -1;
    }

    @Override
    public String toString() {
        return "Container{ num: " + this.num + ", marca: " + this.marca + ", origem: " + this.paisOrigem + " } \n";
    }
}
