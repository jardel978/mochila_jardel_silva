package model;

public class Dentista {

    private Integer id;
    private String numMatricula;
    private String nome;
    private String sobrenome;

    public Dentista(Integer id, String numMatricula, String nome, String sobrenome) {
        this.id = id;
        this.numMatricula = numMatricula;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public Dentista(String numMatricula, String nome, String sobrenome) {
        this.numMatricula = numMatricula;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(String numMatricula) {
        this.numMatricula = numMatricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    @Override
    public String toString() {
        return "Dentista{" +
                "id=" + id +
                ", numMatricula='" + numMatricula + '\'' +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                '}';
    }
}

