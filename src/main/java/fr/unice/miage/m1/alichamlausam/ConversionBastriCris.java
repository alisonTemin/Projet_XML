package fr.unice.miage.m1.alichamlausam;

import bastri.org.inria.fr.ns.sr.ObjectFactory;
import bastriCris.org.inria.fr.ns.cr.*;
import java.net.URL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class ConversionBastriCris {

    public static Crs getCentresRecherche() {

        try {
            ObjectFactory objectFactory = new ObjectFactory();
            JAXBContext jc = JAXBContext.newInstance("org.inria.fr.ns.cr");

            Unmarshaller unmarshaller = jc.createUnmarshaller();

            Crs centres = (Crs) unmarshaller.unmarshal(new URL("http://localhost:2222/bastriCris.xml"));

            /*List<Crs.Cr> centreList = centres.getCr();
            System.out.println(centreList);
            System.out.println();
            return centreList;*/
            return centres;

        } catch (Exception e) {

            e.printStackTrace();

        }
        return null;

    }

    public static void main(String[] args) {
        getCentresRecherche();
    }
}
