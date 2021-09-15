import java.util.ArrayList;

public class Apadrinhado extends Usuario implements ValidadorString{
    private ArrayList<Publicacao> listaNecessidades = new ArrayList<>();
    private Causa causa;

    public Apadrinhado(String nome, String sobrenome, String contaUsuario, String genero, String senha,
                       ArrayList<Publicacao> listaNecessidades) throws StringException {
        super(nome, sobrenome, contaUsuario, genero, senha);
        if(!validarString(nome) || nome.equals(null)) {
            throw new StringException("O campo (Nome) não pode estar vazio e aceita apenas caracteres do tipo String(Letras)");
        }
        if(!validarString(sobrenome) || sobrenome.equals(null)) {
            throw new StringException("O campo (Sobrenome) não pode estar vazio e aceita apenas caracteres do tipo String(Letras)");
        }
        if(!validarString(contaUsuario) || contaUsuario.equals(null)) {
            throw new StringException("O campo (Conta do Usuário) não pode estar vazio e aceita apenas caracteres do tipo String(Letras)");
        }
        if(!validarString(genero) || genero.equals(null)) {
            throw new StringException("O campo (Gênero) não pode estar vazio e aceita apenas caracteres do tipo String(Letras)");
        }
        if(senha == null || senha.length() >= 6) {
            throw new StringException("O campo (Senha) não pode estar vazio e deve conter ao menos 6(seis) caracteres");
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
