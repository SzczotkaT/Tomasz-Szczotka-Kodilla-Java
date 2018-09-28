package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flightMap = new HashMap<>();
        flightMap.put("Nykoping-Skavsta", true);
        flightMap.put("Warsaw-Chopin", true);
        flightMap.put("Warsaw-Modlin", false);
        flightMap.put("Stockholm-Arlanda", true);

        if (flightMap.containsKey(flight.getDepartureAirport())) {
            return flightMap.get(flight.getDepartureAirport());
        } else {
            throw new RouteNotFoundException();
        }
    }
}
