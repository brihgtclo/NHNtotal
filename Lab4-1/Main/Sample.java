package Main;

public class Sample {
    public static int add1toN(int n){
        if(n==0)
            return n;
        if(n == 1)
            return n;
        return n+add1toN(n-1);
    }

    public static void main(String[] args) {
        System.out.println(add1toN(10));
    }
}
