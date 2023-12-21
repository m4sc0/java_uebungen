package de.edvschuleplattling.roth;

import java.util.ArrayList;

public class SpielDaten {

    private static ArrayList<Spiel> spiele = new ArrayList<>();
    static {
        long eanNr = 1234567890123L;

        spiele.add(new Spiel(eanNr+=1, "Super Mario", 10));
        spiele.add(new Spiel(eanNr+=2, "Super Mario 2", 10));
        spiele.add(new Spiel(eanNr+=3, "Super Mario 3", 10));
        spiele.add(new Spiel(eanNr+=4, "Super Mario 4", 10));
        spiele.add(new Spiel(eanNr+=5, "Super Mario 5", 10));
        spiele.add(new Spiel(eanNr+=6, "Fortnite", 16));
        spiele.add(new Spiel(eanNr+=7, "COD: MW2", 18));
    }

    public static ArrayList<Spiel> alleSpiele(){
        return spiele;
    }

    public static Spiel findByEAN(String ean){
        for (Spiel spiel : spiele) {
            if (spiel.eanCode == Long.parseLong(ean)) {
                return spiel;
            }
        }
        return null;
    }

    public static Spiel findContainsTitel(String titel) {
        for (Spiel spiel : spiele) {
            if (spiel.titel.contains(titel)) {
                return spiel;
            }
        }
        return null;
    }
}
