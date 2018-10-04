package com.kodilla.good.patterns.challenges.FlyAway;

import java.util.HashSet;
import java.util.Set;

public class FlightsListCreator {
    public FlightsList create() {
        Flight flightW1 = new Flight("Warsaw", "Krakow", 10);
        Flight flightW2 = new Flight("Warsaw", "Gdansk", 20);
        Flight flightK1 = new Flight("Krakow", "Warsaw", 110);
        Flight flightK2 = new Flight("Krakow", "Gdansk", 120);
        Flight flightG1 = new Flight("Gdansk", "Warsaw", 210);
        Flight flightWr1 = new Flight("Wroclaw", "Gdansk", 310);

        Set<Flight> flightsSet = new HashSet<>();
        flightsSet.add(flightW1);
        flightsSet.add(flightW2);
        flightsSet.add(flightK1);
        flightsSet.add(flightK2);
        flightsSet.add(flightG1);
        flightsSet.add(flightWr1);

        return new FlightsList(flightsSet);
    }
}
