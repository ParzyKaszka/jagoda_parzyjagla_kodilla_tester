package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schools = new HashMap<>();

        School school1 = new School("Baczyński", 27, 30, 28, 20);
        School school2 = new School("Batory", 22, 26, 28, 21);
        School school3 = new School("Przybosia", 25, 27, 24, 23);

        Principal principal1 = new Principal("Jakub", "Tomaszewski");
        Principal principal2 = new Principal("Robert", "Prządka");
        Principal principal3 = new Principal("Krzysztof", "Zaręba");

        schools.put(principal1, school1);
        schools.put(principal2, school2);
        schools.put(principal3, school3);

        for (Map.Entry<Principal, School> school : schools.entrySet())
            System.out.println(school.getKey().getName() + " is the director of the " + school.getValue().getName() + " school with " + school.getValue().getSumClassrooms() + " students.");
    }
}