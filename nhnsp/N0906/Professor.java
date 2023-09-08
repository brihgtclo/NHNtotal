package N0906;

public class Professor extends Person {
    private int age;
    private final String name;
    private final int professorNo;

    public Professor(int age, String name) {
        this.professorNo = CreatNum.creat();
        this.age = age;
        this.name = name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public int getNum() {
        return this.professorNo;
    }

    @Override
    public String getName() {
        return this.name;
    }


    @Override
    public int compareTo(Person o) {
        return o.getNum()-this.professorNo;
    }

    @Override
    public String toString() {
        return professorNo +",  "+  age +",  "+ name;
    }
}
