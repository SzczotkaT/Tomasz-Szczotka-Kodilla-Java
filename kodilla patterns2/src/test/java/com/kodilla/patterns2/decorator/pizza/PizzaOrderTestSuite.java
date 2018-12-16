package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testPizzaExtraCheeseAndHamGetCost(){
        //Given
        PizzaOrder theOrder = new BasicPizza();
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new HamDecorator(theOrder);

        //When
        BigDecimal theCost = theOrder.getPrice();

        //Then
        assertEquals(new BigDecimal(23),theCost);
    }

    @Test
    public void testPizzaExtraCheeseAndHamGetDescription(){
        //Given
        PizzaOrder theOrder = new BasicPizza();
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new HamDecorator(theOrder);

        //When
        String details = theOrder.getDetails();

        //Then
        assertEquals("Pizza dough + sauce + cheese + extra cheese + ham", details);
    }

    @Test
    public void testPizzaWithAllIngredientsGetCost(){
        //Given
        PizzaOrder theOrder = new BasicPizza();
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new HamDecorator(theOrder);
        theOrder = new OnionDecorator(theOrder);
        theOrder = new MushroomsDecorator(theOrder);

        //When
        BigDecimal theCost = theOrder.getPrice();

        //Then
        assertEquals(new BigDecimal(27.5),theCost);
    }

    @Test
    public void testPizzaWithAllIngredientsGetDescription(){
        //Given
        PizzaOrder theOrder = new BasicPizza();
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new HamDecorator(theOrder);
        theOrder = new OnionDecorator(theOrder);
        theOrder = new MushroomsDecorator(theOrder);

        //When
        String details = theOrder.getDetails();

        //Then
        assertEquals("Pizza dough + sauce + cheese + extra cheese + ham + onion + mushrooms", details);
    }
}
