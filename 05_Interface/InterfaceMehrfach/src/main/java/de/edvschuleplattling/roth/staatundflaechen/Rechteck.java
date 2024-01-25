package de.edvschuleplattling.roth.staatundflaechen;

/**
 * Die Beschreibung des Typs hier eingeben.
 * Erstellungsdatum: (08.11.2000 10:46:03)
 *  * @author Dieter Roth <A HREF="mailto:roth@edvschule-plattling.de">roth@edvschule-plattling.de</A><BR>
 */
public class Rechteck implements Flaeche {

    private double laenge;
    private double breite;

    public Rechteck() {
        laenge = 1;
        breite = 1; // this(1,1);
    }

    public Rechteck(double laenge) {
        this(laenge, 1);
    }

    public Rechteck(double laenge, double breite) {
        setLaenge(laenge);
        setBreite(breite);
    }

    public Rechteck(Rechteck alt) {
        this(alt.getLaenge(), alt.getBreite());
    }

    public double getLaenge() {
        return laenge;
    }

    public void setLaenge(double laenge) {
        this.laenge = laenge;
    }

    public double getBreite() {
        return breite;
    }

    public void setBreite(double breite) {
        this.breite = breite;
    }

    
    
    
    public void erhoeheLaenge() {
        laenge++; // setLaenge(getpLaenge()+1);
    }

    public void erhoeheLaenge(double delta) {
        laenge += delta;
    }

    public double getFlaeche() {
        return (getLaenge() * getBreite());
    }

    public boolean groesser(Rechteck anderes) {
        double gr1 = this.getFlaeche();
        double gr2 = anderes.getFlaeche();
        if (gr1 > gr2) {
            return (true);
        } else {
            return (false);
        }
        // oder return(getFlaeche() > r.getFlaeche());
    }

    public String toString() {
        String str = "Rechteck[" + getLaenge() + "," + getBreite() + "]";
        return (str);
    }
    
    
    
}
