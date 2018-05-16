
package ee.ttu.idu0075.ws.laenutus;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for laenutusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="laenutusType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="laenutusNo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="laenutusAlgus" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="laenutusLõpp" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="päeviÜle" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="viivis" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="laenutajaNimi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="laenutusRaamatList" type="{http://www.ttu.ee/idu0075/ws/laenutus}laenutusRaamatListType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "laenutusType", propOrder = {
    "id",
    "laenutusNo",
    "laenutusAlgus",
    "laenutusL\u00f5pp",
    "p\u00e4evi\u00dcle",
    "viivis",
    "laenutajaNimi",
    "laenutusRaamatList"
})
public class LaenutusType {

    @XmlElement(required = true)
    protected BigInteger id;
    protected int laenutusNo;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar laenutusAlgus;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar laenutusLõpp;
    protected int päeviÜle;
    protected double viivis;
    @XmlElement(required = true)
    protected String laenutajaNimi;
    @XmlElement(required = true)
    protected LaenutusRaamatListType laenutusRaamatList;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setId(BigInteger value) {
        this.id = value;
    }

    /**
     * Gets the value of the laenutusNo property.
     * 
     */
    public int getLaenutusNo() {
        return laenutusNo;
    }

    /**
     * Sets the value of the laenutusNo property.
     * 
     */
    public void setLaenutusNo(int value) {
        this.laenutusNo = value;
    }

    /**
     * Gets the value of the laenutusAlgus property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLaenutusAlgus() {
        return laenutusAlgus;
    }

    /**
     * Sets the value of the laenutusAlgus property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLaenutusAlgus(XMLGregorianCalendar value) {
        this.laenutusAlgus = value;
    }

    /**
     * Gets the value of the laenutusLõpp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLaenutusLõpp() {
        return laenutusLõpp;
    }

    /**
     * Sets the value of the laenutusLõpp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLaenutusLõpp(XMLGregorianCalendar value) {
        this.laenutusLõpp = value;
    }

    /**
     * Gets the value of the päeviÜle property.
     * 
     */
    public int getPäeviÜle() {
        return päeviÜle;
    }

    /**
     * Sets the value of the päeviÜle property.
     * 
     */
    public void setPäeviÜle(int value) {
        this.päeviÜle = value;
    }

    /**
     * Gets the value of the viivis property.
     * 
     */
    public double getViivis() {
        return viivis;
    }

    /**
     * Sets the value of the viivis property.
     * 
     */
    public void setViivis(double value) {
        this.viivis = value;
    }

    /**
     * Gets the value of the laenutajaNimi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLaenutajaNimi() {
        return laenutajaNimi;
    }

    /**
     * Sets the value of the laenutajaNimi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLaenutajaNimi(String value) {
        this.laenutajaNimi = value;
    }

    /**
     * Gets the value of the laenutusRaamatList property.
     * 
     * @return
     *     possible object is
     *     {@link LaenutusRaamatListType }
     *     
     */
    public LaenutusRaamatListType getLaenutusRaamatList() {
        return laenutusRaamatList;
    }

    /**
     * Sets the value of the laenutusRaamatList property.
     * 
     * @param value
     *     allowed object is
     *     {@link LaenutusRaamatListType }
     *     
     */
    public void setLaenutusRaamatList(LaenutusRaamatListType value) {
        this.laenutusRaamatList = value;
    }

}
