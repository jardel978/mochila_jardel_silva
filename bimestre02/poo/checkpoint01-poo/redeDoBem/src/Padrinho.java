import java.util.ArrayList;

public class Padrinho extends Usuario implements ValidadorString{
    private Causa causa;
    private ArrayList<String> listaHabilidades = new ArrayList<>();//array para receber as habilidades do Padrinho
    //Essas habilidades serão usadas para comparar com a necessidade do Apadrinhado, assim saberemos se esse Padrinho tem a habilidade para tal necessidade.

    public Padrinho(String nome, String sobrenome, String contaUsuario, String genero, String senha, Causa causa,
                    ArrayList<String> listaHabilidades) throws StringException {
        super(nome, sobrenome, contaUsuario, genero, senha);
        if(!validarString(nome) || nome == null) {
            throw new StringException("O campo (Nome) não pode estar vazio e aceita apenas caracteres do tipo String(Letras)");
        }
        if(!validarString(sobrenome) || sobrenome == null) {
            throw new StringException("O campo (Sobrenome) não pode estar vazio e aceita apenas caracteres do tipo String(Letras)");
        }
        if(!validarString(contaUsuario) || contaUsuario == null) {
            throw new StringException("O campo (Conta do Usuário) não pode estar vazio e aceita apenas caracteres do tipo String(Letras)");
        }
        if(!validarString(genero) || genero == null) {
            throw new StringException("O campo (Gênero) não pode estar vazio e aceita apenas caracteres do tipo String(Letras)");
        }
        if(senha == null || senha.length() >= 6) {
            throw new StringException("O campo (Senha) não pode estar vazio e deve conter ao menos 6(seis) caracteres");
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
