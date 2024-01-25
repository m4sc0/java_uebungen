package de.edvschuleplattling.roth.tagungshotel;

public class Convenient extends Mitarbeiter implements Vermietbar {

    private int quali;
    private static double qKosten[] = {299.99, 599.99, 1099.99};

    public Convenient(String nr, String name, int quali) {
        super(nr, name);
        this.quali = quali;
    }

    public double mietKostenProTag() {
        return (qKosten[quali]);
    }


    public int getQuali() {
        return quali;
    }

    @Override
    public String toString() {
        return "Convenient{" + getName() + "," + quali + '}';
    }
    
    
}
