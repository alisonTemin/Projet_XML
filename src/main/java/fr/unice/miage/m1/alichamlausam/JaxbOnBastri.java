package fr.unice.miage.m1.alichamlausam;

import bastri.org.inria.fr.ns.sr.ObjectFactory;
import bastri.org.inria.fr.ns.sr.StructuresInria;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.List;

public class JaxbOnBastri {
    public void JaxBOnBastriFile() {

        try {
            ObjectFactory objectFactory = new ObjectFactory();
            JAXBContext jc = JAXBContext.newInstance("org.inria.fr.ns.sr");

            Unmarshaller unmarshaller = jc.createUnmarshaller();

            StructuresInria structuresInria = (StructuresInria) unmarshaller.unmarshal(new File("bastri.xml"));

            List<?> details = structuresInria.getStructureInria();

            System.out.println("Structure Inria :  ");

            System.out.println("Détails   : " + details);


            System.out.println();


        } catch (Exception e) {

            e.printStackTrace();

        }

    }
}
