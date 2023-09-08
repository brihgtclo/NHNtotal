package N0906;

public class Student extends Person {
    private final int age;
    private final String name;
    private int studentNo;


    public Student(int age, String name) {
        this.studentNo = CreatNum.creat();
        this.age = age;
        this.name = name;
    }


    @Override
    public String toString() {
        return this.studentNo + ",  " + this.age + ",  " + this.name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public int getNum() {
        return this.studentNo;
    }

    @Override
    public String getName() {
        return this.name;
    }


    private int getStudentNo() {
        return this.studentNo;
    }

    @Override
    public int compareTo(Person o) {
        return o.getNum()-this.studentNo;
    }
}
