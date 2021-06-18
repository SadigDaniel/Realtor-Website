/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ryerson.ca.holdbook.helper;

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
 @XmlRootElement(name = "book")
 @XmlAccessorType(XmlAccessType.FIELD)
public class UserInfo {
    
    private String username; 
    private String password;
    private String Buy_sell;

    public UserInfo(String username, String Buy_sell, String password) {
        
        this.username = username;
        this.password = password;
        this.Buy_sell = Buy_sell;
        System.out.println(this.username);
    }
  
    public UserInfo() {
        this.username = "";
        this.password = "";
        this.Buy_sell = "";
    }
  




   
    
}
