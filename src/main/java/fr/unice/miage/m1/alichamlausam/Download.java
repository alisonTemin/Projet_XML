package fr.unice.miage.m1.alichamlausam;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Download
{
    public static void getFile(String host)
    {
        InputStream input = null;
        FileOutputStream writeFile = null;

        try
        {
            URL url = new URL(host);
            URLConnection connection = url.openConnection();
            int fileLength = connection.getContentLength();

            if (fileLength == -1)
            {
                System.out.println("Invalide URL or file.");

            }

            input = connection.getInputStream();
            String fileName = url.getFile().substring(url.getFile().lastIndexOf('/') + 1);
            writeFile = new FileOutputStream(fileName);
            byte[] buffer = new byte[1024];
            int read;

            while ((read = input.read(buffer)) > 0)
                writeFile.write(buffer, 0, read);
            writeFile.flush();
        }
        catch (IOException e)
        {
            System.out.println("Error while trying to download the file.");
            e.printStackTrace();
        }
        finally
        {
            try
            {
                writeFile.close();
                input.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }

    }

  
    public static void main(String[] args) throws ParseException {

        String linkBastri = new String("http://www-sop.inria.fr/members/Philippe.Poulard/projet/2017/bastri.xml");

        getFile(linkBastri);

        File fileBastri = new File("bastri.xml");
        Long lastModifiedBastri = fileBastri.lastModified();
        Date dateBastri = new Date(lastModifiedBastri);
        System.out.println("File bastri.xml download on : " + dateBastri);

        String linkBastriCris = new String("http://www-sop.inria.fr/members/Philippe.Poulard/projet/2017/bastriCris.xml");
        getFile(linkBastriCris);

        File fileBastriCris = new File("bastri.xml");
        Long lastModifiedBastriCris = fileBastriCris.lastModified();
        Date dateBastriCris = new Date(lastModifiedBastriCris);
        System.out.println("File bastriCris.xml download on : " + dateBastriCris);

        SimpleDateFormat dateFormatter = new SimpleDateFormat("dd-MM-yyyy");
        Date todayDate = dateFormatter.parse(dateFormatter.format(new Date()));

        if(dateBastri.compareTo(todayDate) == -1){
            getFile(linkBastri);
            System.out.println("File bastri.xml new download on : " + dateBastri);
            getFile(linkBastriCris);
            System.out.println("File bastriCris.xml new download on : " + dateBastriCris);
        }


    }

    }

  
