package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public final class World {
        private final Set<Continent> continentsInTheWorld = new HashSet<>();

        public BigDecimal getPeopleQuantity(){
            return continentsInTheWorld.stream()
                    .flatMap(continent -> continent.getCountriesOnTheContinent().stream())
                    .map(World::getPeopleQuantity)
                    .collect(Collectors.toSet());


        }
}
