package de.edvschuleplattling.roth.lambdaneu;

public class OperiereProg {
    public static void main(String[] args) {
        Operiere p = (x,y) -> x+y;

        // Rufe rechne mit den Parametern 2 und 0.5 auf

    }

    public static void rechne(Operiere o, double d1, double d2){
        System.out.println(o.operiere(d1,d2));
    }
}
