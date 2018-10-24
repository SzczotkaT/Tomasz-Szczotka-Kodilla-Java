package com.kodilla.patterns.builder.bigMac;

import org.junit.Assert;
import org.junit.Test;

public class BigMacTestSuite {
    @Test
    public void testBigMacBuilder(){
        //Given
        BigMac bigMac = new BigMac.BigMacBuilder()
                .bun("Sesam bun")
                .burgers(2)
                .sauce("BBQ")
                .ingredient("Tomato")
                .ingredient("Onion")
                .ingredient("Cheese")
                .ingredient("Pickle")
                .ingredient("Bacon")
                .ingredient("Salad")
                .build();
        System.out.println(bigMac);
        //When
        int howManyIngredients = bigMac.getIngredients().size();
        int howManyBurgers = bigMac.getBurgers();
        //Then
        Assert.assertEquals(6, howManyIngredients);
        Assert.assertEquals(2, howManyBurgers);
    }
}
