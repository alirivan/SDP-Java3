package com.company;

public abstract class ToppingDecorator implements Bibimbab {
    Bibimbab toppingBibimbab;
    public ToppingDecorator(Bibimbab toppindBibimbab) {
        this.toppingBibimbab = toppindBibimbab;
    }
}
