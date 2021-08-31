public class Objeto {
    private int posx;
    private int posy;
    private String direcao;

    public  Objeto(int x, int y, String direcao) {
        this.posx = x;
        this.posy = y;
        this.direcao = direcao;
    }

    public void irA(int x, int y, String direcao) {
        System.out.println("Movimentar: \n" + "Eixo X: " + x + "\n" + "Eixo Y: " + y + "\n"  + "Direção: " + direcao);
    }

    public String getDirecao() {
        return direcao;
    }

    public int getPosx() {
        return posx;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public int getPosy() {
        return posy;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }

    public void setDirecao(String direcao) {
        this.direcao = direcao;
    }
}
