import java.util.ArrayList;

public class Padrinho extends Usuario implements ValidadorString{
    private Causa causa;
    private ArrayList<String> listaHabilidades = new ArrayList<>();//array para receber as habilidades do Padrinho
    //Essas habilidades serão usadas para comparar com a necessidade do Apadrinhado, assim saberemos se esse Padrinho tem a habilidade para tal necessidade.

    public Padrinho(String nome, String sobrenome, String contaUsuario, String genero, String senha, Causa causa,
                    ArrayList<String> listaHabilidades) throws StringException {
        super(nome, sobrenome, contaUsuario, genero, senha);
//        boolean verificaNome = nome.toLowerCase().matches("[a-z]+");
//        boolean verificaSobrenome = sobrenome.toLowerCase().matches("[a-z]+");
//        boolean verificaConta = contaUsuario.toLowerCase().matches("[a-z]+");
//        boolean verificaGenero = genero.toLowerCase().matches("[a-z]+");
//        boolean verificaSenha = senha.toLowerCase().matches("[a-z]+");
        if(validarString(nome)) {                                                         ;
            throw new StringException("Esse campo aceita apenas caractéries do tipo String(Letras)");
        }
        if(validarString(sobrenome)) {                                                         ;
            throw new StringException("Esse campo aceita apenas caractéries do tipo String(Letras)");
        }
        if(validarString(contaUsuario)) {                                                         ;
            throw new StringException("Esse campo aceita apenas caractéries do tipo String(Letras)");
        }
        if(validarString(genero)) {                                                         ;
            throw new StringException("Esse campo aceita apenas caractéries do tipo String(Letras)");
        }
        if(validarString(senha)) {                                                         ;
            throw new StringException("Esse campo aceita apenas caractéries do tipo String(Letras)");
        }
        this.causa = causa;
        this.listaHabilidades = listaHabilidades;
    }

    @Override//método de validar entradas
    public boolean validarString(String campo) {
       return campo.toLowerCase().matches("[a-z]+");
    }

    @Override
    public String publicar(String necessidade, String mensagem) {
        Publicacao publicacao = super.getPublicacao();

        return "";
    }

    @Override
    public String apagarPublicacao(Publicacao<Usuario> publicacao) {

        return "";
    }

    public String ajudar(Apadrinhado apadrinhado) {
        return "";
    }

    public String informarNovaHabilidade(String habilidade) {
        return "";
    }

    public Causa getCausa() {
        return causa;
    }

    public ArrayList<String> getListaHabilidades() {
        return listaHabilidades;
    }


}
