package com.kodilla.good.patterns.challenges.OrderService;

import java.time.LocalDate;

public class OrderRequestRetriever {
    public OrderRequest retrieve(){
        User user = new User("Tomasz", "Szczotka","Blabla 5, 123 45 Country");
        LocalDate orderDate = LocalDate.of(2019,9,24);

        return new OrderRequest(user, orderDate);
    }
}
