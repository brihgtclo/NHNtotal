package Main;

interface BinaryOp{
    int apply(int i, int j);
}
public class Adder implements BinaryOp{
    public int apply(int result, int i) {
        return result+i;
    }
}
class Multiple implements BinaryOp{
    public int apply(int i, int j){
        return i*j;
    }
}
