package de.edvschuleplattling.roth.fxvererbung.daten;

public class Adresse {
    private String strasse;
    private String hausNr;
    private String plz;
    private String stadt;

    public Adresse(String strasse, String hausNr, String plz, String stadt) {
        this.strasse = strasse;
        this.hausNr = hausNr;
        this.plz = plz;
        this.stadt = stadt;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public String getHausNr() {
        return hausNr;
    }

    public void setHausNr(String hausNr) {
        this.hausNr = hausNr;
    }

    public String getPlz() {
        return plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public String getStadt() {
        return stadt;
    }

    public void setStadt(String stadt) {
        this.stadt = stadt;
    }
}
