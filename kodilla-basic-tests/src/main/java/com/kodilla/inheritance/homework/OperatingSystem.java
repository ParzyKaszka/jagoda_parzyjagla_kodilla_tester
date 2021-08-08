package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int year;

    public OperatingSystem(int year) {
        this.year = year;
    }

    public void turnOn() {
        System.out.println("The operating system from " + year + " has been turned on.");
    }

    public void turnOff() {
        System.out.println("The operating system from " + year + " has been shut down.");
    }
}