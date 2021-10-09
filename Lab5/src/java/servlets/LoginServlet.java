
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author seanz
 */
public class LoginServlet extends HttpServlet {
    
         @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // displays login form
        // responsible for logging out the user
            // invalidate the session
            // display a message "successfully logged out"
        
    }
   
          @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // validates that username and password not empty
        // pass the username and password parameters to login() - AccountService
        
    }
    
}
