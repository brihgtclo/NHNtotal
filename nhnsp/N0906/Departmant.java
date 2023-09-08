package N0906;
import java.util.List;
import java.util.*;
public class Departmant<E extends Person> implements Iterable<E>{
    private int depatmentNo;
    private String departmentName;

    List<E> list = new ArrayList<E>();

    public Departmant(int depatmentNo, String departmentName) {
        this.depatmentNo = depatmentNo;
        this.departmentName = departmentName;
    }

    public List<E> getList() {
        return list;
    }

    public void sort(){
        Collections.sort(this.list);
    }
    public void sort(Comparator<E> compare) {
        Collections.sort(this.list, compare);
    }


    public Iterator<E> iterator(){
        return (Iterator<E>) this.list.iterator();
    }


    public void add(E b) {
        this.list.add(b);
    }
}
