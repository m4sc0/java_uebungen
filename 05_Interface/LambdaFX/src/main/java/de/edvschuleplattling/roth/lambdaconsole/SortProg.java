package de.edvschuleplattling.roth.lambdaconsole;

import java.util.Arrays;
import java.util.Comparator;

public class SortProg {

    public static void main(String[] args) {
        String[] namen = {"Meier", "Huber", "UndI"};
        Person[] personen = {new Person(3, "Meier"), new Person(4, "Huber"), new Person(1, "UndI")};
        Arrays.sort(namen);
        Arrays.sort(personen,new NamenComparator());



        for (String name : namen) {
            System.out.println(name);
        }
        System.out.println("--------------");
        for (Person person : personen) {
            System.out.println(person);
        }
    }
}

class Person  {
    private int id;
    private String name;
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() { return id; }
    public String getName() { return name; }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name=" + name + '}';
    }


}

class NamenComparator implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
