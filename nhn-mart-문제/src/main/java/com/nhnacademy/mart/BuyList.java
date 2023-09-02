package com.nhnacademy.mart;

import java.util.ArrayList;

public class BuyList {

    private final ArrayList<Item> items = new ArrayList<>();

    public ArrayList<Item> getItems() {
        return items;
    }


    public void add(String[] buyItems) {
        String name = "";
        int amount = 0;
        boolean isFinish = true;
        for (int i = 0; i < buyItems.length - 1 && buyItems.length%2==0; i += 2) {
            name = buyItems[i];
            if (!isNumber(buyItems[i+1])) throw new IllegalArgumentException("수량에는 숫자를 입력 하셔하 합니다.");
            amount = Integer.valueOf(buyItems[i + 1]);
            Item item = new Item(name, amount);
            items.add(item);
            isFinish = false;
        }

        if(isFinish) throw new IllegalArgumentException("입력이 잘못되었습니다.");
    }



    private boolean isNumber(String buyItem) {
        try {
            Integer.parseInt(buyItem);
            return true;
        } catch (NumberFormatException e) {
            return false;
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
