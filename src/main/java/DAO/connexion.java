package DAO;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connexion {

    private final String dbURI = "jdbc:mysql://localhost:3306/TalentSport?useSSL=false";
    private final String dbUsername = "root";
    private final String dbPassword = "0000";

    public connexion() {}

    public Connection getConnection () {
        Connection con = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(dbURI, dbUsername, dbPassword);
            System.out.println("database connected");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return con;
    }

}

