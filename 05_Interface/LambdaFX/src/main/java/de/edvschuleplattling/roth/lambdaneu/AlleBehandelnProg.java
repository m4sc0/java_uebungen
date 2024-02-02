package de.edvschuleplattling.roth.lambdaneu;

import java.util.ArrayList;

public class AlleBehandelnProg {
    public static void main(String[] args) {
        MyStringArrayList namen = new MyStringArrayList();
        namen.add("Huber");
        namen.add("Maier");
        namen.add("Und I");

        namen.wandleUm(s -> s.toUpperCase());
//        namen.wandleUm(s -> {
//            if (s.length() < 20) {
//                for (int i = 0; i < 20 - s.length(); i++) {
//                    s = s + " ";
//                }
//            } else if (s.length > 20) {
//                s = s.substring(0, 20);
//            }
//            return s;
//        });

        for (String name : namen) {
            System.out.println(name);
        }
    }
}

interface Uni{
    String uni(String s);
}

class MyStringArrayList extends ArrayList<String>{
    public void wandleUm(Uni u){
        for (int i = 0; i < size(); i++) {
          set(i,u.uni(get(i)));
        }
    }
}
