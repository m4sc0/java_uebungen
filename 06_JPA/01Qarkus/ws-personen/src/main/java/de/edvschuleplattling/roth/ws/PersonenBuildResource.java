package de.edvschuleplattling.roth.ws;

import de.edvschuleplattling.roth.daten.Person;
import de.edvschuleplattling.roth.daten.PersonData;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/personbuild")
public class PersonenBuildResource {

    @GET
    @Path("/alle")
    @Produces(MediaType.APPLICATION_JSON)
    public Response alle() {
        return Response.ok(PersonData.allePersonen()).build();
    }

    @GET
    @Path("/nachNr")
    @Produces(MediaType.APPLICATION_JSON)
    public Response nachNr(@QueryParam("nr") @DefaultValue("11") int nr) {
        Person person = PersonData.personNachNr(nr);
        if (person == null) {
            return Response.serverError().build();
        }
        return Response.ok(person).build();
    }

    @GET
    @Path("/nachInhalt")
    @Produces(MediaType.APPLICATION_JSON)
    public Response nachNr(@QueryParam("inhalt") @DefaultValue("Deckarm") String inhalt) {
        Person person = PersonData.personNachInhalt(inhalt);
        if (person == null) {
            return Response.serverError().build();
        }
        return Response.ok(person).build();
    }



    @POST
    @Path("/anlegen")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response anlegen(Person p) {
        PersonData.anlegen(p);
        return Response.ok("OK").build();
    }


}