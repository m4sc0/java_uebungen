package de.edvschuleplattling.roth.tagungshotel;

public abstract class Raum {
	private String nr;
	private double flaeche;

	public Raum(String pNr, double pFlaeche) {
		nr = pNr;
		flaeche = pFlaeche;
	}

	public String getNr() {
		return nr;
	}

	public double getFlaeche() {
		return flaeche;
	}
}
