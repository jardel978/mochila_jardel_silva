public class Main {
    public static void main(String[] args) {
        Nave naveUm = new Nave(0,0,"N", 1000);
        Nave naveDois = new Nave(0,0,"N", 1000);
        naveUm.irA(4,4, "s");
        System.out.println(naveUm.toString());
        System.out.println(naveUm.hashCode());
        System.out.println(naveUm.equals(naveDois));

        Asteroide asteroideUm = new Asteroide(5, 7, "N", 1500);
        asteroideUm.irA(7,3, "O");
        System.out.println(asteroideUm.toString());
        System.out.println(asteroideUm.hashCode());


    }
}
