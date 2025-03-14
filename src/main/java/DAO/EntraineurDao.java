package DAO;

import Model.Entraineur;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class EntraineurDao extends connexion{
    protected static final String INSERT_ENTRAINEUR = "insert into entraineurs(specailite) values (?);";

    public EntraineurDao() {}

    public void insertEntraineur(Entraineur entraineur) {
        try(
                Connection con = getConnection();
                PreparedStatement stm = con.prepareStatement(INSERT_ENTRAINEUR)
        )
        {
            stm.setString(1, entraineur.getSpicailite());
            stm.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
