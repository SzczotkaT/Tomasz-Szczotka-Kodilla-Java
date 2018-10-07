package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class BoardTestSuite {
    @Autowired
    private Board board;

    @Test
    public void testBoard() {
        //When
        board.getDoneList().getTasks().add("Task 1");
        board.getInProgressList().getTasks().add("Task 2");

        //Then
        assertEquals("Task 1", board.getDoneList().getTasks().get(0));
        assertEquals("Task 2", board.getInProgressList().getTasks().get(0));
    }

}