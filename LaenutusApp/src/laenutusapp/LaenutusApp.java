/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laenutusapp;

import ee.ttu.idu0075.ws.laenutus.AddRaamatRequest;
import ee.ttu.idu0075.ws.laenutus.GetRaamatRequest;
import ee.ttu.idu0075.ws.laenutus.RaamatType;
import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author annul
 */
public class LaenutusApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner obj=new Scanner(System.in);
        System.out.println("Vali soovitud tegevuse number \n"
                + "1. Lisa raamat\n"
                + "2. Vaata raamatut");
        String operation=obj.next();
        int operationInt=Integer.parseInt(operation);
        if(operationInt == 1){
            addBook();
        }
        if(operationInt == 2){
        getBook();
    }
        else System.out.println("sisestatud vale väärtus");
    }

    private static RaamatType getRaamat(ee.ttu.idu0075.ws.laenutus.GetRaamatRequest parameter) {
        ee.ttu.idu0075.ws.laenutus.LaenutusService service = new ee.ttu.idu0075.ws.laenutus.LaenutusService();
        ee.ttu.idu0075.ws.laenutus.LaenutusPortType port = service.getLaenutusPort();
        return port.getRaamat(parameter);
    }

    private static RaamatType addRaamat(ee.ttu.idu0075.ws.laenutus.AddRaamatRequest parameter) {
        ee.ttu.idu0075.ws.laenutus.LaenutusService service = new ee.ttu.idu0075.ws.laenutus.LaenutusService();
        ee.ttu.idu0075.ws.laenutus.LaenutusPortType port = service.getLaenutusPort();
        return port.addRaamat(parameter);
    }
    
    private static void addBook(){
        Scanner obj = new Scanner(System.in);
        AddRaamatRequest request = new AddRaamatRequest();
        System.out.println("sisesta vajalik token: ");
        request.setToken(obj.next());
        System.out.println("sisesta raamatu nimi: ");
        request.setPealkiri(obj.next());
        System.out.println("sisesta raamatu autor: ");
        request.setAutor(obj.next());
        System.out.println("sisesta raamatu genre: ");
        request.setGenre(obj.next());
        System.out.println("sisesta raamatu isbn: ");
        request.setIsbn(BigInteger.valueOf(Integer.parseInt(obj.next())));
        addRaamat(request);
}
    private static void getBook(){
        GetRaamatRequest r = new GetRaamatRequest();
        Scanner obj = new Scanner(System.in);
        System.out.println("sisesta vajalik token: ");
            r.setToken(obj.next());
        System.out.println("Sisesta soovitud raamatu id: ");
        r.setId(BigInteger.valueOf(Integer.parseInt(obj.next())));
        RaamatType rt = getRaamat(r);
        System.out.println("Raamatu pealkiri on: " + rt.getPealkiri());
        System.out.println("Raamatu genre on: " + rt.getGenre());
        System.out.println("Raamatu autor on: " + rt.getAutor());
        System.out.println("Raamatu isbn on: " + rt.getIsbn());
        
    }
    
}
