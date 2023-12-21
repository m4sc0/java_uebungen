package org.example;

import org.apache.hc.client5.http.fluent.Request;

import java.io.IOException;
import java.time.LocalDateTime;

public class ZeitClientProg {
    public static void main(String[] args) {

        try {
            String inhalt = Request.get("http://10.0.208.1:8080/hello").execute().returnContent().asString();
            LocalDateTime zp = LocalDateTime.parse(inhalt);
            System.out.println(zp);
            System.out.println(zp.getDayOfWeek());
            System.out.println(inhalt);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
