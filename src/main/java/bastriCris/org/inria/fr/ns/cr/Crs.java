//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2017.12.31 � 02:45:15 AM CET 
//


package org.inria.fr.ns.cr;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cr" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="numnatstructrep" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="date_ouverture" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *                   &lt;element name="date_fermeture" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *                   &lt;element name="sigle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="libelle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="idgef" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
 *                   &lt;element name="adressegeographique"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="libelle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="cri"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;simpleContent&gt;
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                                     &lt;attribute name="siid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/simpleContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="ville" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="adresse" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="cp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *                             &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="siid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="responsable" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="personne"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="prenom" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                     &lt;/sequence&gt;
 *                                     &lt;attribute name="gefid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="fonction" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="siid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cr"
})
@XmlRootElement(name = "crs")
public class Crs {

    protected List<Crs.Cr> cr;

    /**
     * Gets the value of the cr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Crs.Cr }
     * 
     * 
     */
    public List<Crs.Cr> getCr() {
        if (cr == null) {
            cr = new ArrayList<Crs.Cr>();
        }
        return this.cr;
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="numnatstructrep" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="date_ouverture" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
     *         &lt;element name="date_fermeture" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
     *         &lt;element name="sigle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="libelle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="idgef" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
     *         &lt;element name="adressegeographique"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="libelle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="cri"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                           &lt;attribute name="siid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="ville" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="adresse" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="cp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
     *                   &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="siid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="responsable" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="personne"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="prenom" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                           &lt;/sequence&gt;
     *                           &lt;attribute name="gefid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="fonction" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="siid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "numnatstructrep",
        "dateOuverture",
        "dateFermeture",
        "sigle",
        "libelle",
        "idgef",
        "adressegeographique",
        "responsable"
    })
    public static class Cr {

        @XmlElement(required = true)
        protected String numnatstructrep;
        @XmlElement(name = "date_ouverture", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dateOuverture;
        @XmlElement(name = "date_fermeture", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dateFermeture;
        @XmlElement(required = true)
        protected String sigle;
        @XmlElement(required = true)
        protected String libelle;
        protected byte idgef;
        @XmlElement(required = true)
        protected Crs.Cr.Adressegeographique adressegeographique;
        protected List<Crs.Cr.Responsable> responsable;
        @XmlAttribute(name = "siid")
        protected String siid;

        /**
         * Obtient la valeur de la propri�t� numnatstructrep.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumnatstructrep() {
            return numnatstructrep;
        }

        /**
         * D�finit la valeur de la propri�t� numnatstructrep.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumnatstructrep(String value) {
            this.numnatstructrep = value;
        }

        /**
         * Obtient la valeur de la propri�t� dateOuverture.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDateOuverture() {
            return dateOuverture;
        }

        /**
         * D�finit la valeur de la propri�t� dateOuverture.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDateOuverture(XMLGregorianCalendar value) {
            this.dateOuverture = value;
        }

        /**
         * Obtient la valeur de la propri�t� dateFermeture.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDateFermeture() {
            return dateFermeture;
        }

        /**
         * D�finit la valeur de la propri�t� dateFermeture.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDateFermeture(XMLGregorianCalendar value) {
            this.dateFermeture = value;
        }

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
         * Obtient la valeur de la propri�t� idgef.
         * 
         */
        public byte getIdgef() {
            return idgef;
        }

        /**
         * D�finit la valeur de la propri�t� idgef.
         * 
         */
        public void setIdgef(byte value) {
            this.idgef = value;
        }

        /**
         * Obtient la valeur de la propri�t� adressegeographique.
         * 
         * @return
         *     possible object is
         *     {@link Crs.Cr.Adressegeographique }
         *     
         */
        public Crs.Cr.Adressegeographique getAdressegeographique() {
            return adressegeographique;
        }

        /**
         * D�finit la valeur de la propri�t� adressegeographique.
         * 
         * @param value
         *     allowed object is
         *     {@link Crs.Cr.Adressegeographique }
         *     
         */
        public void setAdressegeographique(Crs.Cr.Adressegeographique value) {
            this.adressegeographique = value;
        }

        /**
         * Gets the value of the responsable property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the responsable property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getResponsable().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Crs.Cr.Responsable }
         * 
         * 
         */
        public List<Crs.Cr.Responsable> getResponsable() {
            if (responsable == null) {
                responsable = new ArrayList<Crs.Cr.Responsable>();
            }
            return this.responsable;
        }

        /**
         * Obtient la valeur de la propri�t� siid.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSiid() {
            return siid;
        }

        /**
         * D�finit la valeur de la propri�t� siid.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSiid(String value) {
            this.siid = value;
        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="libelle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="cri"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *                 &lt;attribute name="siid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="ville" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="adresse" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="cp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
         *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="siid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "libelle",
            "cri",
            "ville",
            "adresse",
            "cp",
            "latitude",
            "longitude"
        })
        public static class Adressegeographique {

            @XmlElement(required = true)
            protected String libelle;
            @XmlElement(required = true)
            protected Crs.Cr.Adressegeographique.Cri cri;
            @XmlElement(required = true)
            protected String ville;
            @XmlElement(required = true)
            protected String adresse;
            @XmlElement(required = true)
            protected String cp;
            protected float latitude;
            protected float longitude;
            @XmlAttribute(name = "siid")
            protected String siid;

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
             * Obtient la valeur de la propri�t� cri.
             * 
             * @return
             *     possible object is
             *     {@link Crs.Cr.Adressegeographique.Cri }
             *     
             */
            public Crs.Cr.Adressegeographique.Cri getCri() {
                return cri;
            }

            /**
             * D�finit la valeur de la propri�t� cri.
             * 
             * @param value
             *     allowed object is
             *     {@link Crs.Cr.Adressegeographique.Cri }
             *     
             */
            public void setCri(Crs.Cr.Adressegeographique.Cri value) {
                this.cri = value;
            }

            /**
             * Obtient la valeur de la propri�t� ville.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVille() {
                return ville;
            }

            /**
             * D�finit la valeur de la propri�t� ville.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVille(String value) {
                this.ville = value;
            }

            /**
             * Obtient la valeur de la propri�t� adresse.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAdresse() {
                return adresse;
            }

            /**
             * D�finit la valeur de la propri�t� adresse.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAdresse(String value) {
                this.adresse = value;
            }

            /**
             * Obtient la valeur de la propri�t� cp.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCp() {
                return cp;
            }

            /**
             * D�finit la valeur de la propri�t� cp.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCp(String value) {
                this.cp = value;
            }

            /**
             * Obtient la valeur de la propri�t� latitude.
             * 
             */
            public float getLatitude() {
                return latitude;
            }

            /**
             * D�finit la valeur de la propri�t� latitude.
             * 
             */
            public void setLatitude(float value) {
                this.latitude = value;
            }

            /**
             * Obtient la valeur de la propri�t� longitude.
             * 
             */
            public float getLongitude() {
                return longitude;
            }

            /**
             * D�finit la valeur de la propri�t� longitude.
             * 
             */
            public void setLongitude(float value) {
                this.longitude = value;
            }

            /**
             * Obtient la valeur de la propri�t� siid.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSiid() {
                return siid;
            }

            /**
             * D�finit la valeur de la propri�t� siid.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSiid(String value) {
                this.siid = value;
            }


            /**
             * <p>Classe Java pour anonymous complex type.
             * 
             * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;simpleContent&gt;
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
             *       &lt;attribute name="siid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *     &lt;/extension&gt;
             *   &lt;/simpleContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class Cri {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "siid")
                protected String siid;

                /**
                 * Obtient la valeur de la propri�t� value.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * D�finit la valeur de la propri�t� value.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Obtient la valeur de la propri�t� siid.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSiid() {
                    return siid;
                }

                /**
                 * D�finit la valeur de la propri�t� siid.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSiid(String value) {
                    this.siid = value;
                }

            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="personne"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="prenom" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                 &lt;/sequence&gt;
         *                 &lt;attribute name="gefid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="fonction" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "personne"
        })
        public static class Responsable {

            @XmlElement(required = true)
            protected Crs.Cr.Responsable.Personne personne;
            @XmlAttribute(name = "fonction")
            protected String fonction;

            /**
             * Obtient la valeur de la propri�t� personne.
             * 
             * @return
             *     possible object is
             *     {@link Crs.Cr.Responsable.Personne }
             *     
             */
            public Crs.Cr.Responsable.Personne getPersonne() {
                return personne;
            }

            /**
             * D�finit la valeur de la propri�t� personne.
             * 
             * @param value
             *     allowed object is
             *     {@link Crs.Cr.Responsable.Personne }
             *     
             */
            public void setPersonne(Crs.Cr.Responsable.Personne value) {
                this.personne = value;
            }

            /**
             * Obtient la valeur de la propri�t� fonction.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFonction() {
                return fonction;
            }

            /**
             * D�finit la valeur de la propri�t� fonction.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFonction(String value) {
                this.fonction = value;
            }


            /**
             * <p>Classe Java pour anonymous complex type.
             * 
             * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="prenom" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *       &lt;/sequence&gt;
             *       &lt;attribute name="gefid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "nom",
                "prenom"
            })
            public static class Personne {

                @XmlElement(required = true)
                protected String nom;
                @XmlElement(required = true)
                protected String prenom;
                @XmlAttribute(name = "gefid")
                protected String gefid;

                /**
                 * Obtient la valeur de la propri�t� nom.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNom() {
                    return nom;
                }

                /**
                 * D�finit la valeur de la propri�t� nom.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNom(String value) {
                    this.nom = value;
                }

                /**
                 * Obtient la valeur de la propri�t� prenom.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPrenom() {
                    return prenom;
                }

                /**
                 * D�finit la valeur de la propri�t� prenom.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPrenom(String value) {
                    this.prenom = value;
                }

                /**
                 * Obtient la valeur de la propri�t� gefid.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getGefid() {
                    return gefid;
                }

                /**
                 * D�finit la valeur de la propri�t� gefid.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setGefid(String value) {
                    this.gefid = value;
                }

            }

        }

    }

}
