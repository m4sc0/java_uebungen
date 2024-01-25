/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.edvschuleplattling.roth.tagungshotel;

/**
 *
 * @author dieter
 */
public abstract class Mitarbeiter {
    
    private String nr;
    private String name;

    public Mitarbeiter(String nr, String name) {
        this.nr = nr;
        this.name = name;
    }

    public String getNr() {
        return nr;
    }

    public void setNr(String nr) {
        this.nr = nr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    
    
}
