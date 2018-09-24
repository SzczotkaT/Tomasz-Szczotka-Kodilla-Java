package com.kodilla.good.patterns.challenges.OrderService;

import java.time.LocalDate;

public interface OrderRepository {
    boolean createOrder(User user, LocalDate orderDate);
}
