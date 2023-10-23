package haustier;

import java.time.LocalDate;

public class Kuh extends Haustier{

    private double milchmenge;

    public Kuh(String name, LocalDate geburtstag, double milchmenge) {
        super(name, geburtstag);
        setMilchmenge(milchmenge);
    }

    public Kuh(Kuh alt) {
        this(alt.getName(), alt.getGeburtstag(), alt.getMilchmenge());
    }

    public double getMilchmenge() {
        return milchmenge;
    }

    public void setMilchmenge(double milchmenge) {
        this.milchmenge = milchmenge;
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

    @Override
    public String toString() {
        return ("Kuh[" + getName() + "," + getGeburtstag() + "," + getMilchmenge() + "]");
    }
}
