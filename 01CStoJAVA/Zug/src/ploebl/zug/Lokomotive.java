package ploebl.zug;

public class Lokomotive {
    private int lokNr;
    private double leistung;
    private double gewicht;

    public Lokomotive(int lokNr, double leistung, double gewicht) {
        this.lokNr = lokNr;
        this.leistung = leistung;
        this.gewicht = gewicht;
    }

    // Getter
    public int getLokNr() {
        return lokNr;
    }

    public double getLeistung() {
        return leistung;
    }

    public double getGewicht() {
        return gewicht;
    }

    // Setter
    public void setLokNr(int lokNr) {
        this.lokNr = lokNr;
    }

    public void setLeistung(double leistung) {
        BahnUtil.pruefePositiv(leistung);
        this.leistung = leistung;
    }

    public void setGewicht(double gewicht) {
        BahnUtil.pruefePositiv(gewicht);
        this.gewicht = gewicht;
    }

    @Override
    public String toString() {
        return "Lokomotive: " + lokNr + " mit Leistung von " + leistung + "hp und Gewicht von " + gewicht + "kg.";
    }
}
