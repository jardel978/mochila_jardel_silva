import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Equipe {

    private String nome;
//    private Jogador jogador = new Jogador(); //se fosse relacionamento 1:1
    private ArrayList<Jogador> listaJogadores = new ArrayList<>();//relacionamento 1:N
//  um arrayList<do tipo Jogador> NOME = novo ArrayLista<>();

    public Equipe(String nome) {
        this.nome = nome;
    }

    public void addJogador(Jogador jogador) {
        this.listaJogadores.add(jogador);
    }

    public void mostrarTitulares() {
        listaJogadores.sort((j1, j2) -> j1.compareTo(j2));//ordenando a lista antes (exercicio pediu)
        for(Jogador jogador : this.listaJogadores) {
            if (jogador.isTitular()) {
                System.out.println(jogador.getNome());
            }
        }
    }

    public int getQtdJogadoresLesionados() {
        int contador = 0;
        for(Jogador jogador : this.listaJogadores) {
            if (jogador.isLesionado() && jogador.isTitular()) {
                contador++;
            }
        }
            return  contador;
    }
}
