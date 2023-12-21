package de.edvschuleplattling.roth;

public class Fahrzeug {
    public long nr;
    public String kz;
    public boolean emotor;

    public Fahrzeug() {}

    public Fahrzeug(long nr, String kz, boolean emotor) {
        this.nr = nr;
        this.kz = kz;
        this.emotor = emotor;
    }
}
