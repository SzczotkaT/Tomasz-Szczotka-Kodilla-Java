package com.kodilla.good.patterns.challenges.Food2Door;

import java.time.LocalDate;

public class OrderProcessor {
    public void procesOrder(Order order) {
        Producer producer = ProducerFactory.createProducer(order.getFoodStore());
        producer.process(order);
    }
}
