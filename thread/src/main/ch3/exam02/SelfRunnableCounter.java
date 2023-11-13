package ch3.exam02;

public class SelfRunnableCounter implements Runnable{
    int count;
    int maxCount;
    Thread thread;
    public SelfRunnableCounter(String name, int maxCount){
        this.maxCount = maxCount;
        this.count = 0;
        thread = new Thread(this, name);
    }

    public void start(){
        thread.start();
    }
    @Override
    public void run() {
        for (count = 1;  count <= maxCount ; count++) {
            try {
                Thread.sleep(1000);
                System.out.println(thread.getName() + " : " + count);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
