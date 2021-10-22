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

//        try {
//            System.out.println(proxy.getSerie("WandaVision"));
//        } catch (SerieNaoHabilitadaException exc) {
//            System.out.println(exc);
//        }

        try {
            System.out.println(proxy.getSerie("WandaVision"));
        } catch (SerieNaoHabilitadaException exc) {
            System.out.println(exc);
        }

        try {
            System.out.println(proxy.getSerie("WandaVision"));
        } catch (SerieNaoHabilitadaException exc) {
            System.out.println(exc);
        }

        try {
            System.out.println(proxy.getSerie("WanaVision"));
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
            System.out.println(proxy.getSerie("Star Trek"));
        } catch (SerieNaoHabilitadaException exc) {
            System.out.println(exc);
        }

    }
}