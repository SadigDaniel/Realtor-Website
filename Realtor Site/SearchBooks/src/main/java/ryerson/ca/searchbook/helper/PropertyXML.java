/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ryerson.ca.searchbook.helper;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import ryerson.ca.searchbook.helper.Property;

 @XmlRootElement(name = "properties")
@XmlAccessorType (XmlAccessType.FIELD)
       public class PropertyXML{
     @XmlElement(name="prop")
           private ArrayList<Property> properties;
           
           
           public List<Property>getBooks(){
               return properties;
               
           }
          public  PropertyXML(){
               
               
           }
           public void setBook(ArrayList<Property> bs){
               properties=bs;
               
           }
           
       }