package ch05.quiz01;

public class RunnableCounter implements Runnable{
    String name;
    int maxCount;
    static int MAX = 10;
    private volatile boolean running = true;
    public RunnableCounter(String name, int maxCount) {
        this.name = name;
        this.maxCount = maxCount;
    }

    @Override
    public void run() {
        for (int i = 1; i <= maxCount && running; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(name + " : " + i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(name + " : 종료");
    }

    public void terminate() {
        running = false;
    }
}