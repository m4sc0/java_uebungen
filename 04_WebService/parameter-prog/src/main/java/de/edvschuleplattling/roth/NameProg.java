package de.edvschuleplattling.roth;

import org.apache.hc.client5.http.fluent.Request;
import org.apache.hc.client5.http.fluent.Response;

import java.io.IOException;
import java.net.URLEncoder;

public class NameProg {
    public static void main(String[] args) {
        try {
            //Request request = Request.get("http://10.0.207.54/sensor/temperatur");
            String vorname = "Hans Peter";
            vorname = URLEncoder.encode(vorname);
            String nachname = "Meier&Söhne";
            nachname = URLEncoder.encode(nachname);
            String url = "http://localhost:8080/fahrzeug/macheName?vorname="+vorname+"&nachname="+nachname;
            System.out.println(url);
            Request request = Request.get(url);
            Response antwort = request.execute();
            String inhalt = antwort.returnContent().toString();
            System.out.println("Der Name ist: "+ inhalt);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
