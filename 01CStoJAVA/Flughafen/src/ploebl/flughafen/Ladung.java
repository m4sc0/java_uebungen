package ploebl.flughafen;

import java.util.ArrayList;
import java.util.List;

public class Ladung {
    private final int LIMIT = 400;

    private int code;
    private double weight;
    private List<FrachtEinheit> einheiten;

    public Ladung() {
        this.code = Main.generateRandom(9);
        this.einheiten = new ArrayList<>();
        this.weight = 0;
    }

    public void aufladen(FrachtEinheit neu) {
        if (getGesamtGewicht() + neu.getWeight() <= LIMIT)
            this.einheiten.add(neu);
        else
            throw new IllegalArgumentException("Weight of Frachteinheit is too much to handle!");
    }

    public double getGesamtGewicht() {
        double sum = 0;
        for (FrachtEinheit frachtEinheit : einheiten) {
            sum += frachtEinheit.getWeight();
        }
        return sum;
    }

    public int getCount() {
        return (int) einheiten.stream().count();
    }

    public double getAverageWeight() {
        return getGesamtGewicht() / getCount();
    }

    public boolean canBeLoaded(FrachtEinheit einheit) {
        if (this.getGesamtGewicht() + einheit.getWeight() <= LIMIT)
            return true;
        return false;
    }
}
