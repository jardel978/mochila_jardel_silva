public class SerieNaoHabilitadaException extends Exception{

    public SerieNaoHabilitadaException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return this.getMessage();
    }

}
