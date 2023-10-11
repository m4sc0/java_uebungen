package haustier;


import java.time.LocalDate;

/**
 *
 * @author roth
 */
public class Katze extends Haustier {

    public Katze(String name, LocalDate geburtstag) {
        super(name, geburtstag);
    }

    public Katze(Katze alt) {
        this(alt.getName(), alt.getGeburtstag());
    }

    public boolean equals(Katze tier) {
        return this.getName().equals(tier.getName());
    }

    public void sag(int i) {
        switch (i) {
            case 0:
                sag("Miau");
                break;
            case 1:
                sag("Mimi");
                break;
            default:
                sag("Kann ich nicht");
                break;
        }
    }

    public void sag() {
        sag(0);
    }

    public void sag(String text) {
        System.out.println(text);
    }

    public String toString() {
        return ("Katze[" + getName() + "," + getGeburtstag() + "]");
    }

}
