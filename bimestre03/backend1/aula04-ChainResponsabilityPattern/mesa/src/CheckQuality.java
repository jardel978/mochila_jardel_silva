public class CheckQuality {

    protected Handler inicialContoleLote;

    public CheckQuality() {
        this.inicialContoleLote = new ControleLote();
        Handler handlerPeso = new ControlePeso();
        Handler handlerEmbalagem = new ControleEmbalagem();

        inicialContoleLote.setProximoManipulador(handlerPeso);
        handlerPeso.setProximoManipulador(handlerEmbalagem);
    }

    public void verificar(Artigo artigo) {
        inicialContoleLote.verificar(artigo);
    }

}
