package com.company;

public class ChineseFood extends FoodDecorator {
    public ChineseFood(Food newFood) {
        super(newFood);
    }

    @Override
    public String prepareFood() {
        return super.prepareFood() + " 面条和葡萄酒";
    }

    @Override
    public double foodPrice() {
        return super.foodPrice() + 300.0;
    }
}
