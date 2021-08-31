public class Nave extends Objeto {

    private double velocidade;
    private int vida;

    public Nave(int x, int y, String direcao, double velocidade) {
        super(x, y, direcao);
        this.velocidade = velocidade;
    }

    public boolean girar(String direcao) {
        if(direcao.equalsIgnoreCase(super.getDirecao()))
            return true;
        else
            return false;
    }

    @Override
    public void irA(int x, int y, String direcao) {
        super.irA(x, y, direcao);
        if(girar(direcao)) {
            System.out.println("Movimento Realizado");
        } else {
            System.out.println("Relizando curva para a direção " + direcao);
        }
    }
    public void restaVida(int valor) {
        System.out.println("Restam " + valor + "vidas");
    }

    @Override
    public String toString() {
        return "Nave{" +
                " posição-X = " + super.getPosx() +
                " posição-Y = " + super.getPosy() +
                " velocidade=" + velocidade +
                ", vida=" + vida +
                '}';
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        Nave outraNave = (Nave) obj;
        return this.getClass().equals(outraNave.getClass()) ? true : false;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

}
