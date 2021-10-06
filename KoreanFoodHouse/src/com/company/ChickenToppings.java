package com.company;

public class ChickenToppings extends ToppingDecorator {
    public ChickenToppings (Bibimbab toppindBibimbab) {
        super(toppindBibimbab);
    }

    @Override
    public double getPrice() {
        return this.toppingBibimbab.getPrice() + 30.5;
    }
}
