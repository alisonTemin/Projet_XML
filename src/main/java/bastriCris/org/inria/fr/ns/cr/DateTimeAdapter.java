package org.inria.fr.ns.cr;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.GregorianCalendar;

public class DateTimeAdapter extends XmlAdapter<XMLGregorianCalendar, LocalDateTime> {

    @Override
    public LocalDateTime unmarshal(XMLGregorianCalendar v) throws Exception {
        return v.toGregorianCalendar().toZonedDateTime().toLocalDateTime();
    }

    @Override
    public XMLGregorianCalendar marshal(LocalDateTime v) throws Exception {
        GregorianCalendar calendar = GregorianCalendar.from(v.atZone(ZoneId.systemDefault()));
        XMLGregorianCalendar xmlCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar);
        return xmlCalendar;
    }
}
