package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Chevrolet;
import com.kodilla.collections.interfaces.homework.Dodge;
import com.kodilla.collections.interfaces.homework.Toyota;

import java.util.Random;

public class CarsApplication {

    private static Random random;

    public static void main(String[] args) {
        Car[] cars = new Car[random.nextInt(15) + 1];
        for (int i = 0; i < cars.length; i++)
            cars[i] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);
    }

    public static Car drawCar() {
        int newCar = random.nextInt(3);
        int increase = random.nextInt(80) + 20;
        if (newCar == 0)
            return new Dodge(increase);
        else if (newCar == 1)
            return new Toyota(increase);
        else
            return new Chevrolet(increase);
    }
}