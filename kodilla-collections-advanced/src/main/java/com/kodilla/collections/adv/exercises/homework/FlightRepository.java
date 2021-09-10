package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;


public class FlightRepository {
    private static List<Flight> flights = new ArrayList<>();

    public static List<Flight> getFlightsTable() {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Warsaw", "Cracow"));
        flights.add(new Flight("Warsaw", "Roma"));
        flights.add(new Flight("Berlin", "Warsaw"));
        flights.add(new Flight("Moscow", "Warsaw"));
        return flights;
    }
}