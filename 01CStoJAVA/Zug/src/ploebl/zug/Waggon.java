package ploebl.zug;

public class Waggon {
    private int waggonNr;
    private double leergewicht;
    private double beladungsGewicht;
    private double gesamtGewicht;

    public Waggon(int waggonNr, double leergewicht, double beladungsGewicht) {
        this.waggonNr = waggonNr;
        this.leergewicht = leergewicht;
        this.beladungsGewicht = beladungsGewicht;
    }

    // Getter
    public int getWaggonNr() {
        return waggonNr;
    }

    public double getLeergewicht() {
        return leergewicht;
    }

    public double getBeladungsGewicht() {
        return beladungsGewicht;
    }

    public double getGesamtGewicht() {
        gesamtGewicht = leergewicht + beladungsGewicht;
        return gesamtGewicht;
    }

    // Setter
    public void setWaggonNr(int waggonNr) {
        this.waggonNr = waggonNr;
    }

    public void setLeergewicht(double leergewicht) {
        this.leergewicht = leergewicht;
    }

    public void setBeladungsGewicht(double beladungsGewicht) {
        this.beladungsGewicht = beladungsGewicht;
    }

    public void setGesamtGewicht(double gesamtGewicht) {
        this.gesamtGewicht = gesamtGewicht;
    }

    @Override
    public String toString() {
        return "Waggon Nr: " + waggonNr + ", Leergewicht: " + leergewicht +
                ", BeladungGewicht: " + beladungsGewicht + ", Gesamtgewicht: " + getGesamtGewicht();
    }
}
