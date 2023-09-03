package com.nhnacademy.mart;

public class Counter {



    public int pay(int total, int money) {
        if(total > money)
            throw new IllegalArgumentException("잔액이 부족합니다.");
        money -= total;
        System.out.println("총 가격은 " + total + "원 입니다.");
        System.out.println("고객님 결제 후 잔액 : " + (money));
        return  money;
    }
    public int totalPrice(Basket basket) {
       int total = 0;
        for (Food food : basket.getFoods()) {
            total += food.getPrice();
        }
        return total;
    }

}
