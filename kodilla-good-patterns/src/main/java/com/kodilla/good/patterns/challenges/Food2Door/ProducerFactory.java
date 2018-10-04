package com.kodilla.good.patterns.challenges.Food2Door;

public class ProducerFactory {
    public static Producer createProducer(Stores store) {
        Producer producer = null;
        switch (store) {
            case HEALTHY_SHOP:
                return new HealthyShop();
            case EXTRA_FOOD_SHOP:
                return new ExtraFoodShop();
            case GLUTEN_FREE_SHOP:
                return new GlutenFreeShop();
        }

        return producer;
    }
}
