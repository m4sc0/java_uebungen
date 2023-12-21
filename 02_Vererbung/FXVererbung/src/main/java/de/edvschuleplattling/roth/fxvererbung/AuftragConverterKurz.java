package de.edvschuleplattling.roth.fxvererbung;

import de.edvschuleplattling.roth.fxvererbung.daten.Auftrag;
import javafx.util.StringConverter;

public class AuftragConverterKurz extends StringConverter<Auftrag> {
    @Override
    public String toString(Auftrag auftrag) {
        return "" + auftrag.getNr();
    }

    @Override
    public Auftrag fromString(String s) {
        return new Auftrag();
    }
}
