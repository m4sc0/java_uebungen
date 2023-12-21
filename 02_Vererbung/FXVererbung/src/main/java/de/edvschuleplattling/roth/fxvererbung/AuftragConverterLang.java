package de.edvschuleplattling.roth.fxvererbung;

import de.edvschuleplattling.roth.fxvererbung.daten.Auftrag;
import javafx.util.StringConverter;

import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class AuftragConverterLang extends StringConverter<Auftrag> {
    @Override
    public String toString(Auftrag auftrag) {
        return "" + String.format("%010d", auftrag.getNr()) + ": " + auftrag.getDatum().format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    @Override
    public Auftrag fromString(String s) {
        return null;
    }
}
