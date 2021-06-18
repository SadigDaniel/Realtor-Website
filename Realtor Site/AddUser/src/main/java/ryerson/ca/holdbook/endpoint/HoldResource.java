/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ryerson.ca.holdbook.endpoint;

import java.io.StringWriter;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import ryerson.ca.holdbook.business.HoldBusiness;

import ryerson.ca.holdbook.helper.UserInfo;

/**
 * REST Web Service
 *
 * @author student
 */
@Path("hold")
public class HoldResource {
    
    @Context
    private UriInfo context;
    
    /**
     * Creates a new instance of SearchResource
     */
    public HoldResource() {
        System.out.println("Did we make it this far");
    }

    /**
     * Retrieves representation of an instance of
     * ryerson.ca.searchbook.endpoint.SearchResource
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("isOnHold/username={username}&password={password}&Buy_sell={Buy_sell}")
    public String getXml(@PathParam("username") String username,@PathParam("password") String password,@PathParam("Buy_sell") String Buy_sell) {
        System.out.println("Add uer API");
        HoldBusiness hold = new HoldBusiness();
         boolean bs=hold.hold(username, password, Buy_sell);
          if(bs)
              return("Inserted");
          else
              return("Not"); 
          
    }
        //BookHold book = hold.getBooks(isbn);
//        if (book == null) {
//            return("");
//        }
//        System.out.println("Helloooooooooookjhkjh");
//        JAXBContext jaxbContext;
//        try {
//            jaxbContext = JAXBContext.newInstance(UserInfo.class);
//
//            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
//
//            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
//            StringWriter sw = new StringWriter();
//            //jaxbMarshaller.marshal(book, sw);
//
//            return (sw.toString());
//
//        } catch (JAXBException ex) {
//            Logger.getLogger(HoldResource.class.getName()).log(Level.SEVERE, null, ex);
//            return ("error happened");
//        }
//    }

    @POST
    @Produces(MediaType.TEXT_HTML)
    @Path("update")
    public String  updateUserInfo(@FormParam("username") String username, @FormParam("password") String password, @FormParam("Buy_sell") String Buy_sell) 
    {
        System.out.println(username + "wewe herher");
        System.out.println("This is PSW: " + password); 
        HoldBusiness hold = new HoldBusiness();
          boolean bs=hold.hold(username, password, Buy_sell);
          if(bs)
              return("Inserted");
          else
              return("Not inserted");
          
    }
}
