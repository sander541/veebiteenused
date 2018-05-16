
package ee.ttu.idu0075.ws.laenutus;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for laenutusRaamatType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="laenutusRaamatType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="raamat" type="{http://www.ttu.ee/idu0075/ws/laenutus}raamatType"/>
 *         &lt;element name="viivis" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "laenutusRaamatType", propOrder = {
    "raamat",
    "viivis"
})
public class LaenutusRaamatType {

    @XmlElement(required = true)
    protected RaamatType raamat;
    protected double viivis;

    /**
     * Gets the value of the raamat property.
     * 
     * @return
     *     possible object is
     *     {@link RaamatType }
     *     
     */
    public RaamatType getRaamat() {
        return raamat;
    }

    /**
     * Sets the value of the raamat property.
     * 
     * @param value
     *     allowed object is
     *     {@link RaamatType }
     *     
     */
    public void setRaamat(RaamatType value) {
        this.raamat = value;
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

}
