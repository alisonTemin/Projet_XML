package fr.unice.miage.m1.alichamlausam;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/statistiques") //path de la classe
public class StatistiquesService {

    @Path("/repartition-themes")//path de methode
    @GET
    @Produces({MediaType.TEXT_PLAIN})
    public String getRepartitionThemesParCentre(){
        return XQueryUtil.execXQuery("mi:recupererRepartitionThemesParCentre()");
    }

    @Path("/repartition-categories")//path de methode
    @GET
    @Produces({MediaType.TEXT_PLAIN})
    public String getRepartitionCategoriesParCentre(){
        return XQueryUtil.execXQuery("mi:recupererRepartitionCategoriesParCentre()");
    }

    @Path("/repartition-projets")//path de methode
    @GET
    @Produces({MediaType.TEXT_PLAIN})
    public String getRepartitionProjetsParCentre(){
        return XQueryUtil.execXQuery("mi:recupererRepartitionProjetsParTheme()");
    }
}
