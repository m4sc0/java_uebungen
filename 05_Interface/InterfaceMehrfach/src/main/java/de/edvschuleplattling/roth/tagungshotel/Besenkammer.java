package de.edvschuleplattling.roth.tagungshotel;

public class Besenkammer extends Raum {

    private int anzahlBesen;

    public Besenkammer(String nr, double flaeche, int pAnzahlBesen) {
        super(nr, flaeche);
        anzahlBesen = pAnzahlBesen;
    }

    public int getAnzahlBesen() {
        return anzahlBesen;
    }

    public String getServiceBereich() {
        return "Reinigung";
    }

    @Override
    public String toString() {
        return "Besenkammer{" + getNr() +","+ getAnzahlBesen() + '}';
    }
    
    
}
