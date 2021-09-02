import java.time.LocalDate;

public  abstract class Impressora {

    private  String modelo;
    private  String tipoConexao;
    private LocalDate dataFabricacao;
    private  int folhasDisponiveis;
    private  double porcentagemTinta;

    public Impressora(String modelo, String tipoConexao, LocalDate dataFabricacao, int folhasDisponiveis, double porcentagemTinta) {
        this.modelo = modelo;
        this.tipoConexao = tipoConexao;
        this.dataFabricacao = dataFabricacao;
        this.folhasDisponiveis = folhasDisponiveis;
        this.porcentagemTinta = porcentagemTinta;
    }

    public  boolean temPapel() {
        return this.folhasDisponiveis > 0 ? true : false;
    }

    public boolean precisaTinta() {
        return this.porcentagemTinta <= 10 ? true : false;
    }

    public abstract String imprimir();//métodos abstratos não têm comportamento
    //o comportamento é dado na sobrescrita nas classes filhas
}