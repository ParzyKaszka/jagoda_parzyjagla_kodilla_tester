package com.kodilla.collections.interfaces.homework;

public class Chevrolet implements Car {

    private int speed;

    public Chevrolet(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 50;
    }

    @Override
    public void decreaseSpeed() {
        speed -= 30;
    }
}