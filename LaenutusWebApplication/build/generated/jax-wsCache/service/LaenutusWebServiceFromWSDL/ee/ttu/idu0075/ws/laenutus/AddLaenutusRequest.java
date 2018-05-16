
package ee.ttu.idu0075.ws.laenutus;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="laenutusNo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="laenutusAlgus" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="laenutusLõpp" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="laenutajaNimi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "token",
    "laenutusNo",
    "laenutusAlgus",
    "laenutusL\u00f5pp",
    "laenutajaNimi"
})
@XmlRootElement(name = "addLaenutusRequest")
public class AddLaenutusRequest {

    @XmlElement(required = true)
    protected String token;
    protected int laenutusNo;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar laenutusAlgus;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar laenutusLõpp;
    @XmlElement(required = true)
    protected String laenutajaNimi;

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
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

}
