/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ryerson.ca.searchbook.business;

import ryerson.ca.searchbook.helper.PropertyXML;
import static java.lang.System.in;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import ryerson.ca.searchbook.helper.Property;
import ryerson.ca.searchbook.persistence.Property_CRUD;

/**
 *
 * @author student
 */
public class SearchBusiness {
    
    public  PropertyXML getPropertyByQuery(String query){
       ArrayList <Property> properties = Property_CRUD.searchForProperty(query);
       PropertyXML its = new PropertyXML();
       its.setBook(properties);

           System.out.println("&&&&&&&&&&&&&&&&&&&&&&"+ properties.size());

        return (its);
    
    
      
}
}
