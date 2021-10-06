package com.company;

public class Customer {
    public static void main(String[] args) {
        System.out.println("========== Menu of Bibimbab | 비빔밥 메뉴 ==========");
        System.out.println(" ");

        Bibimbab bibimbab = new ClassicalBibimbab();
        System.out.println("Classical Bibimbab 비빔밥 " + bibimbab.getPrice());
        System.out.println("------------------------------");

        bibimbab = new EggToppings(bibimbab);
        System.out.println("Bibimbab with Egg 계란 있는 비빔밥" + bibimbab.getPrice());
        System.out.println("------------------------------");

        bibimbab = new ChickenToppings(bibimbab);
        System.out.println("Bibimbab with Chicken 치켄 있는 비빔밥 " + bibimbab.getPrice());
        System.out.println("------------------------------");

        bibimbab = new KimchiToppings(bibimbab);
        System.out.println("Bibimbab with Kimchi 김치 있는 비빔밥 " + bibimbab.getPrice());
    }
}
