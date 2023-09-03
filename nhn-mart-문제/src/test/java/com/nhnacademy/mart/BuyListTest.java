package com.nhnacademy.mart;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BuyListTest {


    @Test
    @DisplayName("바이리스트 테스트")
    void testAddItems() {
        BuyList test = new BuyList();
        test.add(new String[]{"계란", "2", "파", "3"});

        ArrayList<BuyList.Item> items = test.getItems();
        assertEquals(2, items.size());
        assertEquals("계란", items.get(0).getName());
        assertEquals(2, items.get(0).getAmount());
        assertEquals("파", items.get(1).getName());
        assertEquals(3, items.get(1).getAmount());
    }

    @Test
    @DisplayName("바이리스트 add 잘못된 입력값 테스트")
    void testAddWithNonNumericAmount() {
        BuyList test = new BuyList();

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {test.add(new String[]{"계란", "다섯"});});

    }

    @Test
    @DisplayName("바이리스 수량 입력 하지 않음 테스트")
    void testAddWithInvalidInput() {
        BuyList test = new BuyList();

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {test.add(new String[]{"계란"});});
    }

}