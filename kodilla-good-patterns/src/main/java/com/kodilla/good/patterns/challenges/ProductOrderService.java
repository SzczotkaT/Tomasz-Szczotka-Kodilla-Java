package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class ProductOrderService {
    public boolean order(final User user, final LocalDate dateOfOrder){
        System.out.println("Order by: " + user.getName() + user.getLastName() + "Date of order: " + dateOfOrder.toString()
                + "Location of the order" + user.getAddres());
        return true;
    }

}
