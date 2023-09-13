package ploebl.zug;

import java.time.LocalDateTime;

public class ZugTestProg {
    public static void main(String[] args) {
        Lokomotive l1 = new Lokomotive(101, 4800, 65.5);

        Waggon w1 = new Waggon(101, 20, 40);
        Waggon w2 = new Waggon(102, 40, 80);

        Zug z1 = new Zug(1, LocalDateTime.now(), l1);

        z1.anhaengen(w1);
        z1.anhaengen(w2);

        System.out.println(w1.toString());
        System.out.println(w2.toString());
    }
}
