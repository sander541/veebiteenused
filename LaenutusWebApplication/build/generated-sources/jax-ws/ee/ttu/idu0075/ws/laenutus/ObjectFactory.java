
package ee.ttu.idu0075.ws.laenutus;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ee.ttu.idu0075.ws.laenutus package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetRaamatResponse_QNAME = new QName("http://www.ttu.ee/idu0075/ws/laenutus", "getRaamatResponse");
    private final static QName _AddRaamatResponse_QNAME = new QName("http://www.ttu.ee/idu0075/ws/laenutus", "addRaamatResponse");
    private final static QName _GetLaenutusResponse_QNAME = new QName("http://www.ttu.ee/idu0075/ws/laenutus", "getLaenutusResponse");
    private final static QName _AddLaenutusResponse_QNAME = new QName("http://www.ttu.ee/idu0075/ws/laenutus", "addLaenutusResponse");
    private final static QName _GetLaenutusRaamatListResponse_QNAME = new QName("http://www.ttu.ee/idu0075/ws/laenutus", "getLaenutusRaamatListResponse");
    private final static QName _AddLaenutusRaamatResponse_QNAME = new QName("http://www.ttu.ee/idu0075/ws/laenutus", "addLaenutusRaamatResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ee.ttu.idu0075.ws.laenutus
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetRaamatRequest }
     * 
     */
    public GetRaamatRequest createGetRaamatRequest() {
        return new GetRaamatRequest();
    }

    /**
     * Create an instance of {@link RaamatType }
     * 
     */
    public RaamatType createRaamatType() {
        return new RaamatType();
    }

    /**
     * Create an instance of {@link AddRaamatRequest }
     * 
     */
    public AddRaamatRequest createAddRaamatRequest() {
        return new AddRaamatRequest();
    }

    /**
     * Create an instance of {@link GetRaamatListRequest }
     * 
     */
    public GetRaamatListRequest createGetRaamatListRequest() {
        return new GetRaamatListRequest();
    }

    /**
     * Create an instance of {@link GetRaamatListResponse }
     * 
     */
    public GetRaamatListResponse createGetRaamatListResponse() {
        return new GetRaamatListResponse();
    }

    /**
     * Create an instance of {@link GetLaenutusRequest }
     * 
     */
    public GetLaenutusRequest createGetLaenutusRequest() {
        return new GetLaenutusRequest();
    }

    /**
     * Create an instance of {@link LaenutusType }
     * 
     */
    public LaenutusType createLaenutusType() {
        return new LaenutusType();
    }

    /**
     * Create an instance of {@link AddLaenutusRequest }
     * 
     */
    public AddLaenutusRequest createAddLaenutusRequest() {
        return new AddLaenutusRequest();
    }

    /**
     * Create an instance of {@link GetLaenutusListRequest }
     * 
     */
    public GetLaenutusListRequest createGetLaenutusListRequest() {
        return new GetLaenutusListRequest();
    }

    /**
     * Create an instance of {@link GetLaenutusListResponse }
     * 
     */
    public GetLaenutusListResponse createGetLaenutusListResponse() {
        return new GetLaenutusListResponse();
    }

    /**
     * Create an instance of {@link GetLaenutusRaamatListRequest }
     * 
     */
    public GetLaenutusRaamatListRequest createGetLaenutusRaamatListRequest() {
        return new GetLaenutusRaamatListRequest();
    }

    /**
     * Create an instance of {@link LaenutusRaamatListType }
     * 
     */
    public LaenutusRaamatListType createLaenutusRaamatListType() {
        return new LaenutusRaamatListType();
    }

    /**
     * Create an instance of {@link AddLaenutusRaamatRequest }
     * 
     */
    public AddLaenutusRaamatRequest createAddLaenutusRaamatRequest() {
        return new AddLaenutusRaamatRequest();
    }

    /**
     * Create an instance of {@link LaenutusRaamatType }
     * 
     */
    public LaenutusRaamatType createLaenutusRaamatType() {
        return new LaenutusRaamatType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RaamatType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/ws/laenutus", name = "getRaamatResponse")
    public JAXBElement<RaamatType> createGetRaamatResponse(RaamatType value) {
        return new JAXBElement<RaamatType>(_GetRaamatResponse_QNAME, RaamatType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RaamatType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/ws/laenutus", name = "addRaamatResponse")
    public JAXBElement<RaamatType> createAddRaamatResponse(RaamatType value) {
        return new JAXBElement<RaamatType>(_AddRaamatResponse_QNAME, RaamatType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LaenutusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/ws/laenutus", name = "getLaenutusResponse")
    public JAXBElement<LaenutusType> createGetLaenutusResponse(LaenutusType value) {
        return new JAXBElement<LaenutusType>(_GetLaenutusResponse_QNAME, LaenutusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LaenutusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/ws/laenutus", name = "addLaenutusResponse")
    public JAXBElement<LaenutusType> createAddLaenutusResponse(LaenutusType value) {
        return new JAXBElement<LaenutusType>(_AddLaenutusResponse_QNAME, LaenutusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LaenutusRaamatListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/ws/laenutus", name = "getLaenutusRaamatListResponse")
    public JAXBElement<LaenutusRaamatListType> createGetLaenutusRaamatListResponse(LaenutusRaamatListType value) {
        return new JAXBElement<LaenutusRaamatListType>(_GetLaenutusRaamatListResponse_QNAME, LaenutusRaamatListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LaenutusRaamatType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/ws/laenutus", name = "addLaenutusRaamatResponse")
    public JAXBElement<LaenutusRaamatType> createAddLaenutusRaamatResponse(LaenutusRaamatType value) {
        return new JAXBElement<LaenutusRaamatType>(_AddLaenutusRaamatResponse_QNAME, LaenutusRaamatType.class, null, value);
    }

}
