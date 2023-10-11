import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatter_ {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();

        // Erstelle einen DateTimeFormatter für das Format "dd/MM/yyyy"
        DateTimeFormatter initialFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Zeige das Datum im Format "dd/MM/yyyy"
        System.out.println("Aktuelles Datum im Format 'dd/MM/yyyy': " + currentDate.format(initialFormat));

        // Erstelle einen DateTimeFormatter für das Format "MMMM d, yyyy"
        DateTimeFormatter newFormat = DateTimeFormatter.ofPattern("MMMM d, yyyy");

        // Konvertiere das Datum in das Format "MMMM d, yyyy"
        System.out.println("Aktuelles Datum im Format 'MMMM d, yyyy': " + currentDate.format(newFormat));
    }
}
