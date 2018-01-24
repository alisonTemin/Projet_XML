package fr.unice.miage.m1.alichamlausam;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class DateAdapter extends XmlAdapter<XMLGregorianCalendar, LocalDate>{

    @Override
    public LocalDate unmarshal(XMLGregorianCalendar xmlDate) throws Exception {
        Date utilDate = xmlDate.toGregorianCalendar().getTime();
        return LocalDateTime.ofInstant( utilDate.toInstant(), ZoneId.systemDefault() ).toLocalDate();
    }

    @Override
    public XMLGregorianCalendar marshal(LocalDate date) throws Exception {
        Date utilDate = Date.from( date.atStartOfDay( ZoneId.systemDefault() ).toInstant() );
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(utilDate);
        return DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
    }

}
