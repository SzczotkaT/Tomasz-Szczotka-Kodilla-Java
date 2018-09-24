package com.kodilla.good.patterns.challenges.OrderService;

import java.time.LocalDate;

public class ProductOrderService{
   public boolean order(final User user, final LocalDate orderDate){
       System.out.println("Order by: " + user.getName() + user.getLastName() + " Date of order: " + orderDate.toString()
                + " shipping address: " + user.getAddress());
       return true;
   }
}
