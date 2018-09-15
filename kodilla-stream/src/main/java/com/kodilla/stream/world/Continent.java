package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.*;
import java.util.Set;


public final class Continent {
    private final String continentName;
    private final Set<Country> countriesOnTheContinent = new HashSet<>();

    public Continent(final String continentName) {
        this.continentName = continentName;
    }

    public String getContinentName() {
        return continentName;
    }

    public Set<Country> getCountriesOnTheContinent() {
        return countriesOnTheContinent;
    }
}
