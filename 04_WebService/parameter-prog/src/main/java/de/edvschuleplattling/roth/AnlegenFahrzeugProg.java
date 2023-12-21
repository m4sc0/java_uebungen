package de.edvschuleplattling.roth;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.hc.client5.http.fluent.Request;
import org.apache.hc.client5.http.fluent.Response;
import org.apache.hc.core5.http.ContentType;

import java.io.IOException;

public class AnlegenFahrzeugProg {
    public static void main(String[] args) {
        try {
            Fahrzeug f = new Fahrzeug(1234, "DEG-R 6366", false);
            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writeValueAsString(f);
            System.out.println(json);

            Request request = Request.post("http://localhost:8080/fahrzeug/anlegenFahrzeug");
            request = request.bodyString(json, ContentType.APPLICATION_JSON);
            Response antwort = request.execute();
            String inhalt = antwort.returnContent().toString();
            System.out.println("Das Fahrzeug ist: " + inhalt);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
