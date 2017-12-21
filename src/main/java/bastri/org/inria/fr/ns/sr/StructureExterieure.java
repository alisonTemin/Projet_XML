//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2017.12.22 � 12:48:39 AM CET 
//


package org.inria.fr.ns.sr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour structure_exterieure complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="structure_exterieure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sigle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="libelle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="umr" type="{http://ns.inria.fr/dsi/si/app/bastri}umr" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="refid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "structure_exterieure", propOrder = {
    "sigle",
    "libelle",
    "type",
    "umr"
})
public class StructureExterieure {

    @XmlElement(required = true)
    protected String sigle;
    @XmlElement(required = true)
    protected String libelle;
    @XmlElement(required = true)
    protected String type;
    protected Umr umr;
    @XmlAttribute(name = "refid")
    protected String refid;
    @XmlAttribute(name = "url")
    protected String url;
    @XmlAttribute(name = "version")
    protected String version;

    /**
     * Obtient la valeur de la propri�t� sigle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSigle() {
        return sigle;
    }

    /**
     * D�finit la valeur de la propri�t� sigle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSigle(String value) {
        this.sigle = value;
    }

    /**
     * Obtient la valeur de la propri�t� libelle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibelle() {
        return libelle;
    }

    /**
     * D�finit la valeur de la propri�t� libelle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibelle(String value) {
        this.libelle = value;
    }

    /**
     * Obtient la valeur de la propri�t� type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * D�finit la valeur de la propri�t� type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Obtient la valeur de la propri�t� umr.
     * 
     * @return
     *     possible object is
     *     {@link Umr }
     *     
     */
    public Umr getUmr() {
        return umr;
    }

    /**
     * D�finit la valeur de la propri�t� umr.
     * 
     * @param value
     *     allowed object is
     *     {@link Umr }
     *     
     */
    public void setUmr(Umr value) {
        this.umr = value;
    }

    /**
     * Obtient la valeur de la propri�t� refid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefid() {
        return refid;
    }

    /**
     * D�finit la valeur de la propri�t� refid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefid(String value) {
        this.refid = value;
    }

    /**
     * Obtient la valeur de la propri�t� url.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * D�finit la valeur de la propri�t� url.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Obtient la valeur de la propri�t� version.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * D�finit la valeur de la propri�t� version.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
