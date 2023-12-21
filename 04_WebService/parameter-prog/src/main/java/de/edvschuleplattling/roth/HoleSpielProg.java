package de.edvschuleplattling.roth;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.hc.client5.http.fluent.Request;
import org.apache.hc.client5.http.fluent.Response;

import java.io.IOException;

public class HoleSpielProg {
    public static void main(String[] args) {
        try {
//            Request request = Request.get("http://10.0.207.54/sensor/temperatur");
            Request request = Request.get("http://localhost:8080/spiel/einSpiel");
            Response antwort = request.execute();
            String inhalt = antwort.returnContent().toString();
            System.out.println("Das Spiel ist: " + inhalt);

            ObjectMapper mapper = new ObjectMapper();
            Spiel fz = mapper.readValue(inhalt, Spiel.class);

            System.out.println("Das Spiel ist: " + fz.titel);








        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
