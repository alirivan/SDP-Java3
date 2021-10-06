package com.company;

public class Mocha extends CondimentDecorator {
    private final Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.25 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
