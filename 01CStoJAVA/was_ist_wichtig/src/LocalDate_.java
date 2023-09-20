import java.time.LocalDate;

public class LocalDate_ {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        System.out.println(date);

        date = date.plusDays(100);

        System.out.println(date);
    }
}
