package com.kodilla.abstracts.homework;

public class Square extends Shape {
    private int sideA;

    public Square(int sideA) {
        this.sideA = sideA;
    }


    @Override
    public void area() {
        int area = sideA * sideA;
        System.out.println("Area of square: " + area);
    }

    @Override
    public void perimeter() {
        int perimeter = 4 * sideA;
        System.out.println("Perimeter of square: " + perimeter);
    }
}