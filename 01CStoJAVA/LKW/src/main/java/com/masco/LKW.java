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

    public LKW(String kennzeichen, int maxGewicht) {
        this.kennzeichen = kennzeichen;
        this.maxGewicht = maxGewicht;
        this.tour = null;
        this.fahrer = null;
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
        if (tour == null) throw new IllegalArgumentException("Tour ist null");
        if (fahrer == null) throw new IllegalArgumentException("Fahrer ist null");
        return "LKW (\"" + getKennzeichen() + "\", " + getLadungGewicht() + ")";
    }

    public ArrayList<BE> belade(ArrayList<BE> neueLadung) {
        neueLadung.sort(Comparator.comparing(BE::getGewicht).reversed());

        int currentWeight = getLadungGewicht();
        ArrayList<BE> toRemove = new ArrayList<>();

        for (BE be : neueLadung) {
            if (currentWeight + be.getGewicht() <= this.maxGewicht) {
                this.bes.add(be);
                currentWeight += be.getGewicht();
                toRemove.add(be);
            }
        }

        neueLadung.removeAll(toRemove);
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
