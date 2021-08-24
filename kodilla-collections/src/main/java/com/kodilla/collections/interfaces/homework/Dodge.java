package com.kodilla.collections.interfaces.homework;

public class Dodge implements Car {
    private int speed;

    public Dodge(int speed) {
        this.speed = speed;
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