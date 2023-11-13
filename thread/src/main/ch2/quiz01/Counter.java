package ch2.quiz01;

public class Counter {
    String name;
    int count;

    public Counter(String name) {
        this.name = name;
    }

    public Counter(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public void run(){
        for (int i = 1; i <= count; i++) {
            System.out.println(name + " : " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
