import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Publicacao<Usuario> implements ValidadorString{
    private Random random = new Random();//para gerar um ID para a publicação
    private int id = random.nextInt(1700);
    private LocalDateTime dataTime = LocalDateTime.now();//pegando data local no momento da instanciação da publicação
    private DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");//definindo formato para data
    private String dataTimeFormatada = dataTime.format(formato);//formatando data
    private Usuario criador;
    private String necessidade;
    private String mensagem;

    public Publicacao(Usuario criador, String necessidade, String mensagem) {
        this.criador = criador;
        this.necessidade = necessidade;
        this.mensagem = mensagem;
    }

    @Override
    public boolean validarString(String campo) {
        return campo.toLowerCase().matches("[a-z]+");
    }

    public int getId() {
        return id;
    }

    public Usuario getCriador() {
        return criador;
    }

    public LocalDateTime getDataTime() {
        return dataTime;
    }

    public String getNecessidade() {
        return necessidade;
    }

    public String getMensagem() {
        return mensagem;
    }

    public String getDataTimeFormatada() {
        return dataTimeFormatada;
    }
}
