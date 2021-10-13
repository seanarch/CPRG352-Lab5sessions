
package MyLogin;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;
import models.User;

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

        HttpSession session = request.getSession();
     
        String logout = request.getParameter("logout");
            
        if(logout == "" || session.getAttribute("user_name") == null) {
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request,response);
            return;  
        } else if (logout == null || session.getAttribute("user_name") != null) {
            getServletContext().getRequestDispatcher("/WEB-INF/home.jsp").forward(request,response);
        }

        return;
    }
            
 
         
 
        
    }
   
//          @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        // validates that username and password not empty
//        // pass the username and password parameters to login() - AccountService
//        
//    }
    

