package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testArrayOperations(){
        //Given
        int[] numbers = new int[20];

        for(int i = 1; i < 20;i++){
            numbers[i] = i;
        }

        //When
        ArrayOperations.getAverage(numbers);

        //Then
        Assert.assertEquals(9.5, (double)ArrayOperations.getAverage(numbers),0.0001);
    }
}
