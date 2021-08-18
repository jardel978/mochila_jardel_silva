package mesa05Classe;

public class Main {
    public static void main(String[] args) {
        UsuarioJogo usuarioUm = new UsuarioJogo("Felipe", "Rodrigues");
        usuarioUm.setPontuacao(1000);
        System.out.println(usuarioUm.aumentarPontuacao());
        System.out.println(usuarioUm.bonus(200));
        usuarioUm.setNivel(1);
        System.out.println(usuarioUm.getNivel());
        System.out.println("--------------------------------------------------------------------");
        UsuarioJogo usuarioDois = new UsuarioJogo("Luis", "VidaLoka");
        usuarioDois.setPontuacao(475);
        System.out.println(usuarioDois.bonus(200));
        System.out.println(usuarioDois.aumentarPontuacao());
        usuarioDois.setNivel(1);
        System.out.println(usuarioDois.getNivel());

        System.out.println("--------------------------------------------------------------------");
        UsuarioJogo usuarioTres = new UsuarioJogo("David", "Silva");
        informacoesJogadores(usuarioTres, 1000, 300, 2);

    }

   static void informacoesJogadores(UsuarioJogo usuario, Integer pontuacao, Integer bonus, Integer nivel) {
       usuario.setPontuacao(pontuacao);
       System.out.println(usuario.aumentarPontuacao());
       System.out.println(usuario.bonus(bonus));
       usuario.setNivel(nivel);
       System.out.println(usuario.getNivel());
    }
}
