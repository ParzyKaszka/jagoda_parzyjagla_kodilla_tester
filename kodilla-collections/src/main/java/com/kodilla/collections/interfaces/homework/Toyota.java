package com.kodilla.collections.interfaces.homework;

public class Toyota implements Car {
    private int speed = 0;
    private int increase;

    public Toyota(int increase) {
        this.increase = increase;
    }

    public int getIncrease() {
        return increase;
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
        speed -= 35;
    }
}