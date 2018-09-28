package com.kodilla.good.patterns.challenges.FlyAway;

public class FlyAwayRunner {
    public static void main(String[] args) {

        FlightFromFinder flightFromFinder = new FlightFromFinder();
        flightFromFinder.findFrom();

        System.out.println("-------------------------------------------");

        FlightToFinder flightToFinder = new FlightToFinder();
        flightToFinder.findTo();
    }
}
