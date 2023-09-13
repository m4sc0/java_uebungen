package ploebl.zug;

public class BahnUtil {

    public static void pruefePositiv(double zahl) {
        if (zahl < 0) {
            throw new IllegalArgumentException("Negativer Zahlenwert nicht erlaubt! Wert: " + zahl);
        }
    }

}
