package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task doTask(final String taskClass){
        switch (taskClass){
            case SHOPPING:
                return new ShoppingTask("Do Shopping", "Food",10);
            case PAINTING:
                return new PaintingTask("Do Painting", "Red","Apple");
            case DRIVING:
                return new DrivingTask("Do Drive", "To work", "Car");
            default:
                return null;
        }
    }

}
