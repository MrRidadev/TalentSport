package Model;

public class Member extends User{
    private int id;
    private String date;
    private String sport;


    public Member() {}

    public Member(int id, String date, String sport) {
        this.id = id;
        this.date = date;
        this.sport = sport;

    }

    public Member(String date, String sport) {
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
        return "Member{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", sport='" + sport + '\'' +
                '}';
    }
}
