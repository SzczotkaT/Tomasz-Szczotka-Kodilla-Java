package com.kodilla.good.patterns.challenges.FlyAway;

import java.util.stream.Collectors;

public class FlightToFinder {
    FlightsListCreator flightsListCreator = new FlightsListCreator();
    FlightsList flightsList = flightsListCreator.create();

    public void findTo() {
        flightsList.getFlightsSet().stream()
                .filter(f -> f.getTo().equals("Gdansk"))
                .collect(Collectors.toSet())
                .forEach(System.out::println);
    }
}
