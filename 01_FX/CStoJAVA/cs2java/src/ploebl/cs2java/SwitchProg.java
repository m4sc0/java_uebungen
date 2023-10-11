package ploebl.cs2java;

import java.util.Scanner;

public class SwitchProg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        switch (i) {
            case 0:
                System.out.println("Test if i == 0");
                break;
            case 1:
                System.out.println("Test if i == 1");
                break;
            case 2:
                System.out.println("Test if i == 2");
                break;
            default:
                System.out.println("Result not found!");
                break;
        }
    }
}
