package de.edvschuleplattling.roth;

import org.apache.hc.client5.http.fluent.Request;
import org.apache.hc.client5.http.fluent.Response;

import java.io.IOException;

public class HoleWurzelProg {
    public static void main(String[] args) {
        try {
            //Request request = Request.get("http://10.0.207.54/sensor/temperatur");
            double zahl=13;
            Request request = Request.get("http://localhost:8080/fahrzeug/wurzel?wert="+zahl);
            Response antwort = request.execute();
            String inhalt = antwort.returnContent().toString();
            System.out.println("Die Wurzel ist: "+ inhalt);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
