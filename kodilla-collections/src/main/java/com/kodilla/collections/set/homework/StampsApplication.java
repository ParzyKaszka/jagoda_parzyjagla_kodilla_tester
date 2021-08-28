package com.kodilla.collections.set.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Nederlands", 31.25, 43.0, true));
        stamps.add(new Stamp("New Zealand", 31.25, 39.5, false));
        stamps.add(new Stamp("France", 70.0, 90.0, true));
        stamps.add(new Stamp("Nederlands", 31.25, 43.0, true));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}