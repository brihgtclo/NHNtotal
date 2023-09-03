package com.nhnacademy.mart;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CustomerTest {


    @Test
    void testPickFoods() {
        BuyList buyList = new BuyList();
        FoodStand foodStand = new FoodStand();
        Customer customer = new Customer(new BuyList());
        NhnMart nhnMart = new NhnMart();

        buyList.add(new String[]{"apple", "2"});

        customer.bring(nhnMart.provideBasket());
        customer.pickFoods(foodStand);
    }

    @Test
    void testPayTox() {
        Counter counter = new Counter();
        Customer customer = new Customer(new BuyList());
        customer.bring(new Basket());
        customer.payTox(counter);
        assertEquals(20000, customer.getMoney());
    }


}