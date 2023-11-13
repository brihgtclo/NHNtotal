package NHNstore;

import java.util.concurrent.ThreadLocalRandom;

public class Producer implements Runnable {
    Store store;
    private String produceItem;

    public Producer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        try {
            while (true){
                while (store.item.size() < 10){
                    setRandomProduceItem();
                    store.sell(produceItem);
                }
                Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 10000));
            }
        }catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
    public void setRandomProduceItem(){
        produceItem = store.itemNames[ThreadLocalRandom.current().nextInt(0, store.getItemNumber())];
    }
}
