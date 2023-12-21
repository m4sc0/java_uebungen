package org.example;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args)  {

        try(FileReader in = new FileReader("obst.csv");) {
            Iterable<CSVRecord> records = CSVFormat.EXCEL.parse(in);
            for (CSVRecord record : records) {
                String art = record.get(1);
                String preis = record.get(3);
                System.out.println(art+": "+preis);
            }
        } catch (IOException e) {
            System.out.println("Fehler: "+e);
        }
    }
}