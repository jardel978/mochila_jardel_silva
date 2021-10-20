package ResolucaoProfessor;

public class DecolarCvc {

    public static void main(String[] args) {

        ICheckFacade cliente01 = new CheckFacade();
        cliente01.buscar("19/10/2021", "10/12/2021", "São Paulo", "Salvador");

    }

}
