import java.time.LocalDateTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        LocalDateTime dataTime = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dataTimeFormatada = dataTime.format(formato);
        System.out.println(dataTimeFormatada);


}

}