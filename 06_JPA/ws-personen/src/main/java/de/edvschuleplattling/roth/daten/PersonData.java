package de.edvschuleplattling.roth.daten;

import java.util.ArrayList;

public class PersonData {
    private static ArrayList<Person> personen = new ArrayList<>();

    static {
        personen.add(new Person(14,"Brand"));
        personen.add(new Person(9,"Wunderlich"));
        personen.add(new Person(1,"Hoffmann"));
        personen.add(new Person(11,"Deckarm"));
        personen.add(new Person(7,"Rosendahl"));
        personen.add(new Person(16,"Niemayer"));
    }

    public static ArrayList<Person> allePersonen(){
        return personen;
    }

    public static Person personNachNr(int nr){
        for (Person person : personen) {
            if(person.getNr() == nr){
                return person;
            }
        }
        return null;
    }
    public static void anlegen(Person p){
        personen.add(p);
    }


    public static Person personNachInhalt(String inhalt) {
        for (Person person : personen) {
            if(String.valueOf(person.getNr()).equals(inhalt) || person.getName().indexOf(inhalt)>=0){
                return person;
            }
        }
        return null;
    }
}
