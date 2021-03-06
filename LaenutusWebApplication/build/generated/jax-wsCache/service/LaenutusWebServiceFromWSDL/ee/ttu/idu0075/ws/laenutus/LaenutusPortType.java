
package ee.ttu.idu0075.ws.laenutus;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "LaenutusPortType", targetNamespace = "http://www.ttu.ee/idu0075/ws/laenutus")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface LaenutusPortType {


    /**
     * 
     * @param parameter
     * @return
     *     returns ee.ttu.idu0075.ws.laenutus.RaamatType
     */
    @WebMethod
    @WebResult(name = "getRaamatResponse", targetNamespace = "http://www.ttu.ee/idu0075/ws/laenutus", partName = "parameter")
    public RaamatType getRaamat(
        @WebParam(name = "getRaamatRequest", targetNamespace = "http://www.ttu.ee/idu0075/ws/laenutus", partName = "parameter")
        GetRaamatRequest parameter);

    /**
     * 
     * @param parameter
     * @return
     *     returns ee.ttu.idu0075.ws.laenutus.RaamatType
     */
    @WebMethod
    @WebResult(name = "addRaamatResponse", targetNamespace = "http://www.ttu.ee/idu0075/ws/laenutus", partName = "parameter")
    public RaamatType addRaamat(
        @WebParam(name = "addRaamatRequest", targetNamespace = "http://www.ttu.ee/idu0075/ws/laenutus", partName = "parameter")
        AddRaamatRequest parameter);

    /**
     * 
     * @param parameter
     * @return
     *     returns ee.ttu.idu0075.ws.laenutus.GetRaamatListResponse
     */
    @WebMethod
    @WebResult(name = "getRaamatListResponse", targetNamespace = "http://www.ttu.ee/idu0075/ws/laenutus", partName = "parameter")
    public GetRaamatListResponse getRaamatList(
        @WebParam(name = "getRaamatListRequest", targetNamespace = "http://www.ttu.ee/idu0075/ws/laenutus", partName = "parameter")
        GetRaamatListRequest parameter);

    /**
     * 
     * @param parameter
     * @return
     *     returns ee.ttu.idu0075.ws.laenutus.LaenutusType
     */
    @WebMethod
    @WebResult(name = "getLaenutusResponse", targetNamespace = "http://www.ttu.ee/idu0075/ws/laenutus", partName = "parameter")
    public LaenutusType getLaenutus(
        @WebParam(name = "getLaenutusRequest", targetNamespace = "http://www.ttu.ee/idu0075/ws/laenutus", partName = "parameter")
        GetLaenutusRequest parameter);

    /**
     * 
     * @param parameter
     * @return
     *     returns ee.ttu.idu0075.ws.laenutus.LaenutusType
     */
    @WebMethod
    @WebResult(name = "addLaenutusResponse", targetNamespace = "http://www.ttu.ee/idu0075/ws/laenutus", partName = "parameter")
    public LaenutusType addLaenutus(
        @WebParam(name = "addLaenutusRequest", targetNamespace = "http://www.ttu.ee/idu0075/ws/laenutus", partName = "parameter")
        AddLaenutusRequest parameter);

    /**
     * 
     * @param parameter
     * @return
     *     returns ee.ttu.idu0075.ws.laenutus.GetLaenutusListResponse
     */
    @WebMethod
    @WebResult(name = "getLaenutusListResponse", targetNamespace = "http://www.ttu.ee/idu0075/ws/laenutus", partName = "parameter")
    public GetLaenutusListResponse getLaenutusList(
        @WebParam(name = "getLaenutusListRequest", targetNamespace = "http://www.ttu.ee/idu0075/ws/laenutus", partName = "parameter")
        GetLaenutusListRequest parameter);

    /**
     * 
     * @param parameter
     * @return
     *     returns ee.ttu.idu0075.ws.laenutus.LaenutusRaamatListType
     */
    @WebMethod
    @WebResult(name = "getLaenutusRaamatListResponse", targetNamespace = "http://www.ttu.ee/idu0075/ws/laenutus", partName = "parameter")
    public LaenutusRaamatListType getLaenutusRaamatList(
        @WebParam(name = "getLaenutusRaamatListRequest", targetNamespace = "http://www.ttu.ee/idu0075/ws/laenutus", partName = "parameter")
        GetLaenutusRaamatListRequest parameter);

    /**
     * 
     * @param parameter
     * @return
     *     returns ee.ttu.idu0075.ws.laenutus.LaenutusRaamatType
     */
    @WebMethod
    @WebResult(name = "addLaenutusRaamatResponse", targetNamespace = "http://www.ttu.ee/idu0075/ws/laenutus", partName = "parameter")
    public LaenutusRaamatType addLaenutusRaamat(
        @WebParam(name = "addLaenutusRaamatRequest", targetNamespace = "http://www.ttu.ee/idu0075/ws/laenutus", partName = "parameter")
        AddLaenutusRaamatRequest parameter);

}
