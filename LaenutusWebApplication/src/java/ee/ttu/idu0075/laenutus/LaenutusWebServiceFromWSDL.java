/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ee.ttu.idu0075.laenutus;


import ee.ttu.idu0075.ws.laenutus.AddLaenutusRaamatRequest;
import ee.ttu.idu0075.ws.laenutus.AddLaenutusRequest;
import ee.ttu.idu0075.ws.laenutus.AddRaamatRequest;
import ee.ttu.idu0075.ws.laenutus.GetLaenutusListRequest;
import ee.ttu.idu0075.ws.laenutus.GetLaenutusListResponse;
import ee.ttu.idu0075.ws.laenutus.GetLaenutusRaamatListRequest;
import ee.ttu.idu0075.ws.laenutus.GetLaenutusRequest;
import ee.ttu.idu0075.ws.laenutus.GetRaamatListRequest;
import ee.ttu.idu0075.ws.laenutus.GetRaamatListResponse;
import ee.ttu.idu0075.ws.laenutus.GetRaamatRequest;
import ee.ttu.idu0075.ws.laenutus.LaenutusRaamatType;
import ee.ttu.idu0075.ws.laenutus.LaenutusRaamatListType;
import ee.ttu.idu0075.ws.laenutus.LaenutusType;
import ee.ttu.idu0075.ws.laenutus.RaamatType;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.jws.WebService;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 *
 * @author annul
 */
@WebService(serviceName = "LaenutusService", portName = "LaenutusPort", endpointInterface = "ee.ttu.idu0075.ws.laenutus.LaenutusPortType", targetNamespace = "http://www.ttu.ee/idu0075/ws/laenutus", wsdlLocation = "WEB-INF/wsdl/LaenutusWebServiceFromWSDL/LaenutusService.wsdl")
public class LaenutusWebServiceFromWSDL {
    
    static int nextRaamatId = 1;
    static int nextLaenutusId = 1;
    static List<RaamatType> raamatList = new ArrayList<RaamatType>();
    static List<LaenutusType> laenutusList = new ArrayList<LaenutusType>();
    static double viiviseHind = 0.5;

    public RaamatType getRaamat(GetRaamatRequest parameter) {
        RaamatType pt = null;
        if(parameter.getToken().equalsIgnoreCase("salajane")){
            for(int i = 0; i< raamatList.size(); i++){
                if(raamatList.get(i).getId().equals(parameter.getId())){
                   pt = raamatList.get(i);
            }}
        }
        return pt;
    }

    public RaamatType addRaamat(AddRaamatRequest parameter) {
        RaamatType pt = new RaamatType();
        int isbnLength = String.valueOf(parameter.getIsbn()).length();
        
        if(parameter.getToken().equalsIgnoreCase("salajane") && isbnLength == 13 ){
            pt.setIsbn(parameter.getIsbn());
            pt.setAutor(parameter.getAutor());
            pt.setPealkiri(parameter.getPealkiri());
            pt.setGenre(parameter.getGenre());
            pt.setId(BigInteger.valueOf(nextRaamatId++));
            raamatList.add(pt);
        }
        return pt;
    }

    public GetRaamatListResponse getRaamatList(GetRaamatListRequest parameter) {
        GetRaamatListResponse response = new GetRaamatListResponse();
        if (parameter.getToken().equalsIgnoreCase("salajane")) {
            if(parameter.getAutor() != null){
                List<RaamatType> raamat = raamatList.stream()
                        .filter(p -> p.getAutor().equalsIgnoreCase(parameter.getAutor())).collect(Collectors.toList());
                raamat.forEach((raamatType)->{
                response.getRaamat().add(raamatType);
            });
            }
            else {raamatList.forEach((raamatType) -> {
                response.getRaamat().add(raamatType);
                });
            }
        }
        return response;
    }
    public static Date toDate(XMLGregorianCalendar calendar){
        if(calendar == null) {
            return null;
        }
        return calendar.toGregorianCalendar().getTime();
    }

