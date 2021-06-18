/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ryerson.ca.holdbook.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Set;
import ryerson.ca.holdbook.helper.UserInfo;

/**
 *
 * @author student
 */
public class USERS_CRUD {
    private static Connection getCon(){
    Connection con=null;
     try{
         
         Class.forName("com.mysql.cj.jdbc.Driver");
        //con=DriverManager.getConnection("jdbc:mysql://db:3306/hold_LBS?allowPublicKeyRetrieval=true&useSSL=false", "root", "student");
       
       con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Users?e=true&characterEncoding=UTF-8&zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=GMT", "root", "student");
        System.out.println("Connection established.");
     }
     catch(Exception e){ System.out.println(e);}
     return con;
    }
    
    
    
    public static boolean addUsers(String username, String password, String Buy_sell){
        System.out.println(username);
        try{
            Connection con= getCon();
//           DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
          //   LocalDate date = LocalDate.now();
            String q = "insert into Users "
                    + "(Username, Password, Seller_buyer) values "
                    + "('"+username+"', "
                    +"'"+password+"', "
                    +"'"+Buy_sell+"');";
            Statement stmt = con.createStatement();   
            System.out.println(q);
            stmt.execute(q);
			con.close();
                        return true;

		}catch(Exception e){System.out.println(e);
                return false;
                }
 
        
    }
//    public static UserInfo getHoldBook(String Username){
//        UserInfo book=null;
//        try{
//            Connection con= getCon();
//            
//            String q = "select * from Users "
//                    + " WHERE "
//                    
//                    + "username = '"+Username+"';";
//            System.out.println(q);
//
//			PreparedStatement ps=con.prepareStatement(q);
//			ResultSet rs=ps.executeQuery();
//			if(rs.next()){
//
//				
//				
//                                String password=rs.getDate("password").toString();
//                                String Buy_sell=rs.getString("Buy_sell").toString();
//                                
//                                 book = new UserInfo(Username,password,Buy_sell);
//                                
//                                
//                                }
//			
//			con.close();
//
//		}catch(Exception e){System.out.println(e);}
//            
//    
//        return book;
//        
//    }

    public static boolean addUser(String Username, String Passwod, String Buy_sell) {
      return( addUsers(Username, Passwod, Buy_sell));
    }
}
