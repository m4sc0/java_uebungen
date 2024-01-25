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
public class Hausmeister extends Mitarbeiter {
    
    private String serviceBereich;
    
    public Hausmeister(String nr, String name, String serviceBereich) {
        super(nr, name);
        this.serviceBereich = serviceBereich;
    }

    public String getServiceBereich() {
        return serviceBereich;
    }

    @Override
    public String toString() {
        return "Hausmeister{" + getName() + ", " + serviceBereich + '}';
    }
    
    
}
