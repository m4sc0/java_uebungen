package com.masco.fxfahrzeuge;

import com.masco.fxfahrzeuge.daten.Fahrzeug;
import javafx.util.StringConverter;

public class FahrzeugConverter extends StringConverter<Fahrzeug> {
    @Override
    public String toString(Fahrzeug fahrzeug) {
        return "" + fahrzeug.getNr() + ": " + fahrzeug.getKz();
    }

    @Override
    public Fahrzeug fromString(String s) {
        return null;
    }
}
