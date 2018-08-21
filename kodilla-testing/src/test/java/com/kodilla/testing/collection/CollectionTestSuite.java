package com.kodilla.testing.collection;


import org.junit.*;
import java.util.ArrayList;
import java.util.List;

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
        List<Integer> numbers = new ArrayList<>();

        //Then
        List<Integer> resultList = oddNumbEx.exterminate(numbers);
        Assert.assertTrue(resultList.isEmpty());
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator oddNumbEx = new OddNumbersExterminator();
        List<Integer> numbers = new ArrayList<>();

        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(8);
        numbers.add(10);

        List<Integer> expectedNumbers = new ArrayList<>();

        expectedNumbers.add(4);
        expectedNumbers.add(8);
        expectedNumbers.add(10);

        //When
        List<Integer> result = oddNumbEx.exterminate(numbers);

        //Then
        Assert.assertEquals(3,result.size());
        Assert.assertEquals(expectedNumbers, result);
    }
}
