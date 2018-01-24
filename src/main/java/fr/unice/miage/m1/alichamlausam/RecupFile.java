package fr.unice.miage.m1.alichamlausam;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


@Path("/file")
public class RecupFile {

    @GET
    @Path("/bastri")
    @Produces({MediaType.TEXT_PLAIN})
    public String getBastri() throws IOException {
        File f = new File(System.getProperty("user.dir") + File.separatorChar + "bastri.xml");
        byte[] tab = Files.readAllBytes(Paths.get(f.toURI()));
        String file = new String(tab);
        return file;
    }

    @GET
    @Path("/bastriCris")
    @Produces({MediaType.TEXT_PLAIN})
    public String getBastriCris() throws IOException {
        File f = new File(System.getProperty("user.dir") + File.separatorChar + "bastriCris.xml");
        byte[] tab = Files.readAllBytes(Paths.get(f.toURI()));
        String file = new String(tab);
        return file;
    }
}
