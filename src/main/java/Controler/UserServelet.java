package Controler;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(urlPatterns = {
        "/insertuser",
        "/home"
})
public class UserServelet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //String action= (String) req.getAttribute("path");
        String action = req.getServletPath();
        try {
            switch (action) {
                case "/insertuser":
                    InsertUser(req, resp);
                    break;
                case "/home":
                    Home(req,resp);
                        break;
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void InsertUser(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String nom = req.getParameter("nom");
        System.out.println(nom);


    }
    public void Home(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException {
        RequestDispatcher rd = req.getRequestDispatcher("signUp.jsp");
        rd.forward(req, resp);
    }
}
