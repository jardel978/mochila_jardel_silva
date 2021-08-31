public class Asteroide extends Objeto {
    private int danos;

    public Asteroide(int x, int y, String direcao, int danos) {
        super(x, y, direcao);
        this.danos = danos;
    }

    @Override
    public void irA(int x, int y, String direcao) {
        super.irA(x, y, direcao);
        System.out.println("Movimentar: \n" + "Eixo X: " + x + "\n" + "Eixo Y: " + y + "\n"  + "Direção: " + direcao);
    }

    @Override
    public String toString() {
        return "Asteroide{" +
                " posição-X = " + super.getPosx() +
                " posição-Y = " + super.getPosy() +
                " danos=" + danos +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        Asteroide outroAsteroide = (Asteroide) obj;
        return this.getClass().equals(outroAsteroide.getClass()) ? true : false;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
