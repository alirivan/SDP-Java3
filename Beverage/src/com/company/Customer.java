package com.company;

public class Customer {
    public static void main(String[] args) {
        Beverage beverage = new Mocha(new Mocha(new Whip(new HouseBlend())));
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());

        Beverage beverage1 = new Latte(new Latte(new Whip(new HouseBlend())));
        System.out.println(beverage1.getDescription());
        System.out.println(beverage1.cost());
    }
}
