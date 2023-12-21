package de.philiploebl;

import java.util.NoSuchElementException;

/**
 * Stapel (Kellerspeicher) zum Verwalten von Strings.
 */
public class Stack {

    private String[] data;
    private int count;

    public Stack(int initialCapacity){
        data = new String[initialCapacity];
        count = 0;
    }

    public Stack(){
        this(20);

    }

    public void push(String s) {
        // full?
        if (count == data.length) {
            // increase capacity
            String[] data2 = new String[data.length + 1];
            System.arraycopy(data, 0, data2, 0, data.length);
            data = data2;
        }
        // insert is save now...
        data[count++] = s;
    }

    public String peek() throws ArrayIndexOutOfBoundsException {
        return data[count-1];
    }

    public String pop()  throws ArrayIndexOutOfBoundsException{
        return data[--count];
    }

    public int size(){
        return count;
    }

}
