package com.kodilla.collections.interfaces.homework;

public class Chevrolet implements Car {
    private int speed;
    private int increase;

    public Chevrolet(int increase) {
        this.increase = increase;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    public int getIncrease() {
        return increase;
    }

    @Override
    public void increaseSpeed() {
        speed += 60;
    }

    @Override
    public void decreaseSpeed() {
        speed -= 40;
    }
}