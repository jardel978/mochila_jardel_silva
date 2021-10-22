public class Cliente {

    public static void main(String[] args) {
        SerieProxy proxy = new SerieProxy(new GradeSerie());

        try {
            System.out.println(proxy.getSerie("The Flash"));
        } catch (SerieNaoHabilitadaException exc) {
            System.out.println(exc);
        }

        try {
            System.out.println(proxy.getSerie("WandaVision"));
        } catch (SerieNaoHabilitadaException exc) {
            System.out.println(exc);
        }

        try {
            System.out.println(proxy.getSerie("Big bang theory"));
        } catch (SerieNaoHabilitadaException exc) {
            System.out.println(exc);
        }

        try {
            System.out.println(proxy.getSerie("West World"));
        } catch (SerieNaoHabilitadaException exc) {
            System.out.println(exc);
        }

        try {
            System.out.println(proxy.getSerie("Perdidos no Espaço"));
        } catch (SerieNaoHabilitadaException exc) {
            System.out.println(exc);
        }


        try {
            System.out.println(proxy.getSerie("The Flash"));
        } catch (SerieNaoHabilitadaException exc) {
            System.out.println(exc);
        }
//
        try {
            System.out.println(proxy.getSerie("Altered Carbon"));
        } catch (SerieNaoHabilitadaException exc) {
            System.out.println(exc);
        }

        try {
            System.out.println(proxy.getSerie("Star Trek"));
        } catch (SerieNaoHabilitadaException exc) {
            System.out.println(exc);
        }

    }
}
