package com.kodilla.patterns.factory.tasks;

import java.util.Random;

public final class PaintingTask implements Task{
    final String taskName;
    final String color;
    final String whatToPaint;

    public PaintingTask(final String taskName, final String color, final String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public String getTaskName(){
        return taskName;
    }

    @Override
    public String executeTask(){
        return "Executing task paint";
    }

    @Override
    public boolean isTaskExecuted() {
        Random rand = new Random();
        int n = rand.nextInt(2);
        if (n == 0) {
            return false;
        } else
            return true;
    }
}
