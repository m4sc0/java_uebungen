package de.edvschuleplattling.roth.staatundflaechen;


import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

/**
 * Beispielprogramm zur Verwendung fuer Interfaces
 */
public class InterfaceBeispielProg {

    public static void main(String[] args) {
        Rechteck r1 = new Rechteck(2.1, 5.7);
        Rechteck r2 = new Rechteck(5.2, 7.1);
        PlanRechteck pr3 = new PlanRechteck(4.0, 15.7, 2.7, 2.9);
        Staat deutschland = new Staat("Deutschland", 357111.91, "D", new Vermessungspunkt("P0", new Point(3, 5), new Date()));
        Gemeinde metten = new Gemeinde("Metten", 11.91, "Moser", new Vermessungspunkt("P1", new Point(3, 5), new Date()));
        Gemeinde grafling = new Gemeinde("Grafling", 46.28, "Stettmer", new Vermessungspunkt("P2", new Point(3, 5), new Date()));
        Vermessungspunkt vmp1 = new Vermessungspunkt("P3", new Point(3, 5), new Date());

        Flaeche bereiche[] = {metten, grafling, deutschland, r1, r2, pr3};
        Arrays.sort(bereiche, new FlaecheComparator());
        for (int i = 0; i < bereiche.length; i++) {
            System.out.println("Info  : " + bereiche[i].toString());
            System.out.println("Fläche: " + bereiche[i].getFlaeche());
            System.out.println();
        }

        System.out.println("--------------------------------");

        Position pos[] = {pr3, vmp1, metten, grafling, deutschland };
        Arrays.sort(pos, new PositionComparator());
        for (int i = 0; i < pos.length; i++) {
            System.out.println("Info  : " + pos[i].toString());
            System.out.println("Position: [" + pos[i].getX() + ", " + pos[i].getY() + "]");
            System.out.println();
        }

        System.out.println("--------------------------------");
    }
}