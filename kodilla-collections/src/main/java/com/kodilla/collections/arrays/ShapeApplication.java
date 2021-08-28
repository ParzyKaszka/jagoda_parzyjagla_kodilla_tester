package com.kodilla.collections.arrays;

import com.kodilla.collections.interfaces.Circle;
import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.Square;
import com.kodilla.collections.interfaces.Triangle;

import java.util.Random;

public class ShapeApplication {

    public static void main(String[] args) {
        Random random2 = new Random();
        Shape[] shapes = new Shape[random2.nextInt(20) + 1];//nowa tablica z losową liczbą obiektów shape
        for (int n = 0; n < shapes.length; n++)  // przejście po tablicy
            shapes[n] = drawShape();      // dla indeksu tablicy shapes losowy kształt i jego parametry
        for (Shape shape : shapes) // wykonaj operację dla każdego elementu shape w tablicy shapes
            ShapeUtils.displayShapeInfo(shape);
    }

    public static Shape drawShape(){
        Random random = new Random();
        int drawShapeKind = random.nextInt(3); //wylosuj rodzaj kształtu (0, 1 lub 2)
        double a = random.nextDouble() * 100 + 1; //wymiar kształtu równy z przedziału między 0(włącznie) a 101
        double b = random.nextDouble() * 100 + 1;
        double c = random.nextDouble() * 100 + 1;
        if (drawShapeKind == 0)     //0- circle, 1- square, 2- triangle
            return new Circle(a);
        else if (drawShapeKind == 1)
            return new Square(a);
        else
            return new Triangle(a,b,c);
    }
}
