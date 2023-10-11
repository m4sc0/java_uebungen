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



    public String toString() {
        return ("Katze[" + getName() + "," + getGeburtstag() + "]");
    }

}
