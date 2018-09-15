package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class World {
        private final Set<Continent> continentsInTheWorld = new HashSet<>();

    public Set<Continent> getContinentsInTheWorld() {
        return continentsInTheWorld;
    }

    public BigDecimal getPeopleQuantity(){
            BigDecimal totalPopulation = continentsInTheWorld.stream()
                    .flatMap(continent -> continent.getCountriesOnTheContinent().stream())
                    .map(c -> c.getPeopleQuantity())
                    .reduce(BigDecimal.ZERO,(sum, current) -> sum = sum.add(current));
            return totalPopulation;
        }
}
