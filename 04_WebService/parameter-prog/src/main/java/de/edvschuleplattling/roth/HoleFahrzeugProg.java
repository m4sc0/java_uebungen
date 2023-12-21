package de.edvschuleplattling.roth;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.hc.client5.http.fluent.Request;
import org.apache.hc.client5.http.fluent.Response;

import java.io.IOException;

public class HoleFahrzeugProg {
    public static void main(String[] args) {
        try {
//            Request request = Request.get("http://10.0.207.54/sensor/temperatur");
            Request request = Request.get("http://localhost:8080/fahrzeug/einFahrzeug");
            Response antwort = request.execute();
            String inhalt = antwort.returnContent().toString();
            System.out.println("Das Fahrzeug ist: " + inhalt);

            ObjectMapper mapper = new ObjectMapper();
            Fahrzeug fz = mapper.readValue(inhalt, Fahrzeug.class);

            System.out.println("Das Fahrzeug ist: " + fz.kz);








        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
