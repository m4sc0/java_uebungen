package de.edvschuleplattling.roth;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.hc.client5.http.fluent.Request;
import org.apache.hc.client5.http.fluent.Response;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class HoleFahrzeugeProg {
    public static void main(String[] args) {
        try {
//            Request request = Request.get("http://10.0.207.54/sensor/temperatur");
            Request request = Request.get("http://localhost:8080/fahrzeug/alleFahrzeuge");
            Response antwort = request.execute();
            String inhalt = antwort.returnContent().toString();
            System.out.println("Das Fahrzeug sind: " + inhalt);

            ObjectMapper mapper = new ObjectMapper();
            Fahrzeug[] fahrzeuge = mapper.readValue(inhalt, Fahrzeug[].class);
            List<Fahrzeug> list = Arrays.asList(fahrzeuge);

            for (Fahrzeug fz : list) {
                System.out.println("Das Fahrzeug ist: " + fz.kz);
            }








        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
