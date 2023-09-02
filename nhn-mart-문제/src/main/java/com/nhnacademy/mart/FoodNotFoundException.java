package com.nhnacademy.mart;

public class FoodNotFoundException extends RuntimeException {
    private static final String MESSAGE = "찾을 수 없는 상품입니다. 이름: ";

    public FoodNotFoundException(String foodName) {
        super(MESSAGE + foodName);
    }
}
