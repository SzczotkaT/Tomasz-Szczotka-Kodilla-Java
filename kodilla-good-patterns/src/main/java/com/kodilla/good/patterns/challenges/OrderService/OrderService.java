package com.kodilla.good.patterns.challenges.OrderService;

import java.time.LocalDate;

public interface OrderService {
    boolean order(User user, LocalDate orderDate);
}
