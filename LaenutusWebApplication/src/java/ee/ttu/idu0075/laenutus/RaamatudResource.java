/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ee.ttu.idu0075.laenutus;

import ee.ttu.idu0075.ws.laenutus.AddRaamatRequest;
import ee.ttu.idu0075.ws.laenutus.GetRaamatListRequest;
import ee.ttu.idu0075.ws.laenutus.GetRaamatListResponse;
import ee.ttu.idu0075.ws.laenutus.GetRaamatRequest;
import ee.ttu.idu0075.ws.laenutus.RaamatType;
import java.math.BigInteger;
import static javax.swing.JOptionPane.showMessageDialog;
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

/**
 * REST Web Service
 *
 * @author annul
 */
@Path("raamatud")
public class RaamatudResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of ProductsResponse
     */
    public RaamatudResource() {
    }

    /**
     * Retrieves representation of an instance of InvoicePackage.ProductsResource
     * @return an instance of ee.ttu.idu0075._2015.ws.invoice.ProductType
     */
    @GET
    @Produces("application/json")
    public GetRaamatListResponse getRaamatudList(@QueryParam("token") String token, @QueryParam("autor") String autor) {
        LaenutusWebServiceFromWSDL ws = new LaenutusWebServiceFromWSDL();
        GetRaamatListRequest request = new GetRaamatListRequest();
        request.setToken(token);
        request.setAutor(autor);
        return ws.getRaamatList(request);
    }
    
    
    @GET
    @Path("{id : \\d+}") //supports digits only
    @Produces("application/json")
    public RaamatType getRaamat(@PathParam("id") String id,
            @QueryParam("token") String token) {
        LaenutusWebServiceFromWSDL ws = new LaenutusWebServiceFromWSDL();
        GetRaamatRequest request = new GetRaamatRequest();
        request.setId(BigInteger.valueOf(Integer.parseInt(id)));
        request.setToken(token);
        return ws.getRaamat(request);
    }
    
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public RaamatType addRaamat(RaamatType content, 
                                @QueryParam("token") String token) {
        int isbnLength = String.valueOf(content.getIsbn()).length();
        LaenutusWebServiceFromWSDL ws = new LaenutusWebServiceFromWSDL();
        AddRaamatRequest request = new AddRaamatRequest();
        if(isbnLength == 13){
            request.setPealkiri(content.getPealkiri());
            request.setAutor(content.getAutor());
            request.setIsbn(content.getIsbn());
            request.setGenre(content.getGenre());
            request.setToken(token);
        }
        else throw new ArithmeticException("not valid isbn code");
        
        return ws.addRaamat(request);
        
    }
}
