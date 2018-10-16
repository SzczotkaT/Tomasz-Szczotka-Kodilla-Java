package com.kodilla.patterns.factory.tasks;

import java.util.Random;

public final class ShoppingTask implements Task {
    final String taskName;
    final String whatToBuy;
    final double quantity;

    public ShoppingTask(final String taskName, final String whatToBuy, final double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public String executeTask(){
        return "Executing task shopping";
    }

    @Override
    public String getTaskName(){
        return taskName;
    }

    @Override
    public boolean isTaskExecuted(){
        Random rand = new Random();
        int n = rand.nextInt(2);
        if (n == 0) {
            return false;
        } else
            return true;
    }
}
