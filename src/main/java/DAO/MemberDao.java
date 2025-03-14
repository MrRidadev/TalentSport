package DAO;

import Model.Member;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class MemberDao extends connexion{
    public MemberDao() {}

    protected static final String SELECT_MEMBER = "SELECT * FROM Member";
    protected static final String INSERT_MEMBER = "INSERT INTO Members (date,sport) VALUES(?,?)";

    public static void insertMember(Member member) {
        try (Connection con = getConnection();
            PreparedStatement stm = con.prepareStatement(INSERT_MEMBER))
        {
            stm.setString(1,member.getDate());
            stm.setString(2,member.getSport());
            stm.executeUpdate();

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
