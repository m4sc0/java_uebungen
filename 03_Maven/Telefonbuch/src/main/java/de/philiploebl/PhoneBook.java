package de.philiploebl;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

/**
 * Telefonbuch-Klasse
 */
public class PhoneBook {

    private final Map<String, Integer> name2Number;
    private final Map<Integer, String> number2Name;
    private int entries;

    public PhoneBook() {
        name2Number = new HashMap<>();
        number2Name = new HashMap<>();
        entries = 0;
    }

    public void addEntry(String name, int number) {
        name2Number.put(name, number);
        number2Name.put(number, name);
        entries++;
    }

    public int lookupNumber(String name) {
        Integer number = name2Number.get(name);
        if (number != null) {
            return number;
        } else {
            throw new NoSuchElementException(name + "");
        }
    }


    public String lookupName(int number) {
        return number2Name.get(number);
    }

    public void removeEntryByName(String name) {
        int number = lookupNumber(name);
        name2Number.remove(name);
        number2Name.remove(number);
        entries--;
    }

    public void removeEntryByNumber(int number) {
        String name = lookupName(number);
        number2Name.remove(number);
        name2Number.remove(name);
        entries--;
    }

    public int size() {
        return entries;
    }

    public void clear() {
        number2Name.clear();
        name2Number.clear();
        entries = 0;
    }

}
