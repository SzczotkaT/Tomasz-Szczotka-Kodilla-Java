package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class OrderRequest {

    private User user;
    private LocalDate orderDate;

    public OrderRequest(final User user, final LocalDate orderDate){
        this.user = user;
        this.orderDate = orderDate;
    }

    public User getUser(){return user;}

    public LocalDate getOrderDate(){return orderDate;}
}
