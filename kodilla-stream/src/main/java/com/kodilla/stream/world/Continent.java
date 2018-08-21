package com.kodilla.stream.world;

import java.util.*;


public final class Continent {
    private final String continentName;
    private final List<Country> countriesOnTheContinent = new ArrayList<>();

    public Continent(final String continentName) {
        this.continentName = continentName;
    }

    public String getContinentName() {
        return continentName;
    }

    public List<Country> getCountriesOnTheContinent() {
        return countriesOnTheContinent;
    }
}
