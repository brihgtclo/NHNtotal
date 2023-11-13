package NHNstore;

import java.util.ArrayList;

public class Store {
    int max = 10;
    ArrayList<String> item = new ArrayList<>();
    String[] itemNames = {"종갓집김치", "하지감자", "농심 신라면"};
    private int insideCount;
    int count = 0;


    public Store() {
    }

    public synchronized void enter() throws InterruptedException {
        while (insideCount == 5) {
            wait();
        }
        System.out.println(Thread.currentThread().getName() + "  입장!!");
        insideCount++;
    }

    public synchronized void exit() {
        insideCount--;
        System.out.println(Thread.currentThread().getName() + "  퇴장!!");
        notifyAll();
    }

    public synchronized void buy(String itemName) {
        while (!item.contains(itemName)) {
            try {
                wait();
                System.out.println(Thread.currentThread().getName() + "  : " + itemName + "대기중");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        item.remove(itemName);
        System.out.println(Thread.currentThread().getName() + "  : " + itemName + "구매");
        notifyAll();
    }

    public synchronized void sell(String itemName) {
        while (item.size() == 10) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        item.add(itemName);
        System.out.println(Thread.currentThread().getName() + "  : " + itemName + "완료");
        notifyAll();
    }

    public int getItemNumber() {
        return itemNames.length;
    }
}