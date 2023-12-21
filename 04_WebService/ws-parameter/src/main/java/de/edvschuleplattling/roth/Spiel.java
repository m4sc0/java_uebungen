package de.edvschuleplattling.roth;

public class Spiel {
    public long eanCode;
    public String titel;
    public int fsk;

    public Spiel() {}

    public Spiel(long eanCode, String titel, int fsk) {
        this.eanCode = eanCode;
        this.titel = titel;
        this.fsk = fsk;
    }
}
