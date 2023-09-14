package ploebl.zug;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Zug {
    private int zugNr;
    private LocalDateTime abfahrt;
    private Lokomotive lok;
    private List<Waggon> waggons;

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
        return lok.getGewicht() + getGesamtGewichtWaggons();
    }

    public double getGesamtGewichtWaggons() {
        double sum = 0;
        for (Waggon waggon : waggons) {
            sum += waggon.getGesamtGewicht();
        }
        return sum;
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
        waggons.add(neu);
        return true;
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

    public double getStundenBisAbfahrt() {
        LocalDateTime now = LocalDateTime.now();
        long minutesUntilDeparture = now.until(abfahrt, ChronoUnit.MINUTES);
        return minutesUntilDeparture / 60.0;
    }

    public void abkoppeln(Waggon w) {
        if (waggons.contains(w)) {
            waggons.remove(w);
        }
    }

    public ArrayList<Waggon> abkoppeln(int i) {
        ArrayList<Waggon> res = new ArrayList<>();
        for (int j = 0; j < i; j++) {
            res.set(j, waggons.get(j));
        }
        return res;
    }

    @Override
    public String toString() {
        return "Zug{" +
                "zugNr=" + zugNr +
                ", abfahrt=" + abfahrt +
                ", lok=" + lok +
                ", waggons=" + waggons.size() + " waggons" +
                ", gesamtGewicht=" + getGesamtGewicht() +
                ", stundenBisAbfahrt=" + getStundenBisAbfahrt() +
                '}';
    }



}

















