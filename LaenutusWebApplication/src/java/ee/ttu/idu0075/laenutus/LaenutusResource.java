/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ee.ttu.idu0075.laenutus;

import ee.ttu.idu0075.ws.laenutus.AddLaenutusRaamatRequest;
import ee.ttu.idu0075.ws.laenutus.AddLaenutusRequest;
import ee.ttu.idu0075.ws.laenutus.GetLaenutusListRequest;
import ee.ttu.idu0075.ws.laenutus.GetLaenutusListResponse;
import ee.ttu.idu0075.ws.laenutus.GetLaenutusRaamatListRequest;
import ee.ttu.idu0075.ws.laenutus.GetLaenutusRequest;
import ee.ttu.idu0075.ws.laenutus.LaenutusRaamatListType;
import ee.ttu.idu0075.ws.laenutus.LaenutusRaamatType;
import ee.ttu.idu0075.ws.laenutus.LaenutusType;
import static ee.ttu.idu0075.laenutus.LaenutusWebServiceFromWSDL.toDate;
import java.math.BigInteger;
import java.util.Date;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.xml.datatype.DatatypeConfigurationException;

/**
 * REST Web Service
 *
 * @author annul
 */
@Path("laenutus")
public class LaenutusResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of LaenutusResource
     */
    public LaenutusResource() {
    }

    /**
     * Retrieves representation of an instance of ee.ttu.idu0075.laenutus.LaenutusResource
     * @return an instance of ee.ttu.idu0075._2015.ws.laenutus.LaenutusType
     */
    @GET
    @Produces("application/json")
    public GetLaenutusListResponse getLaenutusList(@QueryParam("token") String token, @QueryParam("päeviÜle") int päeviÜle
    ,@QueryParam("viivisFrom") double viivisFrom,@QueryParam("laenutusNoRangeFrom") int laenutusNoRangeFrom, @QueryParam("laenutusNoRangeTo") int laenutusNoRangeTo) {
        LaenutusWebServiceFromWSDL ws = new LaenutusWebServiceFromWSDL();
        GetLaenutusListRequest request = new GetLaenutusListRequest();
        request.setToken(token);
        request.setPäeviÜle(päeviÜle);
        request.setViivisFrom(viivisFrom);
        request.setLaenutusNoRangeFrom(laenutusNoRangeFrom);
        request.setLaenutusNoRangeTo(laenutusNoRangeTo);
        return ws.getLaenutusList(request);
    }
    
    @GET
    @Path("{id : \\d+}") //supports digits only
    @Produces("application/json")
    public LaenutusType getLaenutus(@PathParam("id") String id,
            @QueryParam("token") String token) {
        LaenutusWebServiceFromWSDL ws = new LaenutusWebServiceFromWSDL();
        GetLaenutusRequest request = new GetLaenutusRequest();
        request.setId(BigInteger.valueOf(Integer.parseInt(id)));
        request.setToken(token);
        return ws.getLaenutus(request);
    }
    
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public LaenutusType addLaenutus(LaenutusType content, 
                                @QueryParam("token") String token) throws DatatypeConfigurationException {
        LaenutusWebServiceFromWSDL ws = new LaenutusWebServiceFromWSDL();
        AddLaenutusRequest request = new AddLaenutusRequest();
        
        request.setLaenutusNo(content.getLaenutusNo());
        request.setLaenutusAlgus(content.getLaenutusAlgus());
        request.setLaenutusLõpp(content.getLaenutusLõpp());
        request.setLaenutajaNimi(content.getLaenutajaNimi());
        //request.setLaenutusRaamatList(new LaenutusRaamatListType());
        request.setToken(token);
        return ws.addLaenutus(request);
    }
    @POST
    @Path("{id : \\d+}/raamatud") //support digit only
    @Consumes("application/json")
    @Produces("application/json")
    public LaenutusRaamatType addLaenutusRaamat(AddLaenutusRaamatRequest content, 
                                @QueryParam("token") String token,
                                @PathParam("id") String id) {
        LaenutusWebServiceFromWSDL ws = new LaenutusWebServiceFromWSDL();
        AddLaenutusRaamatRequest request = new AddLaenutusRaamatRequest();
        request.setToken(token);
        request.setLaenutusId(BigInteger.valueOf(Integer.parseInt(id)));
        request.setRaamatId(content.getRaamatId());
        return ws.addLaenutusRaamat(request);    
    }
    
    @GET
    @Path("{id : \\d+}/raamatud") //support digit only
    @Produces("application/json")
    public LaenutusRaamatListType getLaenutusRaamatList(@PathParam("id") String id,
            @QueryParam("token") String token) {
        LaenutusWebServiceFromWSDL ws = new LaenutusWebServiceFromWSDL();
        GetLaenutusRaamatListRequest request = new GetLaenutusRaamatListRequest();
        request.setLaenutusId(BigInteger.valueOf(Integer.parseInt(id)));
        request.setToken(token);
        return ws.getLaenutusRaamatList(request);
    }
    
}
