package practice.Geometry;

import java.util.ArrayList;
import java.util.List;

public class Box{
    List<Square> boxList = new ArrayList<>();
    
    public Box(double length){
        for (int i = 0; i < 6; i++) {
            boxList.add(new Square(length));
        }
    }

    @Override
    public String toString() {
        return "Box [boxList=" + boxList + "]";
    }
}
