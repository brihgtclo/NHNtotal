package ch2.quiz02;

public class ThreadCounter extends Thread{
    String name;
    int maxCount;
    public ThreadCounter(String name, int maxCount){
        this.name = name;
        this.maxCount = maxCount;
    }

    @Override
    public void run() {
        for (int i = 1; i <= maxCount; i++) {
            System.out.println(name + " : " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
