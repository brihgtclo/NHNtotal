package com.nhnacademy.mart;

public class Customer {

    // 고객 구매 목록
    private final BuyList buyList;

    // 고객 장바구니
    private Basket basket;
    
    private int money = 20_000;

    public Customer(BuyList buyList) {
        this.buyList = buyList;
    }

    // 장바구니 챙기기
    public void bring(Basket basket) {
        this.basket = basket;
    }

    public void pickFoods(FoodStand foodStand) {
        for(BuyList.Item item : buyList.getItems()){
            if(foodStand.isExist(item.getName()))
                pick(foodStand, item);
        }
    }

    private void pick(FoodStand foodStand, BuyList.Item item) {

            for (int i = 0; i < item.getAmount(); i++) {
                basket.add(foodStand.getFoods(item.getName()));
                foodStand.delete(item.getName());

        }
    }

    public void payTox(Counter counter) {
        int total = counter.totalPrice(basket);
        money = counter.pay(total, money);
    }

    public int getMoney() {
        return money;
    }

    // TODO payTox 메서드 구현



}
