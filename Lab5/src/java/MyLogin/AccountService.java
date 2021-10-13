/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyLogin;

 
import javax.servlet.http.HttpSession;
import models.User;

/**
 *
 * @author seanz
 */
public class AccountService {
    // validate user and password
    // login successful, return a user object, password set as null
    // else return null
    public User login(String username, String password){
         
        if((username == "abe" || username == "barb") && password == "password") {
            return new User(username, null);
        } else {
            return null;
        }
  
    }  

}
