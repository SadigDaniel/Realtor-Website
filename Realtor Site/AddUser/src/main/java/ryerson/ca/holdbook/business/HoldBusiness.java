/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ryerson.ca.holdbook.business;



import ryerson.ca.holdbook.helper.UserInfo;
import ryerson.ca.holdbook.persistence.USERS_CRUD;

/**
 *
 * @author student
 */
public class HoldBusiness {

   



//    public UserInfo getBooks(String Username) {
//        UserInfo bs = USERS_CRUD.getHoldBook(Username);
//
//        return (bs);
//    }

public boolean hold(String Username, String Password, String Buy_sell) {
       
        return (USERS_CRUD.addUsers(Username, Password, Buy_sell));
    }

    
}
