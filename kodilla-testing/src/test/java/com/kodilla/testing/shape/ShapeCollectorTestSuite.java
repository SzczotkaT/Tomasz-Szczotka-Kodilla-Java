package com.kodilla.testing.shape;

import org.junit.*;
import sun.java2d.pipe.ShapeSpanIterator;

import java.util.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests(){
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest(){
        testCounter++;
        System.out.println("Prepering to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure(){
        //Given
        ShapeCollector sc = new ShapeCollector();

        //When
        sc.addFigure(new Circle("Circle", 5));
        sc.addFigure(new Square("Square",6));
        sc.addFigure(new Triangle("Triangle", 8, 5.5));
        sc.addFigure(new Circle("Circle2", 10));

        //Then
        Assert.assertEquals(new Triangle("Triangle", 8, 5.5),sc.getFigure(2));
    }

    @Test
    public void testRemoveFigure(){
        //Given
        ArrayList<Shape> shapes = new ArrayList<>();

        //When
       // shapes.remove(Shape);
    }
}
