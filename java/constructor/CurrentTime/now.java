package constructor.CurrentTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class now {
    public static void main(String[] args) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("-MM-dd ");
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("Current Date and Time: " + formattedDateTime);
    }
}