package com.kodilla.testing.shape;

import org.junit.*;


public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Prepering to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector sc = new ShapeCollector();

        //When
        sc.addFigure(new Circle("Circle", 5));
        sc.addFigure(new Square("Square", 6));
        sc.addFigure(new Triangle("Triangle", 8, 5.5));
        sc.addFigure(new Circle("Circle2", 10));

        //Then
        Assert.assertEquals(4, sc.getListSize());
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector sc = new ShapeCollector();
        sc.addFigure(new Circle("Circle", 5));
        sc.addFigure(new Square("Square", 6));
        sc.addFigure(new Triangle("Triangle", 8, 5.5));
        sc.addFigure(new Circle("Circle2", 10));

        //When
        boolean result = sc.removeFigure(new Circle("Circle2", 10));

        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(3, sc.getListSize());
    }

    @Test
    public void testRemoveNotExistingFigure() {
        //Given
        ShapeCollector sc = new ShapeCollector();
        sc.addFigure(new Circle("Circle", 5));
        sc.addFigure(new Square("Square", 6));
        sc.addFigure(new Triangle("Triangle", 8, 5.5));
        sc.addFigure(new Circle("Circle2", 10));

        //When
        boolean result = sc.removeFigure(new Circle("Circle22", 12));

        //Then
        Assert.assertFalse(result);
        Assert.assertEquals(4, sc.getListSize());
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector sc = new ShapeCollector();

        //When
        sc.addFigure(new Circle("Circle", 5));
        sc.addFigure(new Square("Square", 6));
        sc.addFigure(new Triangle("Triangle", 8, 5.5));
        sc.addFigure(new Circle("Circle2", 10));

        //Then
        Assert.assertEquals(new Square("Square", 6), sc.getFigure(1));
    }

    @Test
    public void testGetNotExistingFigure() {
        //Given
        ShapeCollector sc = new ShapeCollector();

        //When
        sc.addFigure(new Circle("Circle", 5));
        sc.addFigure(new Square("Square", 6));
        sc.addFigure(new Triangle("Triangle", 8, 5.5));
        sc.addFigure(new Circle("Circle2", 10));

        //Then
        Assert.assertNull(sc.getFigure(-1));

    }

    @Test
    public void testShowFigure() {
        //Given
        ShapeCollector sc = new ShapeCollector();

        //When
        sc.addFigure(new Circle("Circle", 5));
        sc.addFigure(new Square("Square", 6));
        sc.addFigure(new Triangle("Triangle", 8, 5.5));
        sc.addFigure(new Circle("Circle2", 10));

        //Then
        Assert.assertEquals("CircleSquareTriangleCircle2", sc.showFigures());
    }
}
