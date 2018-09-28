package com.kodilla.good.patterns.challenges.Food2Door;

import java.time.LocalDate;

public class Order {
    private Customer customer;
    private Stores foodStore;
    private LocalDate dateOfOrder;

    public Order(Customer customer, Stores foodStore, LocalDate dateOfOrder) {
        this.customer = customer;
        this.foodStore = foodStore;
        this.dateOfOrder = dateOfOrder;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Stores getFoodStore() {
        return foodStore;
    }

    public LocalDate getDateOfOrder() {
        return dateOfOrder;
    }
}
