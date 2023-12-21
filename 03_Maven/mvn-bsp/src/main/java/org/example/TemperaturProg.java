package org.example;

import org.apache.hc.client5.http.fluent.Request;
import org.apache.hc.client5.http.fluent.Response;

import java.io.IOException;

public class TemperaturProg {
    public static void main(String[] args) {

        try {
         //   System.out.println(Request.get("http://10.0.207.54/sensor/temperatur").execute().returnContent().asString());
         //   System.out.println(Request.get("https://raw.githubusercontent.com/umpirsky/country-list/master/data/de_DE/country.csv").viaProxy("10.0.104.90:3128").execute().returnContent().asString());
            System.out.println(Request.get("https://www.bmw.de").viaProxy("10.0.104.90:3128").execute().returnContent().asString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
