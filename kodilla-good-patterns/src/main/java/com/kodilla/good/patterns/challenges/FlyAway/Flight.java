package com.kodilla.good.patterns.challenges.FlyAway;

import java.util.Objects;

public class Flight {
    private String from;
    private String to;
    private int flightNumber;

    public Flight(String from, String to, int flightNumber) {
        this.from = from;
        this.to = to;
        this.flightNumber = flightNumber;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", flightNumber=" + flightNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return flightNumber == flight.flightNumber;
    }

    @Override
    public int hashCode() {
        if (flightNumber <= 100) {
            return 0;
        }
        if (flightNumber > 100 && flightNumber <= 200) {
            return 1;
        } else
            return 2;
    }
}