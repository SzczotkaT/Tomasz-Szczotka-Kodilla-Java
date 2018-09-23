package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class OrderRequestRetriver {

    public OrderRequest retrive(){
        User user = new User("Tomasz", "Szczotka","Vapnarstigen 5, 181 65, Lidingo");

        LocalDate dateOfOrder = LocalDate.of(2018,9, 22);

        return new OrderRequest(user, dateOfOrder);
    }
}
