package com.kodilla.inheritance;

public class Car {    //samochód i jego podstawowe funkcje
    private int wheels;     //ma koła, niezmienne
    private int seats;      //ma siedzenia, niezmiennie

    public Car(int wheels, int seats) {  //konstr. pomaga od razu wpisać wartości Car, zamist odwoływać oddzialnie
        this.wheels = wheels;
        this.seats = seats;
    }

    public void turnOnLights() {    //funkcja włączania świateł
        System.out.println("Lights were turned on");
    }

    public void openDoors() {    //funkcja otworzenia drzwi
        System.out.println("Opening 4 doors");
    }

    public void displayNumberOfSeats() {
        System.out.println("Number of seats: " + seats);
    }

    public int getWheels() {   //wyciągnąć ilość kół
        return wheels;
    }

    public int getSeats() {     //wyciągnąć ilość siedzeń
        return seats;
    }
}