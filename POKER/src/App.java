import javax.xml.crypto.Data;

import com.nhnacademy.java.poker.Date;
import com.nhnacademy.java.poker.DaysInWeek;

public class App {
    public static void main(String[] args) throws Exception {
        Date d = new Date(1998,1,1,DaysInWeek.THU);
        System.out.println(d);
    }
}
