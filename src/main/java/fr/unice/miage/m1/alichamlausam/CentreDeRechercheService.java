package fr.unice.miage.m1.alichamlausam;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

/**
* @author Chamir
*/
@Path("/centrederecherche") //path de la classe 
public class CentreDeRechercheService {

	@Path("/id") //path de methode
	@GET
	@Produces({MediaType.TEXT_PLAIN})
	public String getIdCentreDeRecherche(){
		return XQueryUtil.execXQuery("mi:recuppererIDDeCentreDeRecherche()");
	}


	@Path("/details")//path de methode
	@GET
	@Produces({MediaType.TEXT_PLAIN})
	public String getDetailsCentreDeRecherche(){
		return XQueryUtil.execXQuery("mi:recuppererDetailsCentreDeRecherche()");
	}

}