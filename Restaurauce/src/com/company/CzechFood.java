package com.company;

public class CzechFood extends FoodDecorator {
    public CzechFood(Food newFood) {
        super(newFood);
    }

    @Override
    public String prepareFood() {
        return super.prepareFood() + " Rýže";
    }

    @Override
    public double foodPrice() {
        return super.foodPrice() + 130.0;
    }
}
