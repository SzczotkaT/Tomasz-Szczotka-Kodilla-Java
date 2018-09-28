package com.kodilla.good.patterns.challenges.FlyAway;

import java.util.HashSet;
import java.util.Set;

public class FlightsList {
    private Set<Flight> flightsSet = new HashSet<>();

    public FlightsList(Set<Flight> flightsSet) {
        this.flightsSet = flightsSet;
    }

    public Set<Flight> getFlightsSet() {
        return flightsSet;
    }
}
