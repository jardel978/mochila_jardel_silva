public class Main {

    public static void main(String[] args) {

        Container containerUm = new Container(0003, "Inflamável");
        containerUm.setPaisOrigem("China");

        Container containerDois = new Container(0004, "perigoso");
        containerDois.setPaisOrigem("Angola");

        Container containerTres = new Container(0002, "Inflamável");
        containerTres.setPaisOrigem("Brasil");

        Container containerQuatro = new Container(0001, "perigoso");
        containerQuatro.setPaisOrigem("Brasil");

        Porto portoUm = new Porto("Novo Porto");
        portoUm.addContainers(containerUm, containerDois, containerTres, containerQuatro);

        System.out.println(portoUm.ordenarContainers());
        System.out.println("Quantidade de containers: " + portoUm.qtdContainers());
        System.out.println("Quantidade de containers perigosos: " + portoUm.qtdContainersPerigosos());
        System.out.println(portoUm);
//        System.out.println(portoUm.qtdContainers());


    }

}
