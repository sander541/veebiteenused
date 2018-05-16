
package ee.ttu.idu0075.ws.laenutus;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="päeviÜle" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="viivisFrom" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="laenutusNoRangeFrom" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="laenutusNoRangeTo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "token",
    "p\u00e4evi\u00dcle",
    "viivisFrom",
    "laenutusNoRangeFrom",
    "laenutusNoRangeTo"
})
@XmlRootElement(name = "getLaenutusListRequest")
public class GetLaenutusListRequest {

    @XmlElement(required = true)
    protected String token;
    protected int päeviÜle;
    protected double viivisFrom;
    protected int laenutusNoRangeFrom;
    protected int laenutusNoRangeTo;

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
     * Gets the value of the viivisFrom property.
     * 
     */
    public double getViivisFrom() {
        return viivisFrom;
    }

    /**
     * Sets the value of the viivisFrom property.
     * 
     */
    public void setViivisFrom(double value) {
        this.viivisFrom = value;
    }

    /**
     * Gets the value of the laenutusNoRangeFrom property.
     * 
     */
    public int getLaenutusNoRangeFrom() {
        return laenutusNoRangeFrom;
    }

    /**
     * Sets the value of the laenutusNoRangeFrom property.
     * 
     */
    public void setLaenutusNoRangeFrom(int value) {
        this.laenutusNoRangeFrom = value;
    }

    /**
     * Gets the value of the laenutusNoRangeTo property.
     * 
     */
    public int getLaenutusNoRangeTo() {
        return laenutusNoRangeTo;
    }

    /**
     * Sets the value of the laenutusNoRangeTo property.
     * 
     */
    public void setLaenutusNoRangeTo(int value) {
        this.laenutusNoRangeTo = value;
    }

}
