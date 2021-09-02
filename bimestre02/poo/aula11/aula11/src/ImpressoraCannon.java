import java.time.LocalDate;

public class ImpressoraCannon extends Impressora {

    public ImpressoraCannon(String modelo, String tipoConexao, LocalDate dataFabricacao, int folhasDisponiveis, double porcentagemTinta) {
        super(modelo, tipoConexao, dataFabricacao, folhasDisponiveis, porcentagemTinta);
    }

    @Override
    public String imprimir() {
        return "O texto foi impresso!";
    }

    @Override
    public boolean precisaTinta() {
        return super.precisaTinta();
    }
}
