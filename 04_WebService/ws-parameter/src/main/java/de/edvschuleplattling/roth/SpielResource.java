package de.edvschuleplattling.roth;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.stream.Collectors;

@Path("/spiel")
public class SpielResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/einSpiel")
    public Spiel einSpiel(@QueryParam("index") @DefaultValue("0") int index) {
        return SpielDaten.alleSpiele().get(index);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/findByEAN")
    public Spiel findByEAN(@QueryParam("ean") @DefaultValue("0") String ean) {
        return SpielDaten.findByEAN(ean);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/alleSpiele")
    public List<Spiel> alleSpiele() {
        return SpielDaten.alleSpiele();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/findContainsTitel")
    public Spiel findContainsTitel(@QueryParam("titel") @DefaultValue("0") String titel) {
        return SpielDaten.findContainsTitel(titel);
    }
}
