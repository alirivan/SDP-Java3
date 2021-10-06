package com.company;

public class KimchiToppings extends ToppingDecorator {
    public KimchiToppings(Bibimbab toppindBibimbab) {
        super(toppindBibimbab);
    }

    @Override
    public double getPrice() {
        return this.toppingBibimbab.getPrice() + 0.80;
    }
}
