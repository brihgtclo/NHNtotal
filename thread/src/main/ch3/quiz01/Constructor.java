package ch3.quiz01;

import ch2.quiz02.ThreadCounter;

public class Constructor {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new RunnableCounter("runnableCounter1", 10));
        Thread thread2 = new Thread(new RunnableCounter("runnableCounter2", 10));
        thread1.start();
        thread2.start();
        System.out.println("main 종료");
    }
}
