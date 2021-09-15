import java.util.ArrayList;

public abstract class Usuario {
    private String nome;
    private String sobrenome;
    private String contaUsuario;
    private String genero;
    private String senha;
    private Publicacao<Usuario> publicacao;
    private ArrayList<Publicacao> listaPublicacoes  = new ArrayList<>();

    public Usuario(String nome, String sobrenome, String contaUsuario, String genero, String senha) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.contaUsuario = contaUsuario;
        this.genero = genero;
        this.senha = senha;
    }

    public abstract String publicar(String necessidade, String mensagem);
    public abstract String apagarPublicacao(Publicacao<Usuario> publicacao);

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getContaUsuario() {
        return contaUsuario;
    }

    public String getGenero() {
        return genero;
    }

    public String getSenha() {
        return senha;
    }

    public Publicacao<Usuario> getPublicacao() {
        return publicacao;
    }

    public ArrayList<Publicacao> getListaPublicacoes() {
        return listaPublicacoes;
    }
}
