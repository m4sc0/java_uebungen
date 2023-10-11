package com.masco;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static String path = "./files/";
    public static FileWriter fw;
    public static void main(String[] args) {
        Testing();
    }

    public static void Testing() {
        LKW lkw = new LKW("DEG-V 477", 1450);

//      BE adding
        BE be1 = new BE(generateBarCode(10), 500, 101);
        BE be2 = new BE(generateBarCode(10), 500, 102);
        BE be3 = new BE(generateBarCode(10), 300, 103);
        BE be4 = new BE(generateBarCode(10), 300, 104);
        BE be5 = new BE(generateBarCode(10), 300, 105);

        ArrayList<BE> bes = new ArrayList<BE>();
        bes.add(be1);
        bes.add(be2);
        bes.add(be3);
        bes.add(be4);
        bes.add(be5);

        ArrayList<BE> rest = lkw.belade(bes);

        for (BE be : rest) {
            System.out.println(be);
        }

//      Tour anlegen
        Fahrer fahrer = new Fahrer(1, "Tom");

        LocalDateTime dateTime = LocalDateTime.of(2007, Month.JULY, 1, 8, 0);
        Tour tour = new Tour(dateTime, lkw, fahrer);

        createFile(tour);
    }

    public static void createFile(Tour tour) {
        if (!Files.exists(Paths.get(path))) {
            try {
                Files.createDirectories(Paths.get(path));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        String kennzeichen = tour.getLkw().getKennzeichen();
        kennzeichen = kennzeichen.replace(" ", "");

        LocalDateTime startZeit = tour.getStartZeit();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH-mm");
        String datum = startZeit.format(formatter);

        String fileName = kennzeichen + "." + datum + ".tour";
        try {
            fw = new FileWriter(path + fileName);

            fw.append("#" + tour.toString());
            for (int cur : tour.holeEmpfaenger()) {
                fw.append("\n").append(String.valueOf(cur));
                System.out.println(String.valueOf(cur));
            }
            fw.flush();
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String generateBarCode(int digits) {
        String res = "";
        for (int i = 0; i < digits; i++) {
            res += (int)(Math.random() * 10);
        }
        return res;
    }
}