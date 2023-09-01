package com.nhnacademy.mart;

import java.util.ArrayList;

public class BuyList {

    public ArrayList<Item> getItems() {
        return items;
    }

    private final ArrayList<Item> items = new ArrayList<>();


    public void add(String buyItem){
        String[] arr = buyItem.split(" ");
        String name = "";
        int amount = 0;

        for (int i = 0; i < arr.length; i++) {
            if(i % 2 == 0)
                name = arr[i];
            else if(i%2 ==1) {
                amount = Integer.valueOf(arr[i]);
                Item item = new Item(name, amount);
                items.add(item);
            }
        }
    }



    public static class Item {
        private final String name;
        private final int amount;

        public Item(String name, int amount) {
            this.name = name;
            this.amount = amount;
        }

        public String getName() {
            return name;
        }

        public int getAmount() {
            return amount;
        }
    }
}
