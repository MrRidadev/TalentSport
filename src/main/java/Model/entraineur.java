package Model;

public class entraineur extends user{
    private int id_entraineur;
    private String spicailite;


    public entraineur(){}

    public entraineur(int id_entraineur, String spicailite) {
        this.id_entraineur = id_entraineur;
        this.spicailite = spicailite;
    }

    public entraineur(String spicailite) {
        this.spicailite = spicailite;
    }

    public int getId_entraineur() {
        return id_entraineur;
    }
    public void setId_entraineur(int id_entraineur) {
        this.id_entraineur = id_entraineur;
    }
    public String getSpicailite() {
        return spicailite;
    }
    public void setSpicailite(String spicailite) {
        this.spicailite = spicailite;
    }

    @Override
    public String toString() {
        return "entraineur{" +
                "id_entraineur=" + id_entraineur +
                ", spicailite='" + spicailite + '\'' +
                '}';
    }
}
