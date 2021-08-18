package mesa05Classe;

public class UsuarioJogo {
    private String nome;
    private String nickName;
    private Integer pontuacao;
    private Integer nivel = 0;

    public UsuarioJogo(String nome, String nickname) {
        this.nome = nome;
        this.nickName = nickname;
    }

    public String aumentarPontuacao() {
        this.pontuacao+=100;
        return this.nome + " Sua pontuação aumentou!" + " Total: " + this.pontuacao;
    }

    public String subirnivel() {
        this.nivel++;
        return "Parabéns " + this.nome + "! Você subiu de nível!";
    }

    public String bonus(Integer valor) {
        this.pontuacao = this.pontuacao + valor;
        return this.nome + ", Você ganhou " + valor + " de bonus!";
    }

    public String getNome() {
        return nome;
    }

    public String getNickName() {
        return nickName;
    }

    public Integer getPontuacao() {
        return pontuacao;
    }

    public String getNivel() {
        return this.nome + ", você está no nível: " + nivel;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setPontuacao(Integer pontuacao) {
        this.pontuacao = pontuacao;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

}
