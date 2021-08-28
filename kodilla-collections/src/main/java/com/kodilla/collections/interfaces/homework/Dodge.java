package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dodge dodge = (Dodge) o;
        return speed == dodge.speed && increase == dodge.increase;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed, increase);
    }
}