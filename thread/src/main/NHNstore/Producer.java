package NHNstore;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Producer implements Runnable {
    Store store;
    private String produceItem;

    public Producer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        int count = 0;
        while (true) {
            try {
                while (store.item.size() < 10) {
                    setRandomProduceItem();
                    store.sell(produceItem);
                    Thread.sleep(100);
                    count = 0;
                }
                count++;
                if(count > 7){
                    store.item.removeAll(store.item);
                }
                for(String s : store.item){
                    System.out.print(s + " ");
                }
                System.out.println();
                Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000));
            } catch (InterruptedException e) {
            }
        }
    }

    public void setRandomProduceItem() {
        produceItem = store.itemNames[ThreadLocalRandom.current().nextInt(0, store.getItemNumber())];
    }
}
