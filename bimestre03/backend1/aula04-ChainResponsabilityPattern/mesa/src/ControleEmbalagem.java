public class ControleEmbalagem extends Handler{

    @Override
    public void verificar(Artigo artigo) {
        boolean embalagemAceitavel =
                artigo.getEmbalagem().equalsIgnoreCase("saudável") || artigo.getEmbalagem().equalsIgnoreCase("quase " +
                        "saudável");

        if(!embalagemAceitavel)
            System.out.println("Produto rejeitado. Embalagem em desacordo com as regas! " + "<< " + artigo.getEmbalagem() + " >>");
        else
            System.out.println("Produto aprovado!");
    }
}
