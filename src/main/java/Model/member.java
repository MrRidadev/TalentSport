package Model;

public class member extends user{
    private int id;
    private String date;
    private String sport;


    public member() {}

    public member(int id, String date, String sport) {
        this.id = id;
        this.date = date;
        this.sport = sport;

    }

    public member( String date, String sport) {
        this.date = date;
        this.sport = sport;

    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getSport() {
        return sport;
    }
    public void setSport(String sport) {
        this.sport = sport;
    }

    @Override
    public String toString() {
        return "member{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", sport='" + sport + '\'' +
                '}';
    }
}
