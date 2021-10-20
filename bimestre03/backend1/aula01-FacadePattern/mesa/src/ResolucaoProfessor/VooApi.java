package ResolucaoProfessor;

public class VooApi {

    public void  buscarVoos(String dataPartida, String dataRetorno, String origem, String destino) {
        System.out.println("===========================================");
        System.out.println("Voos encontados para: " + destino + ", saindo de " + origem);
        System.out.println("Data de ida: " + dataPartida +  " - Data de retorno: " + dataRetorno);
    }

}
