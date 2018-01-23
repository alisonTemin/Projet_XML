package fr.unice.miage.m1.alichamlausam;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/equipe") //path de la classe
public class EquipeService {

    @Path("/details")//path de methode
    @GET
    @Produces({MediaType.TEXT_PLAIN})
    public String getDetailsEquipe(){
        return XQueryUtil.execXQuery("mi:recupererDetailsEquipe()");
    }

}
