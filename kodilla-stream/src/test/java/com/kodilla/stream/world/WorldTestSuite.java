package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;
import java.math.BigDecimal;
import java.util.*;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        Country poland = new Country("Poland",new BigDecimal("5857657424"));
        Country germany = new Country("Germany", new BigDecimal("7980493536"));
        Country france = new Country("France", new BigDecimal("8992828384"));

        Continent europe = new Continent("Europe");
        europe.getCountriesOnTheContinent().add(poland);
        europe.getCountriesOnTheContinent().add(germany);
        europe.getCountriesOnTheContinent().add(france);

        Country brazil = new Country("Brazil", new BigDecimal("894359282"));
        Country venezuela = new Country("Venezuela", new BigDecimal("31568179"));
        Country colombia = new Country("Colombia", new BigDecimal("4823747565"));

        Continent southAmerica = new Continent("South America");
        southAmerica.getCountriesOnTheContinent().add(brazil);
        southAmerica.getCountriesOnTheContinent().add(venezuela);
        southAmerica.getCountriesOnTheContinent().add(colombia);

        World world = new World();
        world.getContinentsInTheWorld().add(southAmerica);
        world.getContinentsInTheWorld().add(europe);

        //When
        world.getPeopleQuantity();

        //Then
        BigDecimal expectedWorldQuantity = new BigDecimal("28580654370");
        Assert.assertEquals(expectedWorldQuantity,world.getPeopleQuantity());
    }

}
