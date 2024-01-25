/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package de.edvschuleplattling.roth.staatundflaechen;

import java.awt.Point;
import java.util.Date;

/**
 *
 * @author roth
 */
public class Vermessungspunkt extends GeoObjekt implements Position {

    Point koordinate;
    Date  gemessenAm;

    public Date getGemessenAm() {
        return gemessenAm;
    }

    public void setGemessenAm(Date gemessenAm) {
        this.gemessenAm = gemessenAm;
    }

    public Point getKoordinate() {
        return koordinate;
    }

    public void setKoordinate(Point koordinate) {
        this.koordinate = koordinate;
    }

    public Vermessungspunkt(String pId, Point koordinate, Date gemessenAm) {
        super(pId);
        this.koordinate = koordinate;
        this.gemessenAm = gemessenAm;
    }

    public double getX() {
        return(koordinate.getX());
    }

    public double getY() {
        return(koordinate.getY());
    }

    @Override
    public String toString() {
        return "Vermessungspunkt{" + getId() + ", " + koordinate + ", " + gemessenAm + '}';
    }



}
