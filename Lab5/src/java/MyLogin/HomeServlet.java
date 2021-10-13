package MyLogin;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class HomeServlet extends HttpServlet {

          @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // shows welcome message home.jsp to the user including their username
        // shows logout hyperlink
        
        HttpSession session = request.getSession();
     
        String logout = (String) request.getAttribute("logout");
        
        if(logout == "" || session.getAttribute("user_name") == null) {
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request,response);

            return;  
        } else if (logout == null || session.getAttribute("user_name") != null) {
            getServletContext().getRequestDispatcher("/WEB-INF/home.jsp").forward(request,response);
        }
        
        return;
    }
   
          @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
    }

     
}
