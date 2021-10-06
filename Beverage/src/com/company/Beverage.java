package com.company;

public abstract class Beverage {
    protected String description = "Some Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
