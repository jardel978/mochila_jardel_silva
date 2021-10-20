public abstract class Handler {

    protected Handler proximoManipulador;

    public Handler getProximoManipulador() {
        return this.proximoManipulador;
    }

    public void setProximoManipulador(Handler proximoManipulador) {
        this.proximoManipulador = proximoManipulador;
    }

    public abstract void verificar(Artigo artigo);

}
