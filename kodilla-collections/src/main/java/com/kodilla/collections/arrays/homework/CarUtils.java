package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Chevrolet;
import com.kodilla.collections.interfaces.homework.Dodge;
import com.kodilla.collections.interfaces.homework.Toyota;


public class CarUtils {

    public static void describeCar(Car car) {
        System.out.println("--------");
        System.out.println("Name: " + getName(car));
        System.out.println("Speed: " + car.getIncrease());
    }

    public static String getName(Car car) {
        if (car instanceof Dodge)
            return "Dodge";
        else if (car instanceof Chevrolet)
            return "Chevrolet";
        else if (car instanceof Toyota)
            return "Toyota";
        else
            return "Unknown car name";
    }
}