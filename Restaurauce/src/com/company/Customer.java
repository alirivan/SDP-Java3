package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Customer {
    private static int choice;

    public static void main(String[] args) throws IOException {
        do {
            System.out.println("-----Menu-----");
            System.out.println("1. Vegan Food \n");
            System.out.println("2. Korean Food \n");
            System.out.println("3. Chinese Food \n");
            System.out.println("4. Czech Food \n");
            System.out.println("5. Non Vegan Food \n");
            System.out.println("6. Exit \n");
            System.out.println("Please Enter Your Choice");

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            choice = Integer.parseInt(br.readLine());

            switch (choice) {
                case 1: {
                    VeganFood veganFood = new VeganFood();
                    System.out.println(veganFood.prepareFood());
                    System.out.println(veganFood.foodPrice());
                }
                break;

                case 2: {
                    KoreanFood koreanFood = new KoreanFood((Food) new VeganFood());
                    System.out.println(koreanFood.prepareFood());
                    System.out.println(koreanFood.foodPrice());
                }
                break;

                case 3: {
                    ChineseFood chineseFood = new ChineseFood((Food) new VeganFood());
                    System.out.println(chineseFood.prepareFood());
                    System.out.println(chineseFood.foodPrice());
                }
                break;

                case 4: {
                    CzechFood czechFood = new CzechFood((Food) new VeganFood());
                    System.out.println(czechFood.prepareFood());
                    System.out.println(czechFood.foodPrice());
                }
                break;

                case 5: {
                    NonVeganFood nonVeganFood = new NonVeganFood((Food) new VeganFood());
                    System.out.println(nonVeganFood.prepareFood());
                    System.out.println(nonVeganFood.foodPrice());
                }

                default: {
                    System.out.println("Other food is not available");
                    System.out.println("We will add more cuisine");
                }

                return;
            }

        }
            while (choice != 6);
    }
}
