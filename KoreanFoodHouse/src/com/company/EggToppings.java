package com.company;

public class EggToppings extends ToppingDecorator {
    public EggToppings(Bibimbab toppindBibimbab) {
        super(toppindBibimbab);
    }


    @Override
    public double getPrice() {
        return this.toppingBibimbab.getPrice() + 0.10;
    }
}
