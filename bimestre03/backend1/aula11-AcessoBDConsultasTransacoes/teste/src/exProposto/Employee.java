package exProposto;

import java.time.LocalDate;

public class Employee {

    private int ID;
    private String nome;
    private int idade;
    private String empresa;
    private LocalDate data;

    public Employee(int ID, String nome, int idade, String empresa, LocalDate data) {
        this.ID = ID;
        this.nome = nome;
        this.idade = idade;
        this.empresa = empresa;
        this.data = data;
    }

    public int getID() {
        return ID;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEmpresa() {
        return empresa;
    }

    public LocalDate getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + ID +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", empresa='" + empresa + '\'' +
                ", data=" + data +
                '}';
    }
}
