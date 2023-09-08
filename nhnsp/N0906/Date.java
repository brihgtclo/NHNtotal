package N0906;

public class Date {
    private int year;
    private int month;
    private  int day;

    private Date(){
        this(1970,01,01);
    }
    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return  ""+year + month +day;
    }
}
