package com.kodilla.inheritance;

public class Convertible extends Car {   //typ samochodu kabriolet

    public Convertible(int wheels, int seats) {
        super(wheels, seats);
    }

    public void openRoof() {                  //funkcja otwiera się dach
        System.out.println("Opening roof...");
    }

    public void closeRoof() {                  //funkcja zamyka się dach
        System.out.println("Closeing roof...");
    }
}