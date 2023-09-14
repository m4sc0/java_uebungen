package ploebl.zug;

import java.time.LocalDateTime;

public class ZugTestProg {
    public static void main(String[] args) {
//        Lokomotive l1 = new Lokomotive(101, 4800, 65.5);
//
//        Waggon w1 = new Waggon(101, 20, 40);
//        Waggon w2 = new Waggon(102, 40, 80);
//
//        Zug z1 = new Zug(1, LocalDateTime.now().plusHours(2).plusMinutes(35), l1);
//
//        z1.anhaengen(w1);
//        z1.anhaengen(w2);
//
//        System.out.println(z1.getAbfahrt());
//        System.out.println(z1.getStundenBisAbfahrt());
//
//        double gg = z1.getGesamtGewichtWaggons();
//         System.out.println(gg);
//        Test1();
        Test2();
    }

    public static void Test1() {
        Lokomotive l1 = new Lokomotive(101, 4800, 65.5);
        Zug z1 = new Zug(1001, l1, LocalDateTime.of(2022, 7, 3, 18, 14, 44));
        z1.anhaengen(new Waggon(10001, 16.2, 35.2));
        z1.anhaengen(new Waggon(10003, 17.3, 39.3));
        z1.anhaengen(new Waggon(10002, 16.2, 34.1));
        z1.anhaengen(new Waggon(10004, 17.3, 32.9));
        z1.anhaengen(new Waggon(10005, 16.2, 35.0));
        System.out.println(z1);
    }

    public static void Test2() {
        Lokomotive l2 = new Lokomotive(102, 1000, 100);
        Zug z2 = new Zug(1002, l2, LocalDateTime.of(2022, 7, 4, 5, 0, 2));

        boolean check = true;
        for (int i = 0; i < 15; i++) {
            check = true;
            if (!z2.anhaengen(new Waggon(10001 + i, 15, 35))) {
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println("Letzter Waggon angehängt");
        } else {
            System.out.println("Probleme beim Beladen des Zuges: Leistung zu gering!");
        }
    }
}
