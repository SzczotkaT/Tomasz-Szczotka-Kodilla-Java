package com.kodilla.good.patterns.challenges.FlyAway;

public class FlyAwayRunner {
    public static void main(String[] args) {

        FlightFromFinder flightFromFinder = new FlightFromFinder();
        flightFromFinder.findFrom();

        System.out.println("-------------------------------------------");

        FlightToFinder flightToFinder = new FlightToFinder();
        flightToFinder.findTo();

        System.out.println("--------------------------------------------");

        FlightToByFinder flightToByFinder = new FlightToByFinder();
        flightToByFinder.findToBy();
    }
}
