package de.edvschuleplattling.roth.tagungshotel;
public class BeispielProg {
	public static void main(String[] args) {
		Besenkammer b = new Besenkammer("besenkammer",2.0,5);
		KonferenzRaum k1 = new KonferenzRaum("K-012",80,15);
		KonferenzRaum k2 = new KonferenzRaum("k-222",120,20);
		Convenient c1 = new Convenient("m7","Ken",2);
		Convenient c2 = new Convenient("m6","Barbie",1);
		Hausmeister h1 = new Hausmeister("ham1", "Nullinger", "Reinigung");
        Hausmeister h2 = new Hausmeister("ham2", "Eberle", "Elektro");
        Laptop l1 = new Laptop("sn-813978", "ZX81");
		Object objekte[] = { b, k1, k2, c1, c2, h1, h2, l1 };
//		Vermietbar objekte[] = { k1, k2, c1, c2, l1 };
		for (int i = 0; i < objekte.length; i++) {
			if (objekte[i] instanceof Vermietbar v)
			System.out.println(objekte[i] + ": " + v.mietKostenProTag());
		}
	}
}
