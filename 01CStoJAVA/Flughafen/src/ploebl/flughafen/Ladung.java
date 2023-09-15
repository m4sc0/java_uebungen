package ploebl.flughafen;

import java.util.ArrayList;
import java.util.List;

public class Ladung {
    private final int LIMIT = 400;

    private int code;
    private double weight;
    private List<FrachtEinheit> einheiten;

    public Ladung(int code) {
        this.code = Main.generateRandom(10);
        this.einheiten = new ArrayList<>();
        this.weight = 0;
    }

    public void aufladen(FrachtEinheit neu) {
        if (getAllWeights() + neu.getWeight() <= LIMIT)
            this.einheiten.add(neu);
        else
            throw new IllegalArgumentException("Weight of Frachteinheit is too much to handle!");
    }

    public double getAllWeights() {
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
        return getAllWeights() / getCount();
    }

    public boolean canBeLoaded(FrachtEinheit einheit) {
        if (this.getAllWeights() + einheit.getWeight() <= LIMIT)
            return true;
        return false;
    }
}
