package de.edvschuleplattling.roth.staatundflaechen;

// Rechteck das auch eine Position hat
class PlanRechteck extends Rechteck implements Position {
    private double x;
    private double y;

    public PlanRechteck(double laenge, double breite, double x, double y) {
        super(laenge, breite);
        setX(x);
        setY(y);
    }

    public double getX() {
        return (x);
    }

    public double getY() {
        return (y);
    }

    public void setX(double pX) {
        x = pX;
    }

    public void setY(double pY) {
        y = pY;
    }

    public String toString() {
        String str = "PlanRechteck[=" + getLaenge() + ",b=" + getBreite() + ",x=";
        str = str + getX() + ",y=" + getY() + "]";
        return (str);
    }
}