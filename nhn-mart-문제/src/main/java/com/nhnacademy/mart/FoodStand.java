package com.nhnacademy.mart;

import java.util.ArrayList;

public class FoodStand {

    private final ArrayList<Food> foods = new ArrayList<>();

    public void add(Food food) {
        foods.add(food);
    }

    public ArrayList<Food> getFoods() {
        return foods;
    }

    public boolean isExist(String name) {
        for (Food food : foods) {
            if(food.getName().equals(name))
                return true;
        }
        throw new IllegalArgumentException(name+"이 식품 매대에 없는 상품입니다");
    }

    public void delete(String name) {
        foods.remove(research(name));
    }
    public int research(String name){
        int index = 0;
        for (Food food: foods){
            if(food.getName().equals(name))
                return index;
            index++;
        }
        throw new IllegalArgumentException(name+" 찾을 수 없습니다");
    }

    public Food getFoods(String name) {
        for(Food food: foods){
            if(food.getName().equals(name))
                return food;
        }
        throw new IllegalArgumentException(name+"재고가 부족합니다");
    }


}
