package com.company;

public class KoreanFood extends FoodDecorator {
    public KoreanFood(Food newFood) {
        super(newFood);
    }

    @Override
    public String prepareFood() {
        return super.prepareFood() + " 밥과 김치";
    }

    @Override
    public double foodPrice() {
        return super.foodPrice() + 170.0;
    }
}
