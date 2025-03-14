package Controler;

import DAO.MemberDao;
import Model.Member;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet({"/Member","/add"})
public class MemberServlet extends HttpServlet {
    MemberDao dao = null;

    @Override
    public void init()  {
        dao = new MemberDao();
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
                case "/add":
                    insertMember(req, resp);
                    break;
            }
        }catch(Exception e) {
            e.printStackTrace();
        }

    }

    public  void insertMember(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String date = req.getParameter("date");

        String sport = req.getParameter("sport");


        Member member = new Member(date,sport);
        MemberDao.insertMember(member);


    }


}
