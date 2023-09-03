package com.nhnacademy.mart;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FoodStandTest {
    @Test
    @DisplayName("FoodStand add Test")
    void AddTest(){
        FoodStand test = new FoodStand();
        test.add(new Food("사과", 2000));
        Assertions.assertEquals(true, test.isExist("사과"));
    }
    @Test
    @DisplayName("FoodStand add 실패 Test")
    void AddTest실패(){
        FoodStand test = new FoodStand();
        test.add(new Food("사과", 2000));
        Assertions.assertThrows(FoodNotFoundException.class, () -> test.isExist("귤"));
    }
    @Test
    @DisplayName("research test")
    void ReaserchTest(){
        FoodStand test = new FoodStand();
        test.add(new Food("사과", 2000));
        Assertions.assertEquals(0, test.research("사과"));
    }
    @Test
    @DisplayName("research test errer")
    void ReaserchTestErrer(){
        FoodStand test = new FoodStand();
        test.add(new Food("사과", 2000));
        Assertions.assertThrows(FoodNotFoundException.class, () -> test.research("귤"));
    }
}