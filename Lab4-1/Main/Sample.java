package Main;

public class Sample {
    public static int sigma(int init, int end, int step){
        return clacul(new Adder(),init,end,step,0);
    }
    public static int pi(int init, int end, int step){
        return clacul((i,j) -> i*j,init,end,step,1);
    }
    public static int clacul(BinaryOp binaryOp, int init, int end, int step, int start){
        int result = start;
        for (int i = init; i <= end; i +=step){
            result = binaryOp.apply(result, i);
        }
        return result;
    }
    public static int clacul(Multiple binder, int init, int end, int step, int start){
        int result = start;
        for (int i = init; i <= end; i +=step){
            result = binder.apply(result, i);
        }
        return result;
    }
}
