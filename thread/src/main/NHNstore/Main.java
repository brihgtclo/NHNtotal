package NHNstore;

public class Main {
    public static void main(String[] args) {
        Store store = new Store(); // 매장 생성

        Producer producer = new Producer(store); // 생산자 생성
        Thread producerThread = new Thread(producer , "생산자"); // 생산자 스레드
        producerThread.start(); // 생산자 스레드 시작

        // 소비자 스레드 생성 및 시작
        for (int i = 1; i <= 10; i++) {
            Consumer consumer = new Consumer(store);
            Thread consumerThread = new Thread(consumer, "소비자" + i);
            consumerThread.start();
        }
    }
}
