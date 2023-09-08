package N0906;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
       Departmant<Person> departmant = new Departmant<>(1,"Computer Eng");
       departmant.add(new Student(21, "정병훈"));
       departmant.add(new Student(26, "무느알"));
       departmant.add(new Student(24, "영욱"));
       departmant.add(new Student(28, "에미넴"));
       departmant.add(new Professor(50, "난 교수다"));

       departmant.sort();
       printStudent(departmant);
    }

    public static void printStudent(Departmant<Person> departmant){
        for (Person s: departmant) {
            System.out.println(s);
        }
    }
}
