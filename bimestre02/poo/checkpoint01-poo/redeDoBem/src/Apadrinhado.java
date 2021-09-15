import java.util.ArrayList;

public class Apadrinhado extends Usuario implements ValidadorString{
    private ArrayList<Publicacao> listaNecessidades = new ArrayList<>();
    private Causa causa;

    public Apadrinhado(String nome, String sobrenome, String contaUsuario, String genero, String senha,
                       ArrayList<Publicacao> listaNecessidades) throws StringException {
        super(nome, sobrenome, contaUsuario, genero, senha);
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
        this.listaNecessidades = listaNecessidades;
    }

    @Override
    public String publicar(String necessidade, String mensagem) {
        return "";
    }

    @Override
    public String apagarPublicacao(Publicacao<Usuario> publicacao) {
        return "";
    }

    public Causa solicitarAjuda(Padrinho padrinho, Publicacao<Usuario> necessidade) {
        return causa;
    }

    @Override//método de validar entradas
    public boolean validarString(String campo) {
        return campo.toLowerCase().matches("[a-z]+");
    }

    public ArrayList<Publicacao> getListaNecessidades() {
        return listaNecessidades;
    }
}
