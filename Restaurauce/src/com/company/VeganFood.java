package com.company;

public class VeganFood implements Food {
    @Override
    public String prepareFood() {
        return "It is the Vegan Food";
    }

    @Override
    public double foodPrice() {
        return 100.0;
    }
}
