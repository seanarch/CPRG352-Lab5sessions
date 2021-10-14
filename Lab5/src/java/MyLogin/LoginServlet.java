
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
        
        HttpSession session = request.getSession();
        String logout = request.getParameter("logout");
        
        if (session.getAttribute("User") == null) {
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
            return;
        }
        
        if (logout == null) {
            response.sendRedirect("home");
            return;            
        } else {  
            request.setAttribute("logoutMsg", "You have successfully logged out");
            session.invalidate();
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
            return;            
        }



    }
   
          @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession(); 
        
        String input_username = request.getParameter("user_name");
        String input_password = request.getParameter("pass_word");
        
        User newUser = new User(input_username, input_password); 
        AccountService loginCheck = new AccountService(); 
        
        if(input_username != "" && input_password != "") {
            if(loginCheck.login(input_username, input_password) != null) {
                session.setAttribute("User", newUser);
                response.sendRedirect("login");
                return;
            } else {
                request.setAttribute("errorMsg", "Please check your username and password.");
                request.setAttribute("user_name", input_username);
                request.setAttribute("user_password", input_password);
                getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
                return;
            }
        } else {
            request.setAttribute("errorMsg", "Invalid username or password.");
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
            return;            
        }
    }

}
    

