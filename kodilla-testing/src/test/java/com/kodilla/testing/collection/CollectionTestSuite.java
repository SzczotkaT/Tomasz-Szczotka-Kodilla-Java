package com.kodilla.testing.collection;

import org.junit.*;

import java.util.*;
import java.util.Random;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test case: Begin");
    }
    @After
    public void after(){
        System.out.println("Test case: End");
    }
    @BeforeClass
    public static void beforeClass(){
        System.out.println("Test Suite: Begin");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("Test Suite: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        OddNumbersExterminator oddNumbEx = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<>();
        oddNumbEx.exterminate(numbers);

    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        OddNumbersExterminator oddNumbEx = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<>();

        Random rand = new Random();
        for (int i = 0; i < numbers.size(); i++) {
            int n = rand.nextInt(10) + 1;
            numbers.add(i, n);
        }
        oddNumbEx.exterminate(numbers);
    }
}
