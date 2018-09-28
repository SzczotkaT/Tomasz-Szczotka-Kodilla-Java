package com.kodilla.good.patterns.challenges.Food2Door;

import java.time.LocalDate;

public class Food2DoorRunner {
    public static void main(String[] args) {
        Order order = new Order(new Customer("Franciszek", "Tubylski", LocalDate.now()),
                Stores.GLUTEN_FREE_SHOP,
                LocalDate.now());
        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.procesOrder(order);
    }
}
