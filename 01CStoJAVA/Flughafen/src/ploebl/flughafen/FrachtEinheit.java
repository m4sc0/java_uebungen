package ploebl.flughafen;

import java.util.*;

public class FrachtEinheit {
    private Type typ;
    private double weight;
    private int code;

    public FrachtEinheit(double weight) {
        this.weight = weight;
        this.typ = Main.getType(this.weight);
        this.code = Main.generateRandom(8);
    }

    public Type getTyp() {
        return typ;
    }

    public void setTyp(Type typ) {
        this.typ = typ;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
