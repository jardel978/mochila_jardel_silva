public class ControlePeso extends Handler{

    @Override
    public void verificar(Artigo artigo) {

        boolean pesoAceitavel = artigo.getPeso() > 1200 && artigo.getPeso() < 1300;

        if(!pesoAceitavel)
            System.out.println("Produto rejeitado. Peso inadequado! " + "<< " + artigo.getPeso() + " >>");
        else {
            if (this.proximoManipulador != null)
                this.proximoManipulador.verificar(artigo);
        }
    }
}
