package com.company;

public class NonVeganFood extends FoodDecorator {
    public NonVeganFood(Food newFood) {
        super(newFood);
    }

    @Override
    public String prepareFood() {
        return super.prepareFood() + " With meat";
    }

    @Override
    public double foodPrice() {
        return super.foodPrice() + 200.0;
    }
}
