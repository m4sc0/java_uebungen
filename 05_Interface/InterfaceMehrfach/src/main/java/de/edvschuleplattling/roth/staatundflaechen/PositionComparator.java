package de.edvschuleplattling.roth.staatundflaechen;

import java.util.Comparator;

public class PositionComparator implements Comparator<Position> {

    @Override
    public int compare(Position o1, Position o2) {
        if (o1.getX() > o2.getX()) {
            return 1;
        } else {
            return -1;
        }
    }
}
