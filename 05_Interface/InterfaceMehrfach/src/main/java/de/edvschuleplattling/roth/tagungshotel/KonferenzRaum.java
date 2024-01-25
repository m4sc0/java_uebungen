package de.edvschuleplattling.roth.tagungshotel;

public class KonferenzRaum extends Raum implements Vermietbar {
	private int sitzplaetze;

	public KonferenzRaum(String nr, double flaeche, int sitzplaetze) {
		super(nr, flaeche);
		this.sitzplaetze = sitzplaetze;
	}

	public int getSitzplaetze() {
		return sitzplaetze;
	}
	
	public double mietKostenProTag(){
		return(getFlaeche()*1.40+getSitzplaetze()*20.0);
	}

    @Override
    public String toString() {
        return "KonferenzRaum{" + getNr() + ", " + sitzplaetze + '}';
    }
        
        
        
}
