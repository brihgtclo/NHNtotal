package com.nhnacademy.mart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CounterTest {

    @Test
    @DisplayName("정상적인 결재")
    void payTest(){
        Counter counterTest = new Counter();
        Assertions.assertEquals(500,counterTest.pay(500,1000));
    }
    @Test
    @DisplayName("결재 금액을 초과 테스트")
    void payErrorTest(){
        Counter test = new Counter();
        Assertions.assertThrows(IllegalArgumentException.class, () -> test.pay(500,100));
    }

    @Test
    @DisplayName("총액이 정상 출력이 되는지")
    void totalTest(){
        Counter test = new Counter();
        Basket basket = new Basket();
        basket.add(new Food("테스트",500));
        Assertions.assertEquals(500,test.totalPrice(basket));
    }

}