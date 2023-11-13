package ch06.exam03;

public class SharedCount {
    static int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public static synchronized void increment() {
        count++;
    }
}