package Controler;

import DAO.UsersDao;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String email = req.getParameter("email");
        String password = req.getParameter("password");

        String role = UsersDao.login(email,password);

        if (role != null) {
            HttpSession session = req.getSession();
            session.setAttribute("user", role);
            switch (role) {
                case "member":
                    RequestDispatcher rd = req.getRequestDispatcher("member.jsp");
                    rd.forward(req, resp);
                    break;
                case "entraineur":
                    RequestDispatcher rq = req.getRequestDispatcher("entraineur.jsp");
                    rq.forward(req, resp);
                    break;
                default:
                    resp.sendRedirect("login.jsp?error=unauthorized");
                    break;
            }
        } else {
            resp.sendRedirect("login.jsp?error=invalid");
        }

    }
}
