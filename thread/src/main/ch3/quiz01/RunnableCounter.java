package ch3.quiz01;

public class RunnableCounter implements Runnable{
    String name;
    int maxCount;
    static int MAX = 10;

    public RunnableCounter(String name, int maxCount) {
        this.name = name;
        this.maxCount = maxCount;
    }

    @Override
    public void run() {
        for (int i = 1; i <= maxCount; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(name + " : " + i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(name + " : 종료");
    }
}
