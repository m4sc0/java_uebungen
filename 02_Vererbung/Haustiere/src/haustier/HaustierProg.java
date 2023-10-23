package haustier;

import java.time.LocalDate;

/**
 * @author Dieter Roth Haustiere (Katze, Kuh, ...) auf einem Bauernhof
 */
public class HaustierProg {

    public static void main(String[] args) {

        Katze garfield = new Katze("Garfield", LocalDate.of(1978, 6, 19));
        System.out.println(garfield);
        // Mimi gibt durchschnittlich 25,2 Liter Milch am Tag
        Kuh mimi = new Kuh("Mimi", LocalDate.of(1998, 3, 15), 25.2);
        Henne henriette = new Henne("Henriette", LocalDate.now(), 'A');

        String nameG = garfield.getName();
        String nameM = mimi.getName();

        double milchM = mimi.getMilchmenge();
//        double milchG = garfield.getMilchmenge(); Macht keinen Sinn!

        System.out.println(mimi.getGeburtstag());
        System.out.println(garfield.getGeburtstag());
        System.out.println(henriette.getName()+": "+henriette.getGueteKlasse());


        int alterG = garfield.getAlter();
        int alterM = mimi.getAlter();

//        Katze test = new Katze("Test", LocalDate.of(2005, 11, 23));
//        System.out.println(test.getAlterInTagen());

        Katze sam = new Katze("Sam", LocalDate.of(2004, 3, 15));
        Kuh luise = new Kuh("Luise", LocalDate.of(2007, 7, 16), 0.0);
        Kuh kuhClone = new Kuh(luise);
        Katze samClone = new Katze(sam);
        Henne berta = new Henne("Berta", LocalDate.of(2015, 1, 1), 'B');

        System.out.println(garfield + " liebt " + mimi);

        Haustier[] tiere = {garfield, mimi, luise, sam, kuhClone, henriette, berta};
        for (int i = 0; i < tiere.length; i++) {
            String name = tiere[i].getName();
            int alter = tiere[i].getAlter();
            if (tiere[i] instanceof Kuh k) {
                System.out.println(k.getMilchmenge());
            }

            tiere[i].sag();
            System.out.println("-------------------");
        }

        garfield.sag();  garfield.sag("Lasagne"); garfield.sag(0);
        mimi.sag();      mimi.sag("Gras");        mimi.sag(0);
        for (Haustier haustier : tiere) {
            haustier.sag(0);
            haustier.sag();
        }
    }
}
