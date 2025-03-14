package DAO;

import Model.User;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsersDao extends connexion{

    protected static final String INSERT_USERS = "insert into users(nom,prenom,email,password,role) values (?,?,?,?,?);";
    private static final String SELECT_USERS_BY_EMAIL_AND_PASSWORD =
            "SELECT role FROM users WHERE email = ? AND password = ?";
    public UsersDao() {}

    public void regester(User user){

        try (Connection con = getConnection();
             PreparedStatement stm = con.prepareStatement(INSERT_USERS);)
        {
            stm.setString(1, user.getName());
            stm.setString(2, user.getPrenom());
            stm.setString(3, user.getEmail());
            stm.setString(4, user.getPassword());
            stm.setString(5, user.getRole());
            stm.executeUpdate();
           } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static String login(String email, String password){

        try {
            Connection con = getConnection();
            PreparedStatement stm = con.prepareStatement(SELECT_USERS_BY_EMAIL_AND_PASSWORD);
            stm.setString(1, email);
            stm.setString(2, password);
            ResultSet rs = stm.executeQuery();
            if(rs.next()){
                return rs.getString(1);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }



}
