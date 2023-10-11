package ploebl.flughafen;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Testing();
    }

    public static Type getType(double value) {
        if (value <= 34.5) {
            return Type.A;
        } else if (value <= 78.1) {
            return Type.B;
        } else if (value <= 122.3){
            return Type.C;
        } else {
            return null;
        }
    }

    public static int generateRandom(int numDigits) {
        Random random = new Random();

        if (numDigits <= 0 || numDigits > 9) {
            throw new IllegalArgumentException("Number of digits must be between 1 and 9");
        }

        int lowerBound = (int) Math.pow(10, numDigits - 1); // e.g., for 2 digits, lowerBound = 10
        int upperBound = (int) Math.pow(10, numDigits) - 1; // e.g., for 2 digits, upperBound = 99

        return lowerBound + random.nextInt(upperBound - lowerBound + 1);
    }

    public static void Testing() {
        FrachtEinheit f1 = new FrachtEinheit(30);
        FrachtEinheit f2 = new FrachtEinheit(50);
        Ladung ladungToronto = new Ladung(); // Erstellt eine leere Ladung
        ladungToronto.aufladen(f1); // Lädt f1 auf
        ladungToronto.aufladen(f2); // Lädt f2 auf
        System.out.println("Gesamtgewicht: "+ ladungToronto.getGesamtGewicht());
    }
}