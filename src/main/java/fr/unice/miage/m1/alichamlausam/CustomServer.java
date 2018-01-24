package fr.unice.miage.m1.alichamlausam;


import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletContainer;

import javax.servlet.ServletContext;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CustomServer {

    private static ServletContextHandler context;

    public static void main(String[] args) throws ParseException {

        ResourceConfig config = new ResourceConfig();
        config.packages("fr.unice.miage.m1.alichamlausam");
        ServletHolder servlet = new ServletHolder(new ServletContainer(config));

        Server server = new Server(2222);
        ServletContextHandler context = new ServletContextHandler(server, "/*");
        context.addServlet(servlet, "/*");


        try {
            server.start();
            server.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //server.destroy();
        }

        Download down = new Download();

        String linkBastri = new String("http://www-sop.inria.fr/members/Philippe.Poulard/projet/2017/bastri.xml");

        down.getFile(linkBastri);



        File fileBastri = new File("bastri.xml");
        Long lastModifiedBastri = fileBastri.lastModified();
        Date dateBastri = new Date(lastModifiedBastri);
        System.out.println("File bastri.xml download on : " + dateBastri);

        String linkBastriCris = new String("http://www-sop.inria.fr/members/Philippe.Poulard/projet/2017/bastriCris.xml");
        down.getFile(linkBastriCris);

        File fileBastriCris = new File("bastri.xml");
        Long lastModifiedBastriCris = fileBastriCris.lastModified();
        Date dateBastriCris = new Date(lastModifiedBastriCris);
        System.out.println("File bastriCris.xml download on : " + dateBastriCris);

        SimpleDateFormat dateFormatter = new SimpleDateFormat("dd-MM-yyyy");
        Date todayDate = dateFormatter.parse(dateFormatter.format(new Date()));

        if(dateBastri.compareTo(todayDate) == -1){
            down.getFile(linkBastri);
            System.out.println("File bastri.xml new download on : " + dateBastri);
            down.getFile(linkBastriCris);
            System.out.println("File bastriCris.xml new download on : " + dateBastriCris);
        }

    }


}
