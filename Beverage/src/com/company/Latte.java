package com.company;

public class Latte extends CondimentDecorator{
    private final Beverage beverage;

    public Latte(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.15 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Latte";
    }
}
