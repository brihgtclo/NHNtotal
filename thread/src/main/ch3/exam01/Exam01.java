package ch3.exam01;

import ch3.quiz01.RunnableCounter;

public class Exam01 {
    public static void main(String[] args) {
        RunnableCounter counter1 = new RunnableCounter("counter1", 50);
        RunnableCounter counter2 = new RunnableCounter("counter2", 50);
        RunnableCounter counter3 = new RunnableCounter("counter3", 50);
        Thread thread = new Thread(counter2);

        thread.start();
    }
}