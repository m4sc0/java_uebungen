package de.philiploebl;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import java.util.Random;

@Path("/ws")
public class ExampleResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/motto")
    public String motto() {
        return "Die Definition von Wahnsinn ist immer wieder das Gleiche zu tun und andere Ergebnisse zu erwarten.\nRayen be like...";
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/motd")
    public String motd() {
        String[] sprueche = {
            "Das Leben ist wie ein Fahrrad. Man muss sich vorwärts bewegen, um das Gleichgewicht nicht zu verlieren.",
            "Es ist nicht genug zu wissen, man muss auch anwenden.",
            "Die beste Zeit einen Baum zu pflanzen war vor 20 Jahren. Die zweitbeste Zeit ist jetzt.",
            "Der einzige Weg, großartige Arbeit zu leisten, ist zu lieben, was man tut.",
            "Es ist nie zu spät, das zu werden, was man hätte sein können.",
            "Die Zukunft gehört denen, die an die Schönheit ihrer Träume glauben.",
            "Der Unterschied zwischen dem, was wir tun und dem, was wir in der Lage wären zu tun, würde genügen, um das größte Problem der Welt zu lösen.",
            "Es ist nicht das, was du bist, was dich hält. Es ist das, was du denkst, nicht zu sein.",
            "Erfolg ist nicht der Schlüssel zum Glück. Glück ist der Schlüssel zum Erfolg.",
            "Die einzige Grenze für unsere Verwirklichung von morgen sind unsere Zweifel von heute."
        };
        Random rand = new Random();
        return sprueche[rand.nextInt(sprueche.length)];
    }
}