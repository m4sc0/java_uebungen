package haustier;

import java.time.LocalDate;

public class Henne extends Haustier{

    public Character gueteKlasse;

    public Henne(String name, LocalDate geburtstag, Character gueteKlasse) {
        super(name, geburtstag);
        setGueteKlasse(gueteKlasse);
    }

    public Henne(Henne alt) {
        super(alt.getName(), alt.getGeburtstag());
        setGueteKlasse(alt.getGueteKlasse());
    }

    public Character getGueteKlasse() {
        return gueteKlasse;
    }

    public void setGueteKlasse(Character gueteKlasse) {
        this.gueteKlasse = gueteKlasse;
    }

    public boolean istPowerHenne() {
        return getGueteKlasse().equals('A');
    }

    @Override
    public String toString() {
        return ("Henne[" + getName() + "," + getGeburtstag() + "," + getGueteKlasse() + "]");
    }
}
