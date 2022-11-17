import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();
        System.out.println(today.format(DateTimeFormatter.ofPattern("dd/MMMM/YY -  HH:mm")));
        ZonedDateTime isoZone = ZonedDateTime.now();
        System.out.println(isoZone);
    }
}