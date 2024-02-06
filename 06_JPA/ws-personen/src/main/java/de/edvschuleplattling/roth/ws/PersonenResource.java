package de.edvschuleplattling.roth.ws;

import de.edvschuleplattling.roth.daten.Person;
import de.edvschuleplattling.roth.daten.PersonData;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/person")
public class PersonenResource {

    @GET
    @Path("/alle")
    @Produces(MediaType.APPLICATION_JSON)
    public java.util.List<Person> alle() {
        TypedQuery<Person> q = em.createQuery("select p from Person p", Person.class);
        return q.getResultList();
    }

    @GET
    @Path("/nachNr")
    @Produces(MediaType.APPLICATION_JSON)
    public Person nachNr(@QueryParam("nr") @DefaultValue("11") int nr) {
        Person person = PersonData.personNachNr(nr);
        return person;
    }

    @GET
    @Path("/nachInhalt")
    @Produces(MediaType.APPLICATION_JSON)
    public Person nachNr(@QueryParam("inhalt") @DefaultValue("Deckarm") String inhalt) {
        Person person = PersonData.personNachInhalt(inhalt);
        if(person == null){
            return new Person();
        }
        return person;
    }

    @Inject
    EntityManager em;

    @POST
    @Path("/anlegen")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    public String anlegen(Person p) {
//        PersonData.anlegen(p);
        em.persist(p);
        return "ok";
    }


}