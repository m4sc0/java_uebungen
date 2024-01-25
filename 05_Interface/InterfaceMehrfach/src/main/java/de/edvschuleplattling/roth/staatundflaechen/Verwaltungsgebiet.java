package de.edvschuleplattling.roth.staatundflaechen;

import java.awt.*;

public abstract class Verwaltungsgebiet implements Flaeche, Position {
    private String name;
    private double flaeche;
    private Vermessungspunkt mittelpunkt;

    public Verwaltungsgebiet(String pName, double pFlaeche, Vermessungspunkt pMittelpunkt) {
        setName(pName);
        setFlaeche(pFlaeche);
        setMittelpunkt(pMittelpunkt);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFlaeche() {
        return flaeche;
    }

    public void setFlaeche(double flaeche) {
        this.flaeche = flaeche;
    }

    public Vermessungspunkt getMittelpunkt() {
        return mittelpunkt;
    }

    public void setMittelpunkt(Vermessungspunkt mittelpunkt) {
        this.mittelpunkt = mittelpunkt;
    }

    public boolean groesser(Verwaltungsgebiet pStaat) {
        double gr1 = this.getFlaeche(); // int gr1 = getFlaeche()
        double gr2 = pStaat.getFlaeche();
        if (gr1 > gr2)
            return (true);
        else
            return (false);
        // oder return(getFlaeche() > r.getFlaeche());
    }


}