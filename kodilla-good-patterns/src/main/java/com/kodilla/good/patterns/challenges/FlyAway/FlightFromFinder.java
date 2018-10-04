package com.kodilla.good.patterns.challenges.FlyAway;

import java.util.stream.Collectors;

public class FlightFromFinder {
    FlightsListCreator flightsListCreator = new FlightsListCreator();
    FlightsList flightsList = flightsListCreator.create();

    public void findFrom() {
        flightsList.getFlightsSet().stream()
                .filter(f -> f.getFrom().equals("Warsaw"))
                .collect(Collectors.toSet())
                .forEach(System.out::println);
    }
}
