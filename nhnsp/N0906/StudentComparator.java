package N0906;

import java.util.Comparator;

public class StudentComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getNum() - o2.getNum();
    }
}
