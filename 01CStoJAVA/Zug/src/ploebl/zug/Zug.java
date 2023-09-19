package ploebl.zug;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Zug {
    private int zugNr;
    private LocalDateTime abfahrt;
    private Lokomotive lok;
    private List<Waggon> waggons;

    public Zug(int zugNr, Lokomotive lok, LocalDateTime abfahrt) {
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
        double value = this.getGesamtGewicht() * 1.1;
        System.out.println(value);
        if (value <= this.getLok().getLeistung()) {
            waggons.add(neu);
            return true;
        } else {
            return false;
        }
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
        Duration dauer = Duration.between(now, this.abfahrt);
        return dauer.toMinutes()/60.0;
    }

    public Waggon abkoppeln(Waggon w) {
        if (waggons.contains(w)) {
            waggons.remove(w);
        }
        return w;
    }

    public ArrayList<Waggon> abkoppeln(int i) {
        ArrayList<Waggon> res = new ArrayList<>();
        for (int j = 0; j < i; j++) {
            res.set(j, waggons.get(j));
            this.abkoppeln(waggons.get(j));
        }
        return res;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Zugnr: ").append(zugNr).append(", Abfahrt: ")
                .append(abfahrt.getDayOfWeek()).append(", ")
                .append(abfahrt.getDayOfMonth()).append(". ")
                .append(abfahrt.getMonth()).append(" ")
                .append(abfahrt.getYear()).append(" um ")
                .append(abfahrt.toLocalTime()).append("\n")
                .append(lok.toString()).append("\n");

        for (int i = 0; i < waggons.size(); i++) {
            sb.append(i+1).append(".").append(waggons.get(i).toString()).append("\n");
        }

        sb.append("Gesamtgewicht: ").append(String.format("%.1f", getGesamtGewicht())).append(" t");

        return sb.toString();
    }




}

















