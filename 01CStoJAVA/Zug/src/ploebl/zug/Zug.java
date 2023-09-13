package ploebl.zug;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Zug {
    private int zugNr;
    private LocalDateTime abfahrt;
    private Lokomotive lok;
    private List<Waggon> waggons;
    private double gesamtGewicht;           // calc
    private double gesamtGewichtWaggons;    // calc

    public Zug(int zugNr, LocalDateTime abfahrt, Lokomotive lok) {
        this.zugNr = zugNr;
        this.abfahrt = abfahrt;
        this.lok = lok;
        this.waggons = new ArrayList<>();
    }

    // Getter
    public int getZugNr() {
        return zugNr;
    }

    public LocalDateTime getAbfahrt() {
        return abfahrt;
    }

    public Lokomotive getLok() {
        return lok;
    }

    public List<Waggon> getWaggons() {
        return waggons;
    }

    public double getGesamtGewicht() {
        return gesamtGewicht;
    }

    public double getGesamtGewichtWaggons() {
        gesamtGewichtWaggons = 0;
        for (Waggon waggon : waggons) {
            gesamtGewichtWaggons += waggon.getGesamtGewicht();
        }
        return gesamtGewichtWaggons;
    }

    // Setter
    public void setZugNr(int zugNr) {
        this.zugNr = zugNr;
    }

    public void setAbfahrt(LocalDateTime abfahrt) {
        this.abfahrt = abfahrt;
    }

    public void setLok(Lokomotive lok) {
        this.lok = lok;
    }

    // Weitere methoden
    public boolean anhaengen(Waggon neu) {
        if (waggons.add(neu)) return true;
        return false;
    }

    public Waggon getMaxWaggon() {
        Waggon res = new Waggon(0, 0,0);
        for (Waggon waggon : waggons) {
            if (waggon.getGesamtGewicht() > res.getGesamtGewicht()) {
                res = waggon;
            }
        }
        return res;
    }

    public double getMaxGewichtWaggon() {
        Waggon res = new Waggon(0, 0,0);
        for (Waggon waggon : waggons) {
            if (waggon.getGesamtGewicht() > res.getGesamtGewicht()) {
                res = waggon;
            }
        }
        return res.getGesamtGewicht();
    }


}

















