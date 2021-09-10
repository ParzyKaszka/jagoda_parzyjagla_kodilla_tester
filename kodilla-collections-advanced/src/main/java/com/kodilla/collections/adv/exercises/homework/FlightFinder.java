package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {
    private static List<Flight> flights;

    public List<Flight> findFlightsFrom(String departure) {
        flights = FlightRepository.getFlightsTable();
        List<Flight> departures = new ArrayList<>();
        for (Flight flight : flights) {
            if (flight.getDeparture().equals(departure)) {
                departures.add(flight);
            }
        }
        return departures;
    }

    public List<Flight> findFlightsTo(String arrival) {
        flights = FlightRepository.getFlightsTable();
        List<Flight> arrivals = new ArrayList<>();
        for (Flight flight : flights) {
            if (flight.getArrival().equals(arrival)) {
                arrivals.add(flight);
            }
        }
        return arrivals;
    }
}