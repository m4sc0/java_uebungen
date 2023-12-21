package de.edvschuleplattling.roth;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Hält Fahrzeuge im Speicher
 * Primitive Zugriffsfunktionen für Tests
 */
public class FahrzeugDaten {

    private static ArrayList<Fahrzeug> fahrzeuge = new ArrayList<>();
    static {
        long aktNr = 4005430000l;
        fahrzeuge.add(new Fahrzeug(aktNr+=230000, "DEG-P 512", false));
        fahrzeuge.add(new Fahrzeug(aktNr+=230000, "DEG-Y 500", false));
        fahrzeuge.add(new Fahrzeug(aktNr+=230000, "DEG-LR 19",true));
        fahrzeuge.add(new Fahrzeug(aktNr+=230000, "N-KR 2405", true));
        fahrzeuge.add(new Fahrzeug(aktNr+=230000, "DEG-MR 2", false));
        fahrzeuge.add(new Fahrzeug(aktNr+=230000, "DEG-DI 63", true));
        fahrzeuge.add(new Fahrzeug(aktNr+=230000, "DEG-LR 690", false));
        fahrzeuge.add(new Fahrzeug(aktNr+=230000, "DEG-ME 540", false));
    }

    public static ArrayList<Fahrzeug>  alleFahrzeuge(){
        return fahrzeuge;
    }
}
