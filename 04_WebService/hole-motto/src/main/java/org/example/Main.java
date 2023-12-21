package org.example;

import org.apache.hc.client5.http.fluent.Request;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Bitte geben Sie die letzte Zahl Ihrer IP-Adresse ein:");
            String zahl = sc.nextLine();
            String url = "http://10.0.208." + zahl + ":8080/ws/motto";
            System.out.println(Request.get(url).execute().returnContent().asString());
            System.out.println("Message of the day: " + Request.get(url.replace("motto", "motd")).execute().returnContent().asString());
        } catch (IOException e) {
//            throw new RuntimeException(e);
        }
    }
}