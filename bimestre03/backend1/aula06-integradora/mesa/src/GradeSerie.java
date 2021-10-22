public class GradeSerie implements ISerie{

    @Override
    public String getSerie(String nome) throws SerieNaoHabilitadaException {
        Serie serie = null;
//        switch (nome.toLowerCase()) {
            if(nome.toLowerCase().equalsIgnoreCase( "the flash"))
                serie = new Serie("theflash");
            else if(nome.toLowerCase().equalsIgnoreCase( "billions"))
                serie = new Serie("billions");
            else if(nome.toLowerCase().equalsIgnoreCase( "wandavision"))
                serie = new Serie("wandaVision");
            else if(nome.toLowerCase().equalsIgnoreCase( "west world"))
                serie = new Serie("westworld");
            else if(nome.toLowerCase().equalsIgnoreCase( "rainha do sul"))
                serie = new Serie("rainhadosul");
            else if(nome.toLowerCase().equalsIgnoreCase( "star trek"))
                serie = new Serie("startrek");
            else if(nome.toLowerCase().equalsIgnoreCase( "big bang theory"))
                serie = new Serie("bigbangtheory");
            else
                throw new SerieNaoHabilitadaException("Ops, não conseguimos localizar esse título.");

//        }
        return serie.getSerie(serie.getNome());
    }
}
