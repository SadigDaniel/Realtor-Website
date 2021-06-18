/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ryerson.ca.business;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.io.StringWriter;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import org.apache.commons.io.IOUtils;
import ryerson.ca.helper.Property;
import ryerson.ca.helper.PropertyXML;

/**
 *
 * @author student
 */
public class Business {

    public static boolean isAuthenticated(String username, String passwrod) {
        return true;
    }

    public static PropertyXML getServices(String query, String token) throws IOException {

        Client searchclient = ClientBuilder.newClient();
        WebTarget searchwebTarget
                = searchclient.target("http://localhost:8080/SearchBooks/webresources/search");
        InputStream is
                = searchwebTarget.path(query).request(MediaType.APPLICATION_XML).get(InputStream.class);
        String xml = IOUtils.toString(is, "utf-8");
       PropertyXML books = bookxmltoObjects(xml);

        return (books);

    }
    
    
     public static void updateUsers(String username, String password, String Buy_sell, String token) throws IOException {
         
            Client holdclient = ClientBuilder.newClient();
            System.out.println("Buisness hhhh: " + username + ": " + password + " : " + Buy_sell); 
             WebTarget holdwebTarget
                      = holdclient.target("http://localhost:8080/AddUser/webresources/hold/isOnHold");
                     
           try{
                 WebTarget temp
                       = holdwebTarget.path("username="+username+"&password="+password +"&Buy_sell="+Buy_sell);
                       //temp.request();
                      
                 System.out.println("new error");
                 InputStream stream = temp.request().get(InputStream.class);
                 System.out.println("hellll");
                 String xml = IOUtils.toString(stream, "utf-8");

             }
            catch(Exception e){
                 System.out.println("Buisnsess layer error");
                      System.out.println(e);
                  }
        }
     

    private static PropertyXML bookxmltoObjects(String xml) {
        JAXBContext jaxbContext;
        try {
            jaxbContext = JAXBContext.newInstance(PropertyXML.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            PropertyXML books = (PropertyXML) jaxbUnmarshaller.unmarshal(new StringReader(xml));
            return books;

        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static Property bookholdxmltoObjects(String xml) {
        if(xml.isEmpty())
            return null;
        JAXBContext jaxbContext;
        try {
            jaxbContext = JAXBContext.newInstance(Property.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            Property book = (Property) jaxbUnmarshaller.unmarshal(new StringReader(xml));
            return book;

        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }

}
