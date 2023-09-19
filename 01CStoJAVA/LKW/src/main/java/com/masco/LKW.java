package com.masco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LKW {
    private String kennzeichen;
    private int maxGewicht;
    private Tour tour;
    private Fahrer fahrer;
    private ArrayList<BE> bes;

    public LKW(String kennzeichen, int maxGewicht, Tour tour, Fahrer fahrer) {
        this.kennzeichen = kennzeichen;
        this.maxGewicht = maxGewicht;
        this.tour = tour;
        this.fahrer = fahrer;
        this.bes = new ArrayList<>();
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public void setKennzeichen(String kennzeichen) {
        this.kennzeichen = kennzeichen;
    }

    public int getMaxGewicht() {
        return maxGewicht;
    }

    public void setMaxGewicht(int maxGewicht) {
        this.maxGewicht = maxGewicht;
    }

    public Tour getTour() {
        return tour;
    }

    public void setTour(Tour tour) {
        this.tour = tour;
    }

    public Fahrer getFahrer() {
        return fahrer;
    }

    public void setFahrer(Fahrer fahrer) {
        this.fahrer = fahrer;
    }

    public ArrayList<BE> getBes() {
        return bes;
    }

    @Override
    public String toString() {
        return "LKW (\"" + getKennzeichen() + "\", " + getLadungGewicht() + ")";
    }

    public ArrayList<BE> belade(ArrayList<BE> neueLadung) {
        neueLadung.sort(Comparator.comparing(BE::getGewicht).reversed());
        ArrayList<BE> sorted = new ArrayList<>();

        for (BE be : neueLadung) {
            if (be.getGewicht() <= this.maxGewicht) {
                sorted.add(be);
                neueLadung.remove(be);
            }
        }

        return neueLadung;
    }

    public int getLadungGewicht() {
        int gewicht = 0;
        for (BE be : this.bes) {
            gewicht += be.getGewicht();
        }
        return gewicht;
    }
}
