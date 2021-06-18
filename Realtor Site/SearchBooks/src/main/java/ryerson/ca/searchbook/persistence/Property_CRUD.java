/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ryerson.ca.searchbook.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import ryerson.ca.searchbook.helper.Property;

/**
 *
 * @author student
 */
public class Property_CRUD {
    
    private static Connection getCon(){
    Connection con=null;
     try{
         Class.forName("com.mysql.jdbc.Driver");
         con=DriverManager.getConnection("jdbc:mysql://localhost:3306/search_LBS?e=true&characterEncoding=UTF-8&zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=GMT", "root", "student");
         System.out.println("Connection established.");
     }
     catch(Exception e){ System.out.println(e);}
     return con;
    }
    
    public static ArrayList<Property> searchForProperty(String query){
        ArrayList <Property> properties = new ArrayList<Property>();
        //Set<Book> properties= new HashSet<Book>();
        try{
            Connection con= getCon();
            String q = " ";
            if(query.equals("all")){
                 q = "select * from properties ;";
            }
            else{
                 q = "select * from properties "
                    + "WHERE Buy_Lease LIKE '%"+query+"%';";
            }
            
            System.out.println(q);
			PreparedStatement ps=con.prepareStatement(q);
			ResultSet rs=ps.executeQuery();
                         
			while(rs.next()){
				//been= new UserInfo();
				String address=rs.getString("address");
				String Buy_Lease=rs.getString("Buy_Lease");
                                String Dateofprop=rs.getString("Dateofprop");
                                //String firstname=rs.getString("firstName");
                                //String lastname=rs.getString("lastName");
                                //Author author= new Author("Daniel", "sadig");
                           
                                Property prop = new Property(address,Buy_Lease,Dateofprop);
                                properties.add(prop);
                              
                                }
			
			con.close();

		}catch(Exception e){System.out.println(e);}
            
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>"+properties.size());
        return properties;
        
    }
}
