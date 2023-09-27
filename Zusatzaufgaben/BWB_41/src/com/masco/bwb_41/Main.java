package com.masco.bwb_41;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static ArrayList<String> words = new ArrayList<>();

    public static String path = "./list/words.txt";

    public static void main(String[] args) throws FileNotFoundException {
        FileReader fr = new FileReader(path);
    }
}