package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

import java.util.ArrayList;
import java.util.Random;


public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test case: Begin");
    }

    @After
    public void after() {
        System.out.println("Test case: End");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: Begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator oddNumbEx = new OddNumbersExterminator();

        //When
        ArrayList<Integer> numbers = new ArrayList<>();

        //Then
        ArrayList<Integer> resultList = oddNumbEx.exterminate(numbers);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator oddNumbEx = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(8);
        numbers.add(10);

        //When
        ArrayList<Integer> result = oddNumbEx.exterminate(numbers);

        //Then
        Assert.assertEquals(3,result.size());
        for(int n =0; n<result.size(); n++){
            Assert.assertEquals(0,result.get(n) % 2);
        }

    }
}
