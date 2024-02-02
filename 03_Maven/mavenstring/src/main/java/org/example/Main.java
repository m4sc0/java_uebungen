package org.example;

public class Main {
    public static void main(String[] args) {
        String text = "Willkommen in Plattling";
        System.out.println(text);
        text = StringUtil.reverse(text);
        System.out.println(text);
    }
}
