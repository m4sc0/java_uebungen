/*
 * Copyright 2021 Dieter Roth.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.edvschuleplattling.roth.fxvererbung.daten;


import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

/**
 * @author dieter
 * Datenklasse Auftrag für Testzwecke
 */
public class Auftrag {
    private long nr;
    private LocalDate datum;
    private boolean gewerblich;

    public Auftrag() {
    }

    public Auftrag(long nr, LocalDate datum, boolean gewerblich) {
        this.nr = nr;
        this.datum = datum;
        this.gewerblich = gewerblich;
    }
    
    public long getNr() {
        return nr;
    }

    public void setNr(long nr) {
        this.nr = nr;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }

    public boolean isGewerblich() {
        return gewerblich;
    }

    public void setGewerblich(boolean gewerblich) {
        this.gewerblich = gewerblich;
    }

    @Override
    public String toString() {
        return "Auftrag{" + "nr=" + nr + ", datum=" + datum + ", gewerblich=" + gewerblich + '}';
    }
    
    public static ArrayList<Auftrag> testDaten(){
        ArrayList<Auftrag> auftraege = new ArrayList<>();
        LocalDate heute = LocalDate.now();
        int heuer = heute.getYear();
        int aktNr=1000;
        auftraege.add(new Auftrag(aktNr++, LocalDate.of(heuer,Month.AUGUST,aktNr%3+1), true));
        auftraege.add(new Auftrag(aktNr++, LocalDate.of(heuer,Month.AUGUST,aktNr%3+1), false));
        auftraege.add(new Auftrag(aktNr++, LocalDate.of(heuer,Month.AUGUST,aktNr%3+1), false));
        auftraege.add(new Auftrag(aktNr++, LocalDate.of(heuer,Month.SEPTEMBER,aktNr%3+1), false));
        auftraege.add(new Auftrag(aktNr++, LocalDate.of(heuer,Month.SEPTEMBER,aktNr%3+1), false));
        auftraege.add(new Auftrag(aktNr++, LocalDate.now(), true));
        
        return auftraege;
    }
    
    
}
