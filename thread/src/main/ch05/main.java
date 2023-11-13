package ch05;

import ch05.quiz01.RunnableCounter;
import ch05.quiz02.ThreadUnlimitedCounter;

public class main {
    public static void main(String[] args) throws InterruptedException {
        ThreadUnlimitedCounter thread = new ThreadUnlimitedCounter("카운터");
        thread.start();

        Thread.sleep(5000);
        thread.interrupt();
    }
}
