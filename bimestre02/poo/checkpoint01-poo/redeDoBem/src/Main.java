import javax.swing.*;
import java.time.LocalDateTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
//      Passo01: Dando boas vindas ao ao usuário!
        JOptionPane.showMessageDialog(null, "Bem vindo à Rede Do Bem! Conectando pessoas e transformando Vidas! "
                , "Rede do Bem", JOptionPane.INFORMATION_MESSAGE);

//      Passo02: Capturando opção de continuar ou encerar o sistema
        int iniciarExperiencia = JOptionPane.showConfirmDialog(null, "Deseja iniciar?", "Rede do Bem",
                JOptionPane.YES_NO_OPTION);

//      EXECUTA O SISTEMA CASO O USUÁRIO DESEJAR!
        if (iniciarExperiencia == 0) {
            try {
//                TEXTES
//                String nomePadrinho = "Carlos";
//                String sobrenomePadrinho = "Pereira";
//                String contaPadrinho = "carlospp";
//                Object generoPadrinho = "masculino";
//                String senhaPadrinho = "cap123";
//
//                String nomeApadrinhado = "Lorena";
//                String sobrenomeApadrinhado = "Campos";
//                String contaApadrinhado = "locampos";
//                Object generoApadrinhado = "feminino";
//                String senhaApadrinhado = "campos324";

//          Passo03: CADASTRANDO PADRINHO(recuperando valores de inputs do usuário)

                JOptionPane.showMessageDialog(null, "Ótimo! Cadastre um Padrinho(Aquele que pode ajudar): "
                        , "Rede do Bem", JOptionPane.INFORMATION_MESSAGE);
                String nomePadrinho = JOptionPane.showInputDialog("Informe o seu nome(Campo Obrigatório e não pode conter Números):");
                String sobrenomePadrinho = JOptionPane.showInputDialog("Informe o seu sobrenome(Campo Obrigatório e não pode conter Números):");
                String contaPadrinho = JOptionPane.showInputDialog("Informe um nome para a sua conta(Campo Obrigatório):");
                Object[] arrayGeneros = {"Maculino", "Feminino", "Outro", "Prefiro não informar"};//array para ser usado como parâmetro opções do JOptionPane Input
                Object generoPadrinho = JOptionPane.showInputDialog(null, "Informe o seu gênero(Campo Obrigatório): ", "Rede do Bem",
                        JOptionPane.QUESTION_MESSAGE, null, arrayGeneros, "Prefiro não informar");
                String senhaPadrinho = JOptionPane.showInputDialog("Crie uma senha(Campo Obrigatório):");
//              Instanciando Padrinho com as entradas do usuário
                Padrinho padrinho = new Padrinho(nomePadrinho, sobrenomePadrinho, contaPadrinho, (String) generoPadrinho, senhaPadrinho);
//                System.out.println(padrinho);

//          Passo04: CADASTRANDO APADRINHADO(recuperando valores de inputs do usuário)

                JOptionPane.showMessageDialog(null, "Pronto! Agora cadastre um Apadrinhado(Aquele que precisa de ajuda): "
                        , "Rede do Bem", JOptionPane.INFORMATION_MESSAGE);
                String nomeApadrinhado = JOptionPane.showInputDialog("Informe o seu nome(Campo Obrigatório):");
                String sobrenomeApadrinhado = JOptionPane.showInputDialog("Informe o seu sobrenome(Campo Obrigatório):");
                String contaApadrinhado = JOptionPane.showInputDialog("Informe um nome para a sua conta(Campo Obrigatório):");
                Object generoApadrinhado = JOptionPane.showInputDialog(null, "Informe o seu gênero(Campo Obrigatório): ", "Rede do Bem",
                        JOptionPane.QUESTION_MESSAGE, null, arrayGeneros, "Prefiro não informar");
                String senhaApadrinhado = JOptionPane.showInputDialog("Crie uma senha:(Campo Obrigatório)");
//              Instanciando Apadrinhado com as entradas do usuário
                Apadrinhado apadrinhado = new Apadrinhado(nomeApadrinhado, sobrenomeApadrinhado, contaApadrinhado, (String) generoApadrinhado, senhaApadrinhado);
//                System.out.println(apadrinhado);

//              Passo05: CRIAÇÃO DE UMA PUBLICAÇÃO PARA PADRINHO
                String necessidadePadrinho = JOptionPane.showInputDialog(padrinho.getNome() + ", vamos criar sua primeira publicação! \n " +
                        "Em que area você se interessa em ajudar?(Financeira, Educacional, Voluntaria...(Campo Obrigatório): ");
                String mensagemPadrinho = JOptionPane.showInputDialog("Escreva aqui a sua mensagem (Campo Obrigatório): ");
                padrinho.publicar(necessidadePadrinho,mensagemPadrinho);
//                System.out.println(padrinho.getListaPublicacoes());

//              Passo06: SETANDO UMA HABILIDADE AO PADRINHO
                Object[] arrayHabilidades = {"Voluntariado", "Ajuda financeira", "Ajuda estudantil", "Doação"};//array para ser usado como parâmetro opções do JOptionPane Input
                Object habilidadePadrinho = JOptionPane.showInputDialog(null, "Como Padrinho, você deve escolher uma " +
                                "habilidade com a qual você" +
                                " pode ajudar alguém: ",
                        "Rede do Bem",
                        JOptionPane.QUESTION_MESSAGE, null, arrayHabilidades, "Voluntariado");

                JOptionPane.showMessageDialog(null, padrinho.informarNovaHabilidade((String) habilidadePadrinho));
//                System.out.println(padrinho.getListaHabilidades());

//              Passo07: CRIAÇÃO DE UMA PUBLICAÇÃO PARA APADRINHADO
                Object necessidadeApadrinhado = JOptionPane.showInputDialog(null, apadrinhado.getNome() + ", faça uma" +
                                " publicação. Com ela você pode solicitar ajuda! \n Escolha a area em que sua " +
                                "necessidade mais se enquadra: ",
                        "Rede do Bem",
                        JOptionPane.QUESTION_MESSAGE, null, arrayHabilidades, "Voluntariado");
                String mensagemApadrinhado = JOptionPane.showInputDialog("Escreva aqui a sua mensagem. Descreva sua " +
                        "necessidade" +
                        " (Campo Obrigatório): ");
                JOptionPane.showMessageDialog(null, apadrinhado.publicar((String) necessidadeApadrinhado,
                        mensagemApadrinhado));
//                System.out.println(apadrinhado.getListaPublicacoes());

//          Passo08: PEDIDO DE AJUDA DO APADRINHADO
                int pedidoAjuda = JOptionPane.showConfirmDialog(null, apadrinhado.getNome() + ", deseja solicitar " +
                                "ajuda?"
                        , "Rede " +
                                "do Bem",
                        JOptionPane.YES_NO_OPTION);
                if(pedidoAjuda == 0)
                    JOptionPane.showMessageDialog(null, apadrinhado.solicitarAjuda(padrinho, 0));//resultado do pedido
//                System.out.println(padrinho.getCausa());

//          Passo09: PADRINHO DECIDE AJUDAR APADRINHADO
                int decisaoPadrinhoAjudar = JOptionPane.showConfirmDialog(null, padrinho.getNome() + ", caso " +
                                "tinham te solicitado, deseja ajuda?"
                        , "Rede " +
                                "do Bem",
                        JOptionPane.YES_NO_OPTION);
                if(decisaoPadrinhoAjudar == 0)
                    JOptionPane.showMessageDialog(null, padrinho.ajudar());
//                System.out.println(padrinho.ajudar());

//          Passo10: EXCLUIR PUBLICAÇÃO DE PADRINHO
                int apagarPublicacao = JOptionPane.showConfirmDialog(null, padrinho.getNome() + ", deseja excluir sua" +
                                " publicação? "
                        , "Rede " +
                                "do Bem",
                        JOptionPane.YES_NO_OPTION);
                if(apagarPublicacao == 0)
                    JOptionPane.showMessageDialog(null, padrinho.apagarPublicacao(0));
//                System.out.println(padrinho.getListaPublicacoes());

            } catch (StringException exc) {
                JOptionPane.showMessageDialog(null, exc.getMessage());
            } finally {
                JOptionPane.showMessageDialog(null, "O programa finalizado! Volte sempre!!!");
            }
        }

//      ENCERRAR O SISTEMA CASO O USUÁRIO DESEJAR!
        else
            JOptionPane.showMessageDialog(null, "Agradecemos sua visita! Volte sempre!!!"
                    , "Rede do Bem", JOptionPane.INFORMATION_MESSAGE);


    }


}