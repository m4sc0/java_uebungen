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
package com.masco.fxfahrzeuge.daten;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author dieter
 */
public class Fahrzeug {
    
    private long nr;
    private String kz;
    private LocalDate erstZulassung;

    public Fahrzeug(long nr, String kz, LocalDate erstZulassung) {
        this.nr = nr;
        this.kz = kz;
        this.erstZulassung = erstZulassung;
    }

    public long getNr() {
        return nr;
    }

    public void setNr(long nr) {
        this.nr = nr;
    }

    public String getKz() {
        return kz;
    }

    public void setKz(String kz) {
        this.kz = kz;
    }

    public LocalDate getErstZulassung() {
        return erstZulassung;
    }

    public void setErstZulassung(LocalDate erstZulassung) {
        this.erstZulassung = erstZulassung;
    }

    @Override
    public String toString() {
        return "Fahrzeug{" + "nr=" + nr + ", kz=" + kz + ", erstZulassung=" + erstZulassung + '}';
    }
    
    public static ArrayList<Fahrzeug> testDaten(){
        ArrayList<Fahrzeug> fahrzeuge = new ArrayList<>();
        
        long aktNr = 4005430000l;
        fahrzeuge.add(new Fahrzeug(aktNr+=230000, "DEG-P 512", LocalDate.of(2015,4,21)));
        fahrzeuge.add(new Fahrzeug(aktNr+=230000, "DEG-Y 500", LocalDate.of(2016,12,25)));
        fahrzeuge.add(new Fahrzeug(aktNr+=230000, "DEG-LR 19", LocalDate.of(2014,10,7)));
        fahrzeuge.add(new Fahrzeug(aktNr+=230000, "N-KR 2405", LocalDate.of(2020,5,24)));
        fahrzeuge.add(new Fahrzeug(aktNr+=230000, "DEG-MR 2", LocalDate.of(2020,5,24)));
        fahrzeuge.add(new Fahrzeug(aktNr+=230000, "DEG-DI 63", LocalDate.of(2014,4,30)));
        
        return fahrzeuge;
    }
    

}
