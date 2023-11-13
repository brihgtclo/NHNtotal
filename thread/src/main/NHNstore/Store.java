package NHNstore;

import java.util.ArrayList;

public class Store {
    int max = 10;
    ArrayList<String> item = new ArrayList<>();
    String[] itemNames = {"김치", "감자", "라면", "겨란"};
    private int insideCount;

    public Store() {}

    public synchronized void enter() throws InterruptedException {
        while (insideCount == 5) {
            wait();
        }
        insideCount++;
    }

    public synchronized void exit() {
        insideCount--;
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
        while (item.size() == 10){
            try {
                wait();
                System.out.println(Thread.currentThread().getName() + "  : " + itemName + "대기중");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        item.add(itemName);
        System.out.println(Thread.currentThread().getName() + "  : " + itemName + "완료");
        notifyAll();
    }

    public int getItemNumber(){
        return itemNames.length;
    }
}