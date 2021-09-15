public class StringException extends Exception{

    private String mensagem;

    public StringException(String messagem) {
        super();
        this.mensagem = messagem;
    }

    @Override
    public String toString() {
        return "Algo de errado ocorreu: " + "\n" + mensagem;
    }
}
