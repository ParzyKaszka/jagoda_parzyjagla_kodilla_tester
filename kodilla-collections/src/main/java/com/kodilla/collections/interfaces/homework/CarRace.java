package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {   //wyścig

        Car challenger = new Dodge(0);
        doRace(challenger);
        Car impala = new Chevrolet(0);
        doRace(impala);
        Car supra = new Toyota(0);
        doRace(supra);

    }

    public static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println(car.getSpeed());
    }
}