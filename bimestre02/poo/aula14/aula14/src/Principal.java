public class Principal {

    public static void main(String[] args) {

        Jogador jardel = new Jogador("Jardel", 10, false, true);
        Jogador nelson = new Jogador("Nelson", 1, false, true);

        Equipe turma03 = new Equipe("Turma-03");
        turma03.addJogador(nelson);
        turma03.addJogador(jardel);

        turma03.mostrarTitulares();
        System.out.println(turma03.getQtdJogadoresLesionados());
    }

}
