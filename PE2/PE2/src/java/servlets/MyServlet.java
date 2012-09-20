package servlets;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @authors Anders Al-saffar, René Andreasen, Farukh Akhtar.
 */
@WebServlet(name = "MyServlet", urlPatterns = {"/MyServlet"})
public class MyServlet extends HttpServlet {

    public static String LoginName;
    public static String LoginPassword;
    public UserInfo users = new UserInfo();
    public PrintWriter out;

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        out = response.getWriter();

        LoginName = request.getParameter("LoginName");
        LoginPassword = request.getParameter("LoginPassword");


        if (users.userExists(LoginName, LoginPassword)) {
            
           

            response.sendRedirect("MainPage.jsp");
        } else {


            out.println("user: " + LoginName + " Code: " + LoginPassword
                    + " does NOT exist");

            response.sendRedirect("LoginPage.jsp");
        }


    }

    public static String loginInfo() {


        return "Velkommen til vores side " + LoginName;
    }
}
