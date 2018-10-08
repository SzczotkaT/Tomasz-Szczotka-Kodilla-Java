package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    @BeforeClass
    public static void getLastLog(){
        Logger.getInstance().log("logged");
    }

    @Test
    public void testGetLastLog(){
        //Given
        //When
        String lastLog = Logger.getInstance().getLastLog();
        System.out.println("Last Log was: " + lastLog);
        //Then
        Assert.assertEquals("logged", lastLog);
    }
}
