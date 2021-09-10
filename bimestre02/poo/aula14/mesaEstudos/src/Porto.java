import java.util.ArrayList;
import java.util.stream.Collectors;

public class Porto {
    private String nome;
    private ArrayList<Container>  listaContainers = new ArrayList<>();
    private ArrayList<Container>  listaContainersPerigosos = new ArrayList<>();

    public Porto(String nome) {
        this.nome = nome;
    }

    public ArrayList<Container> ordenarContainers() {
        this.listaContainers.sort((c1, c2) -> c1.compareTo(c2));
        return listaContainers;
    }

    public int qtdContainers() {
        return  this.listaContainers.size();
    }

    public int qtdContainersPerigosos() {
        for(Container container : this.listaContainers) {
            if(container.getMarca().equalsIgnoreCase("perigoso") && container.getPaisOrigem().equalsIgnoreCase("Desconhecido")) {
              listaContainersPerigosos.add(container);
            }
        }
//      this.listaContainers.removeIf(container -> !container.getMarca().equalsIgnoreCase("perigoso") && !container.getPaisOrigem().equals("Desconhecido"));
//      return  this.listaContainers.size();
        return listaContainersPerigosos.size();
    }

    public void addContainers(Container ...container) {//spread operator
        for(Container unidade : container){
            listaContainers.add(unidade);
        }
    }

    public ArrayList<Container> getListaContainers() {
        return listaContainers;
    }

    @Override
    public String toString() {
        return "Porto{ nome: " + nome + "\n, listaContainers: \n" + this.listaContainers + " \n listaContainersPerigosos: \n" + this.listaContainersPerigosos + " }";
    }
}
