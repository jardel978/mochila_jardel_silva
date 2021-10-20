public class Principal {

    public static void main(String[] args) {

        final Object[][] tabelaReferencia = new String[4][];
        tabelaReferencia[0] = new String[] { "ATRIBUTO", "REFERÊNCIA", "" };
        tabelaReferencia[1] = new String[] { "Lote_______________", ">1000", "<2000" };
        tabelaReferencia[2] = new String[] { "Peso_______________", ">1200", "<1300" };
        tabelaReferencia[3] = new String[] { "Embalagem__________", "quase saudável", "saudável" };

        for (final Object[] row : tabelaReferencia) {
            System.out.format("%-20s%-20s%-20s\n", row);
        }

        CheckQuality verificarQualidade = new CheckQuality();

        Artigo produto01 = new Artigo("Soja", 1001, 1210, "saudável");
        Artigo produto02 = new Artigo("Feijão", 998, 1299, "saudável");
        Artigo produto03 = new Artigo("Soja", 1050, 1290, "não saudável");
        Artigo produto04 = new Artigo("Milho", 1001, 1215, "quase saudável");
        Artigo produto05 = new Artigo("Arroz", 1150, 1500, "saudável");

        System.out.print("\n");

        verificarQualidade.verificar(produto01);
        verificarQualidade.verificar(produto02);
        verificarQualidade.verificar(produto03);
        verificarQualidade.verificar(produto04);
        verificarQualidade.verificar(produto05);
    }

}
