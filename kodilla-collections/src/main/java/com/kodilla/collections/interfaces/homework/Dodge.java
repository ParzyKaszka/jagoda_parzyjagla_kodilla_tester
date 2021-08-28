package com.kodilla.collections.interfaces.homework;

public class Dodge implements Car {
    private int speed = 0;
    private int increase;

    public Dodge(int increase) {
        this.increase = increase;
    }

    @Override
    public int getIncrease() {
        return increase;
    }

    public int getSpeed() {
        return speed;
    }

    public void increaseSpeed() {
        speed += 70;
    }

    public void decreaseSpeed() {
        speed -= 35;
    }
}