public class StringException extends Exception{

    public StringException() { }

    public StringException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "Aseguinte excessão ocorreu: " + getClass().getName() + "Mensagem: " + getMessage();
    }
}
