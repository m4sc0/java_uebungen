package de.edvschuleplattling.roth;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/fahrzeug")
public class FahrzeugeResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/wurzel")
    public double wurzel(@QueryParam("wert") @DefaultValue("42") double w) {
        return Math.sqrt(w);
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/wurzelp/{wert}")
    public double wurzelp(@PathParam("wert") double w) {
        return Math.sqrt(w);
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/macheName")
    public String macheName(@QueryParam("vorname") String vorname, @QueryParam("nachname") String nachname) {
        return vorname + " " + nachname;
    }


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/einFahrzeug")
    public Fahrzeug einFahrzeug(@QueryParam("index") @DefaultValue("0") int index) {
        return FahrzeugDaten.alleFahrzeuge().get(index);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/alleFahrzeuge")
    public List<Fahrzeug> alleFahrzeuge() {
        return FahrzeugDaten.alleFahrzeuge();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/anlegenFahrzeug")
    public String anlegenFahrzeug(Fahrzeug f) {
        System.out.println(f);
        FahrzeugDaten.alleFahrzeuge().add(f);
        return "ok";
    }

}