    public LaenutusType addLaenutus(AddLaenutusRequest parameter) throws DatatypeConfigurationException {
        LaenutusType it = new LaenutusType();
        //Date date1 = toDate(parameter.getLaenutusAlgus());
        Date date2 = toDate(parameter.getLaenutusLõpp());
        Date date3 = new Date();

        int daysOverDueDate = daysBetween(date2,date3);
        
        if (parameter.getToken().equalsIgnoreCase("salajane")) {
            
            it.setId(BigInteger.valueOf(nextLaenutusId++));
            it.setLaenutusNo(parameter.getLaenutusNo());
            it.setLaenutusAlgus(parameter.getLaenutusAlgus());
            it.setLaenutusLõpp(parameter.getLaenutusLõpp());
            it.setLaenutajaNimi(parameter.getLaenutajaNimi());
            it.setLaenutusRaamatList(new LaenutusRaamatListType());
            it.setPäeviÜle(daysOverDueDate);
            if(daysOverDueDate > 0){
                    it.setViivis(daysOverDueDate * viiviseHind);
                    }
            laenutusList.add(it);
        }
        return it;
    }
    
    public int daysBetween(Date d1, Date d2){
             return (int)( (d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
     }
    
    public LaenutusType getLaenutus(GetLaenutusRequest parameter) {
        LaenutusType it = null;
        if (parameter.getToken().equalsIgnoreCase("salajane")) {
            for (int i = 0; i < laenutusList.size(); i++) {
                if (laenutusList.get(i).getId().equals(parameter.getId())) {
                    it = laenutusList.get(i);
                }
            }    
        }
        return it;
    }

    public GetLaenutusListResponse getLaenutusList(GetLaenutusListRequest parameter) {
        GetLaenutusListResponse response = new GetLaenutusListResponse();
        if (parameter.getToken().equalsIgnoreCase("salajane")) {
                List<LaenutusType> laenutus = laenutusList.stream()
                        .filter(p -> p.getViivis() >= parameter.getViivisFrom())
                        .filter(p -> p.getPäeviÜle() >= parameter.getPäeviÜle())
                        .filter(p -> p.getLaenutusNo() >= parameter.getLaenutusNoRangeFrom())
                        .filter(p -> p.getLaenutusNo() <= parameter.getLaenutusNoRangeTo())
                        .collect(Collectors.toList());
                
                
                laenutus.forEach((laenutusType)->{
                response.getLaenutus().add(laenutusType);
            });
            }
      
        return response;
    }

    public LaenutusRaamatListType getLaenutusRaamatList(GetLaenutusRaamatListRequest parameter) {
        LaenutusRaamatListType laenutusRaamatList = null;
        if (parameter.getToken().equalsIgnoreCase("salajane")) {
            for (int i = 0; i < laenutusList.size(); i++) {
                if (laenutusList.get(i).getId().equals(parameter.getLaenutusId())) {
                    laenutusRaamatList = laenutusList.get(i).getLaenutusRaamatList();
                }

            }    
        }
        return laenutusRaamatList;
    }

    public LaenutusRaamatType addLaenutusRaamat(AddLaenutusRaamatRequest parameter) {
        LaenutusRaamatType laenutusRaamat = new LaenutusRaamatType();
        
        
        if (parameter.getToken().equalsIgnoreCase("salajane")) {
            GetRaamatRequest raamatRequest = new GetRaamatRequest();
            
            raamatRequest.setId(parameter.getRaamatId());
            raamatRequest.setToken(parameter.getToken());
            laenutusRaamat.setRaamat(getRaamat(raamatRequest));
            
            for (int i = 0; i < laenutusList.size(); i++) {
                if (laenutusList.get(i).getId().equals(parameter.getLaenutusId())) {
                    laenutusList.get(i).getLaenutusRaamatList().getLaenutusRaamat().add(laenutusRaamat);
                    laenutusRaamat.setViivis(laenutusList.get(i).getViivis());
                    return laenutusRaamat;
                }

            } 
        }
        return null;
    }
    
}