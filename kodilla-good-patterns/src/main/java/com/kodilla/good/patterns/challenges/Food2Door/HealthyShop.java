package com.kodilla.good.patterns.challenges.Food2Door;

public class HealthyShop implements Producer {
    public void process(Order customerOrder) {
        System.out.println("Order accepted. Expect your food soon");
    }
}
