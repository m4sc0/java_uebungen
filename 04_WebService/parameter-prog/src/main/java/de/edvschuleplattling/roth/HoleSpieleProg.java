package de.edvschuleplattling.roth;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.hc.client5.http.fluent.Request;
import org.apache.hc.client5.http.fluent.Response;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class HoleSpieleProg {
    public static void main(String[] args) {
        try {
//            Request request = Request.get("http://10.0.207.54/sensor/temperatur");
            Request request = Request.get("http://localhost:8080/spiel/alleSpiele");
            Response antwort = request.execute();
            String inhalt = antwort.returnContent().toString();
            System.out.println("Die Spiele sind: " + inhalt);

            ObjectMapper mapper = new ObjectMapper();
            Spiel[] spiele = mapper.readValue(inhalt, Spiel[].class);
            List<Spiel> list = Arrays.asList(spiele);

            for (Spiel spiel : list) {
                System.out.println("Das Fahrzeug ist: " + spiel.titel);
            }








        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
