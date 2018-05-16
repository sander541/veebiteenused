
package ee.ttu.idu0075.ws.laenutus;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for raamatType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="raamatType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="isbn" type="{http://www.ttu.ee/idu0075/ws/laenutus}isbnType"/>
 *         &lt;element name="pealkiri" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="genre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="autor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "raamatType", propOrder = {
    "id",
    "isbn",
    "pealkiri",
    "genre",
    "autor"
})
public class RaamatType {

    @XmlElement(required = true)
    protected BigInteger id;
    @XmlElement(required = true)
    protected BigInteger isbn;
    @XmlElement(required = true)
    protected String pealkiri;
    @XmlElement(required = true)
    protected String genre;
    @XmlElement(required = true)
    protected String autor;

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
     * Gets the value of the isbn property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIsbn() {
        return isbn;
    }

    /**
     * Sets the value of the isbn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIsbn(BigInteger value) {
        this.isbn = value;
    }

    /**
     * Gets the value of the pealkiri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPealkiri() {
        return pealkiri;
    }

    /**
     * Sets the value of the pealkiri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPealkiri(String value) {
        this.pealkiri = value;
    }

    /**
     * Gets the value of the genre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Sets the value of the genre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenre(String value) {
        this.genre = value;
    }

    /**
     * Gets the value of the autor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Sets the value of the autor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutor(String value) {
        this.autor = value;
    }

}
