/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package de.edvschuleplattling.roth.staatundflaechen;

/**
 *
 * @author roth
 */
public class Staat extends Verwaltungsgebiet {

    private String krzl;
    private Vermessungspunkt mittelpunkt;

    public void setKrzl(String krzl) {
        this.krzl = krzl;
    }

    public String getKrzl() {
        return krzl;
    }

    public Staat(String pName, double pFlaeche, String krzl, Vermessungspunkt mittelpunkt) {
        super(pName,pFlaeche, mittelpunkt);
        setKrzl(krzl);
    }

    @Override
    public String toString() {
        return "Staat{" + getName() + ", " + krzl + '}';
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
