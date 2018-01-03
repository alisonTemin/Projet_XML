//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2018.01.03 � 12:34:40 PM CET 
//


package org.inria.fr.ns.sr;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour researchStructureCategory.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="researchStructureCategory"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EP"/&gt;
 *     &lt;enumeration value="Equipe"/&gt;
 *     &lt;enumeration value="Action exploratoire"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "researchStructureCategory")
@XmlEnum
public enum ResearchStructureCategory {

    EP("EP"),
    @XmlEnumValue("Equipe")
    EQUIPE("Equipe"),
    @XmlEnumValue("Action exploratoire")
    ACTION_EXPLORATOIRE("Action exploratoire");
    private final String value;

    ResearchStructureCategory(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResearchStructureCategory fromValue(String v) {
        for (ResearchStructureCategory c: ResearchStructureCategory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
