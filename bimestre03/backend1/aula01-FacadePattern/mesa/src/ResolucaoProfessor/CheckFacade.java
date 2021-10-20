package ResolucaoProfessor;

public class CheckFacade implements ICheckFacade{

    private VooApi vooApi;
    private HotelApi hotelApi;

    public CheckFacade() {
        this.vooApi = new VooApi();
        this.hotelApi = new HotelApi();
    }

    @Override
    public void buscar(String dataPartida, String dataRetorno, String origem, String destino) {
        vooApi.buscarVoos(dataPartida, dataRetorno, origem, destino);
        hotelApi.buscarHoteis(dataPartida, dataRetorno, destino);
    }
}
