package org.example;

public class StringUtil {
    public static String reverse(String s) {
        StringBuilder res = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            res.insert(0, c);
        }
        return res.toString();
    }
}
