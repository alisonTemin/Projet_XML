package fr.unice.miage.m1.alichamlausam;

import com.oracle.xmlns.internal.webservices.jaxws_databinding.ObjectFactory;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.List;

public class Jaxb {
    public static void main(String[] args) {


        try {
            ObjectFactory objectFactory = new ObjectFactory();
            JAXBContext jc = JAXBContext.newInstance("fr.unice.miage.m1.alichamlausam");

            Unmarshaller unmarshaller = jc.createUnmarshaller();

            CentreDeRechercheService centreRecherche = (CentreDeRechercheService) unmarshaller.unmarshal(new File("jaxb.xml"));



            String details = centreRecherche.getDetailsCentreDeRecherche();
            String id = centreRecherche.getIdCentreDeRecherche();



                System.out.println("Centres de recherches ");

                System.out.println("Détails   : " +  details);

                System.out.println("ID  : " + id);

                System.out.println();



        } catch (Exception e) {

            e.printStackTrace();

        }

    }
}
