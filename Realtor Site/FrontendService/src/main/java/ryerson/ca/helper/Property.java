/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ryerson.ca.helper;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

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


    
}
