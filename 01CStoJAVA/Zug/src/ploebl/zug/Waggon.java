package ploebl.zug;

public class Waggon {
    private int waggonNr;
    private double leergewicht;
    private double beladungsGewicht;
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
        return leergewicht + beladungsGewicht;
    }

    // Setter
    public void setWaggonNr(int waggonNr) {
        BahnUtil.pruefePositiv(waggonNr);
        this.waggonNr = waggonNr;
    }

    public void setLeergewicht(double leergewicht) {
        BahnUtil.pruefePositiv(leergewicht);
        this.leergewicht = leergewicht;
    }

    public void setBeladungsGewicht(double beladungsGewicht) {
        BahnUtil.pruefePositiv(beladungsGewicht);
        this.beladungsGewicht = beladungsGewicht;
    }

    @Override
    public String toString() {
        return "Waggon Nr: " + waggonNr + ", Leergewicht: " + leergewicht +
                ", BeladungGewicht: " + beladungsGewicht + ", Gesamtgewicht: " + getGesamtGewicht();
    }
}
