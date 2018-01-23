package fr.unice.miage.m1.alichamlausam;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/personnel") //path de la classe
public class PersonnelService {

    @Path("/details")//path de methode
    @GET
    @Produces({MediaType.TEXT_PLAIN})
    public String getDetailsPersonnel(){
        return XQueryUtil.execXQuery("mi:recupererDetailsPersonnel()");
    }

    @Path("/rapports")//path de methode
    @GET
    @Produces({MediaType.TEXT_PLAIN})
    public String getDetailsRapportsPersonnel(){
        return XQueryUtil.execXQuery("mi:recupererDetailsRapportsPersonnel()");
    }

    @Path("/nb-rapports")//path de methode
    @GET
    @Produces({MediaType.TEXT_PLAIN})
    public String getNbRapportsPersonnel(){
        return XQueryUtil.execXQuery("mi:recupererNbRapportsPersonnel()");
    }
}
