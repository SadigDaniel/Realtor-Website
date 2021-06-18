/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ryerson.ca.searchbook.helper;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author student
 */
@XmlRootElement(name = "prop")
@XmlAccessorType(XmlAccessType.FIELD)
public class Property {
    
    private String address; 
    private String Buy_Lease;
    private String Dateofprop;


    public Property(){
        
    }
    public Property(String address, String Buy_Lease, String Dateofprop) {
        this.address = address;
        this.Buy_Lease = Buy_Lease;
        this.Dateofprop = Dateofprop;
       
    }

    public String getIsbn() {
        return address;
    }

    public String getTitle() {
        return Buy_Lease;
    }

    public String getBarcode() {
        return Dateofprop;
    }

//     
    /*@Override
    public int hashCode() {
        return (Objects.hash(address));
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Property other = (Property) obj;
        if (address.equals(other.address))
            return true;
        else return (false);
        
    }*/
    
}
