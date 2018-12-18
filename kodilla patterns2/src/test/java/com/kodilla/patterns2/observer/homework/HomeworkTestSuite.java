package com.kodilla.patterns2.observer.homework;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HomeworkTestSuite {

    @Test
    public void testUpdate(){
        //Given
        TaskQueue tomeksTasks = new TomeksTasks();
        TaskQueue antoniosTasks = new AntoniosTasks();
        TaskQueue anniesTasks = new AnniesTasks();
        Mentor fredrik = new Mentor("Fredrik");
        Mentor david = new Mentor("David");
        tomeksTasks.registerQObserver(david);
        antoniosTasks.registerQObserver(fredrik);
        anniesTasks.registerQObserver(david);
        anniesTasks.registerQObserver(fredrik);

        //When
        tomeksTasks.addTask("Task 1.1");
        tomeksTasks.addTask("Task 1.2");
        antoniosTasks.addTask("Task 1.1");
        anniesTasks.addTask("Task 1.1");

        //Then
        assertEquals(3,david.getUpdateCount());
        assertEquals(2, fredrik.getUpdateCount());
    }
}
