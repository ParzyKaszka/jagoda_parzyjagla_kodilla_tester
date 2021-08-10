package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {

    private int sideA;
    private int sideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public void area() {
        int area = sideA * sideB;
        System.out.println("Area of rectangle: " + area);
    }

    @Override
    public void perimeter() {
        int perimeter = (2 * sideB) + (2 * sideA);
        System.out.println("Perimeter of rectangle: " + perimeter);
    }
}