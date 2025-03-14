package Controler;

import DAO.EntraineurDao;
import DAO.MemberDao;
import Model.Entraineur;
import Model.Member;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet({"/Entraineur",
        "/EntraineurAdd"})
public class EntrainerServlet extends HttpServlet {
    EntraineurDao entraineurDao = null;
    @Override
    public void init() {
        entraineurDao = new EntraineurDao();
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       doGet(req, resp);
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getServletPath();
        switch (action) {
            case "/EntraineurAdd":
                insertEntraineur(req, resp);
                break;

        }
    }

    public  void insertEntraineur(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String specailite = req.getParameter("specailite");

        Entraineur entraineur = new Entraineur(specailite);
        entraineurDao.insertEntraineur(entraineur);



    }


}
