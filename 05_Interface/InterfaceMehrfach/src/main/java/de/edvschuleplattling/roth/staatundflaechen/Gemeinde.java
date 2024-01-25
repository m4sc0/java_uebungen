
package de.edvschuleplattling.roth.staatundflaechen;

/**
 *
 * @author roth
 */
public class Gemeinde extends Verwaltungsgebiet {

    private String buergerMeister;

    public String getBuergerMeister() {
        return buergerMeister;
    }

    public void setBuergerMeister(String buergerMeister) {
        this.buergerMeister = buergerMeister;
    }

    public Gemeinde(String name, double flaeche, String buergerMeister, Vermessungspunkt mittelpunkt) {
        super(name,flaeche, mittelpunkt);
        setBuergerMeister(buergerMeister);
    }

    @Override
    public String toString() {
        return "Gemeinde{" + getName() + ", " + buergerMeister + '}';
    }


    @Override
    public double getX() {
        return getMittelpunkt().getX();
    }

    @Override
    public double getY() {
        return getMittelpunkt().getY();
    }
}
