package NHNstore;

import java.util.concurrent.ThreadLocalRandom;

public class Consumer implements Runnable {
    Store store;
    String wantItem;

    public Consumer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000));
                setRandomWantItem();
                store.enter();
                store.buy(wantItem);
                store.exit();
                Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000));
            } catch (InterruptedException e) {
            }
        }
    }

    public void setRandomWantItem() {
        wantItem = store.itemNames[ThreadLocalRandom.current().nextInt(0, store.getItemNumber())];
    }
}