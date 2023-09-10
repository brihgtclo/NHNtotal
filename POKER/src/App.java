import dt.Date;
import dt.DaysInWeek;

public class App {
    public static void main(String[] args) throws Exception {
        Date d = new Date(1998,1,1,DaysInWeek.THU);
        System.out.println(d);
    }
}
