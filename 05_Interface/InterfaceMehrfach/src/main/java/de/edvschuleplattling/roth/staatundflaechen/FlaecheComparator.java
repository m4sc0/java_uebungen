package de.edvschuleplattling.roth.staatundflaechen;

import java.util.Comparator;

public class FlaecheComparator implements Comparator<Flaeche> {

    @Override
    public int compare(Flaeche o1, Flaeche o2) {
        if (o1.getFlaeche() > o2.getFlaeche()) {
            return 1;
        } else {
            return -1;
        }
    }
}
