package Controler;

import DAO.UsersDao;
import Model.User;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(urlPatterns = {
        "/insertuser",
        "/home"
})
public class UserServelet extends HttpServlet {
    UsersDao usersDao = null;
    public void init() {
        usersDao = new UsersDao();
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String action = req.getServletPath();
        try {
            switch (action) {
                case "/insertuser":
                    InsertUser(req, resp);
                    break;
                case "/home":
                    Home(req,resp);
                        break;
                case "/login":

            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void InsertUser(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException
    {
        String nom = req.getParameter("nom");
        String prenom = req.getParameter("prenom");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String role = req.getParameter("role");
        User user = new User(nom, prenom, email, password, role);
        usersDao.regester(user);

        resp.sendRedirect("login.jsp");


    }
    public void Home(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException {
        RequestDispatcher rd = req.getRequestDispatcher("signUp.jsp");
        rd.forward(req, resp);
    }




}



