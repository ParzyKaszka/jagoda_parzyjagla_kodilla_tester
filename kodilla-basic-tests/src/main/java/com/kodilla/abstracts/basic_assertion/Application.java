package com.kodilla.abstracts.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;

        int sumResult = calculator.sum(a, b);
        boolean correct = ResultChacker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int subtractResult = calculator.subtract(b, a);
        boolean correct2 = ResultChacker.assertEquals(3, subtractResult);
        if (correct2) {
            System.out.println("Metoda odejmowania działa poprawnie dla liczb " + b + " i " + a);
        } else {
            System.out.println("Metoda odejmowania nie działa poprawnie dla liczb " + b + " i " + a);
        }

        int squaredResult = calculator.squared(a);
        boolean correct3 = ResultChacker.assertEquals(25, squaredResult);
        if (correct3) {
            System.out.println("Metoda podnosząca do kwadratu działa poprawnie dla liczby " + a);
        } else {
            System.out.println("Metoda podnosząca do kwadratu nie działa poprawnie dla liczby " + a);
        }
    }
}