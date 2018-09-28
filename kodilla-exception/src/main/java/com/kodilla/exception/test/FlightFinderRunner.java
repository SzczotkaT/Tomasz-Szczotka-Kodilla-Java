package com.kodilla.exception.test;

public class FlightFinderRunner {
    public static void main(String[] args) {

        Flight flight = new Flight("Nykoping-Skavsta", "Stockholm-Arlanda");

        FlightFinder finder = new FlightFinder();
        try {
            finder.findFlight(flight);

        } catch (RouteNotFoundException e) {
            System.out.println("Can't find an available flight");

        } finally {
            System.out.println(" ex. Counting search amount");
        }
    }
}
