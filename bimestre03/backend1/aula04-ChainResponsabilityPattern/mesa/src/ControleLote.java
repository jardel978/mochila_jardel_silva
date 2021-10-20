public class ControleLote extends Handler{

    @Override
    public void verificar(Artigo artigo) {

        boolean loteAceitavel = artigo.getLote() > 1000 && artigo.getLote() < 2000;

        if(!loteAceitavel)
            System.out.println("Produto rejeitado. Lote fora dos padrões pré-estabelecidos! " + "<< " + artigo.getLote() + " >>");
        else {
            if (this.proximoManipulador != null)
                this.proximoManipulador.verificar(artigo);
        }
    }
}