package com.kodilla.good.patterns.challenges.OrderService;

import java.time.LocalDate;

public class ProductOrderRepository implements OrderRepository {
    public boolean createOrder(User user, LocalDate orderDate) {
        System.out.println("Saving information to database");
        return true;
    }
}
