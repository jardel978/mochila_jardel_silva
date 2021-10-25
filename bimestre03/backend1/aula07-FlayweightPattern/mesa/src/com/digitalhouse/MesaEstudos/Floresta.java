package com.digitalhouse.MesaEstudos;

public class Floresta {

    public static void main(String[] args) {

        ArvoreFactory arvoreFactory = new ArvoreFactory();

        for (int i = 0; i < 500000; i++) {
            try {
                System.out.println(arvoreFactory.getTipoArvore("Ornamental"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage().toString());
            }

            try {
                System.out.println(arvoreFactory.getTipoArvore("Frutífera"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }

//    try {
//        System.out.println(arvoreFactory.getTipoArvore("Florífera"));
//    } catch (Exception ex) {
//        System.out.println(ex.getMessage());
//    }

    try {
        System.out.println(arvoreFactory.getTipoArvore("Pequeno Porte"));
    } catch (Exception ex) {
        System.out.println(ex.getMessage());
    }


        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memória utilizada: " + (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024));

    }
}
