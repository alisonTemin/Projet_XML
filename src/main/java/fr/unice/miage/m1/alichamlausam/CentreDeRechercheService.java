package fr.unice.miage.m1.alichamlausam;

import javax.xml.transform.dom.*;
import org.w3c.dom.*;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import java.util.List;
import javax.xml.bind.*;
import org.inria.fr.ns.cr.*;

@Path("/centrederecherche") //path de la classe
public class CentreDeRechercheService {

	@Path("/details")//path de methode
	@GET
	@Produces({"application/xml"})
	public Object getDetailsCentreDeRecherche(){
		//return XQueryUtil.execXQuery("mi:recupererDetailsCentreDeRecherche()");
		Crs listCentres = ConversionBastriCris.getCentresRecherche();
		// List<Crs.Cr> listCentres = ConversionBastriCris.getCentresRecherche();
		if(listCentres == null) return "null";
		// ObjectFactory of = new ObjectFactory();
		return listCentres;

	}


	@Path("/personnes")//path de methode
	@GET
	@Produces({MediaType.TEXT_PLAIN})
	public String getNbPersonnesCentreDeRecherche(){
		return XQueryUtil.execXQuery("mi:recupererNbPersonnesCentreDeRecherche()");
	}


	@GET
	@Produces({MediaType.TEXT_PLAIN})
	public void getStructureInria(){
		JaxbOnBastri jaxb = new JaxbOnBastri();
		jaxb.JaxBOnBastriFile();
	}

}