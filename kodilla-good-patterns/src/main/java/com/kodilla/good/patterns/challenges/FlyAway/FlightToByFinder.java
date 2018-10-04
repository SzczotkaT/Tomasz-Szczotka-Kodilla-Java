package com.kodilla.good.patterns.challenges.FlyAway;

import java.util.stream.Collectors;

public class FlightToByFinder {
    FlightsListCreator flightsListCreator = new FlightsListCreator();
    FlightsList flightsList = flightsListCreator.create();

    public void findToBy() {
        flightsList.getFlightsSet().stream()
                .filter(f -> f.getFrom().equals("Warsaw") && f.getTo().equals("Krakow"))
                .collect(Collectors.toSet())
                .forEach(System.out::println);
        flightsList.getFlightsSet().stream()
                .filter(b -> b.getFrom().equals("Krakow") && b.getTo().equals("Gdansk"))
                .collect(Collectors.toSet())
                .forEach(System.out::println);
    }
}
