package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Square square = new Square(5);
        square.area();
        square.perimeter();

        Rectangle rectangle = new Rectangle(2, 4);
        rectangle.area();
        rectangle.perimeter();
    }
}