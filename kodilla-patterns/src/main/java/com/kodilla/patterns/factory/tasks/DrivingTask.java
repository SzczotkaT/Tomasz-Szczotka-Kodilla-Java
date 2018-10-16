package com.kodilla.patterns.factory.tasks;

import java.util.Random;

public final class DrivingTask implements Task{
    final String taskName;
    final String where;
    final String using;

    public DrivingTask(final String taskName, final String where, final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public String executeTask(){
        return "Executing task driving";
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
