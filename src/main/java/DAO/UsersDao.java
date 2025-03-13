package DAO;

import Model.User;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsersDao extends connexion{

    protected static final String INSERT_USERS = "insert into users(nom,prenom,email,password,role) values (?,?,?,?,?);";

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



}
