package fr.unice.miage.m1.alichamlausam;

import com.oracle.xmlns.internal.webservices.jaxws_databinding.ObjectFactory;

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

            org.inria.fr.ns.sr.StructureInrias structureInrias = (org.inria.fr.ns.sr.StructureInrias) unmarshaller.unmarshal(new File("bastri.xml"));



            List<?> details = structureInrias.getStructureinria();




                System.out.println("Structure Inria :  ");

                System.out.println("Détails   : " +  details);


                System.out.println();



        } catch (Exception e) {

            e.printStackTrace();

        }

    }
}
