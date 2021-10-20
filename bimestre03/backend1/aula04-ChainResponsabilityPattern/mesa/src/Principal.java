public class Principal {

    public static void main(String[] args) {

        CheckQuality verificarQualidade = new CheckQuality();

        Artigo produto01 = new Artigo("Soja", 1001, 1210, "saudável");
        Artigo produto02 = new Artigo("Feijão", 998, 1299, "saudável");
        Artigo produto03 = new Artigo("Soja", 1050, 1290, "não saudável");
        Artigo produto04 = new Artigo("Milho", 1001, 1215, "quase saudável");
        Artigo produto05 = new Artigo("Arroz", 1150, 1500, "saudável");

        verificarQualidade.verificar(produto01);
        verificarQualidade.verificar(produto02);
        verificarQualidade.verificar(produto03);
        verificarQualidade.verificar(produto04);
        verificarQualidade.verificar(produto05);

    }

}
