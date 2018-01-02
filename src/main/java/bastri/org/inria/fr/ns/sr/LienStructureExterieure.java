//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2018.01.01 � 10:57:05 PM CET 
//


package org.inria.fr.ns.sr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour lien_structure_exterieure complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="lien_structure_exterieure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="date_debut" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="date_fin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="type_lien" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="structure_exterieure" type="{http://ns.inria.fr/dsi/si/app/bastri}structure_exterieure"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lien_structure_exterieure", propOrder = {
    "dateDebut",
    "dateFin",
    "typeLien",
    "structureExterieure"
})
public class LienStructureExterieure {

    @XmlElement(name = "date_debut", required = true)
    protected String dateDebut;
    @XmlElement(name = "date_fin", required = true)
    protected String dateFin;
    @XmlElement(name = "type_lien", required = true)
    protected String typeLien;
    @XmlElement(name = "structure_exterieure", required = true)
    protected StructureExterieure structureExterieure;
    @XmlAttribute(name = "version")
    protected String version;

    /**
     * Obtient la valeur de la propri�t� dateDebut.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateDebut() {
        return dateDebut;
    }

    /**
     * D�finit la valeur de la propri�t� dateDebut.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateDebut(String value) {
        this.dateDebut = value;
    }

    /**
     * Obtient la valeur de la propri�t� dateFin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateFin() {
        return dateFin;
    }

    /**
     * D�finit la valeur de la propri�t� dateFin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateFin(String value) {
        this.dateFin = value;
    }

    /**
     * Obtient la valeur de la propri�t� typeLien.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeLien() {
        return typeLien;
    }

    /**
     * D�finit la valeur de la propri�t� typeLien.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeLien(String value) {
        this.typeLien = value;
    }

    /**
     * Obtient la valeur de la propri�t� structureExterieure.
     * 
     * @return
     *     possible object is
     *     {@link StructureExterieure }
     *     
     */
    public StructureExterieure getStructureExterieure() {
        return structureExterieure;
    }

    /**
     * D�finit la valeur de la propri�t� structureExterieure.
     * 
     * @param value
     *     allowed object is
     *     {@link StructureExterieure }
     *     
     */
    public void setStructureExterieure(StructureExterieure value) {
        this.structureExterieure = value;
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
