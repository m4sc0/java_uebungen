package de.edvschuleplattling.roth.tagungshotel;

import java.security.Key;

/**
 *
 * @author dieter
 */
public class Laptop implements Vermietbar {
    private String seriennummer;
    private String bezeichnung ;

    public Laptop(String seriennummer, String bezeichnung) {
        this.seriennummer = seriennummer;
        this.bezeichnung = bezeichnung;
    }
    
    public double mietKostenProTag(){
        return 19.99;
    }

    @Override
    public String toString() {
        return "Laptop{" + seriennummer + ", " + bezeichnung + '}';
    }
    
    
    
}
