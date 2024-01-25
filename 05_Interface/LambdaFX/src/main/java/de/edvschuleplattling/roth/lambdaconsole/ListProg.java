package de.edvschuleplattling.roth.lambdaconsole;

import java.io.File;
import java.io.FilenameFilter;

public class ListProg {
    public static void main(String[] args) {
        File dir = new File(".");
        String[] files = dir.list(new HiddenFilter());
        System.out.println("----");
        for (String file : files) {
            System.out.println(file);
        }
    }
}

class HiddenFilter implements FilenameFilter {

    @Override
    public boolean accept(File dir, String name) {
        return(name.startsWith("."));
    }
}

