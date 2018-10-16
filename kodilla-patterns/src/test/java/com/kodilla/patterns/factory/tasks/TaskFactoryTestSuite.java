package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShopping(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.doTask(TaskFactory.SHOPPING);
        //Then
        Assert.assertEquals("Executing task shopping", shoppingTask.executeTask());
        Assert.assertEquals("Do Shopping", shoppingTask.getTaskName());
    }

    @Test
    public void testFactoryPainting(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintingTask = factory.doTask(TaskFactory.PAINTING);
        //Then
        Assert.assertEquals("Executing task paint", paintingTask.executeTask());
        Assert.assertEquals("Do Painting", paintingTask.getTaskName());
    }

    @Test
    public void testFactoryDriving(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drivingTask = factory.doTask(TaskFactory.DRIVING);
        //Then
        Assert.assertEquals("Executing task driving", drivingTask.executeTask());
        Assert.assertEquals("Do Drive", drivingTask.getTaskName());
    }
}
