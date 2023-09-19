package com.masco;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;

public class Tour {
    private LocalDateTime startZeit;
    private LKW lkw;
    private Fahrer fahrer;

    public Tour(LocalDateTime startZeit, LKW lkw, Fahrer fahrer) {
        this.startZeit = startZeit;
        this.lkw = lkw;
        this.fahrer = fahrer;
    }

    public LocalDateTime getStartZeit() {
        return startZeit;
    }

    public void setStartZeit(LocalDateTime startZeit) {
        this.startZeit = startZeit;
    }

    public LKW getLkw() {
        return lkw;
    }

    public void setLkw(LKW lkw) {
        this.lkw = lkw;
    }

    public Fahrer getFahrer() {
        return fahrer;
    }

    public void setFahrer(Fahrer fahrer) {
        this.fahrer = fahrer;
    }

    @Override
    public String toString() {
        LocalDateTime startZeit = getStartZeit();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH-mm");
        String datum = startZeit.format(formatter);
        return "Tour " + getLkw().getKennzeichen() + " am " + datum;
    }

    public int[] holeEmpfaenger() {
        int[] empfaenger;

        ArrayList<Integer> temp = new ArrayList<Integer>();
        for (BE cur : getLkw().getBes()) {
            if (temp.contains(cur.getNummer())) {
                 break;
            }
            temp.add(cur.getNummer());
        }

        empfaenger = new int[temp.size()];

        for (int i = 0; i < temp.size(); i++) {
            empfaenger[i] = temp.get(i);
        }

        return empfaenger;
    }
}
