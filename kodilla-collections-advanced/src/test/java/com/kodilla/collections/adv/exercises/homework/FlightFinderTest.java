package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {
    FlightFinder flightFinder = new FlightFinder();

    @Test
    public void testFindFlightsFrom() {
        assertEquals(2, flightFinder.findFlightsFrom("Warsaw").size());
    }

    public void testFindFlightsTo() {
        assertEquals(2, flightFinder.findFlightsTo("Warsaw").size());
    }
}