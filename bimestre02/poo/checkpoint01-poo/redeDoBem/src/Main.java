import javax.swing.*;
import java.time.LocalDateTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

//        String nomePadrinho = JOptionPane.showInputDialog("Informe o seu nome(Campo Obrigatório):");
//        String sobrenomePadrinho = JOptionPane.showInputDialog("Informe o seu sobrenome(Campo Obrigatório):");
//        String contaPadrinho = JOptionPane.showInputDialog("Informe um nome para a sua conta(Campo Obrigatório):");
//        String generoPadrinho = JOptionPane.showInputDialog("Informe o seu gênero(Masculino, Feminino ou Outro(Campo Obrigatório):");
//        String senhaPadrinho = JOptionPane.showInputDialog("Crie uma senha(Campo Obrigatório):");

//        String nomeApadrinhado = JOptionPane.showInputDialog("Informe o seu nome(Campo Obrigatório):");
//        String sobrenomeApadrinhado = JOptionPane.showInputDialog("Informe o seu sobrenome(Campo Obrigatório):");
//        String contaApadrinhado = JOptionPane.showInputDialog("Informe um nome para a sua conta(Campo Obrigatório):");
//        String generoApadrinhado = JOptionPane.showInputDialog("Informe o seu gênero(Masculino, Feminino ou Outro(Campo Obrigatório):");
//        String senhaApadrinhado = JOptionPane.showInputDialog("Crie uma senha:(Campo Obrigatório)");
        try {

//
//        Padrinho padrinhoLucas = new Padrinho(nomePadrinho, sobrenomePadrinho, contaPadrinho, generoPadrinho, senhaPadrinho);
        Padrinho padrinhoLucas = new Padrinho("Lucas", "silva", "luSilva", "m", "kasfgksfgks");
            System.out.println(padrinhoLucas.publicar("Ajudar a quem pre12cisa", "Caso precise de ajuda, conte comigo! No que eu puder " +
                "ajudar " +
                "estou disposto"));
            System.out.println(padrinhoLucas.publicar("sdf", "Caso precise de ajuda, conte comigo! No que eu puder " +
                "ajudar " +
                "estou disposto"));
//        System.out.println(padrinhoLucas.ajudar());
//        System.out.println(padrinhoLucas.informarNovaHabilidade("ajuda financeira"));
//        System.out.println(padrinhoLucas.getListaHabilidades());
        System.out.println(padrinhoLucas.getListaPublicacoes());
        System.out.println(padrinhoLucas.apagarPublicacao(7));
        System.out.println(padrinhoLucas.getListaPublicacoes());
        } catch (StringException e) {
            System.out.println(e.getMessage());
        } finally {
        System.out.println("Programa finalizado! Volte sempre!!!");
    }

//
        try {
            Padrinho padrinhoLucas = new Padrinho("Luc1as", "sil1va", "luSilva", "m", "kasfgksfgks");
            Apadrinhado apadrinhadoMaria = new Apadrinhado("Maria", "silva", "jasilva", "m", "kasfgksfgks");

            System.out.println(apadrinhadoMaria.publicar("ajuda financeira", "Olá, necessito de ajuda financeira para" +
                    " comprar os" +
                    " " +
                    "materias escolares das minhas crianças"));

//            System.out.println(apadrinhadoMaria.getListaPublicacoes());
//
//            System.out.println(apadrinhadoMaria.apagarPublicacao(0));
//            System.out.println(apadrinhadoMaria.getListaPublicacoes());
//
//            System.out.println(padrinhoLucas.informarNovaHabilidade("ajuda financeira"));
////            System.out.println(apadrinhadoMaria.solicitarAjuda(padrinhoLucas, 0));
//            System.out.println(padrinhoLucas.getCausa());
//            System.out.println(padrinhoLucas.ajudar());


        }catch (StringException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Programa finalizado! Volte sempre!!!");
        }

//

    }


}