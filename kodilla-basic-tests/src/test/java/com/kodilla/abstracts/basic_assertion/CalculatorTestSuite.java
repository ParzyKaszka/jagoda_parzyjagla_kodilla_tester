package com.kodilla.abstracts.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int a = 12;
        int b = 7;
        int subResult = calculator.subtract(a, b);
        assertEquals(5, subResult, 1);
    }

    @Test
    public void testPower() {
        Calculator calculator = new Calculator();

        double powerResult = calculator.power(-2, -5);
        System.out.println(powerResult);
        assertEquals(-0.03, powerResult, 0.05);

        double powerResult2 = calculator.power(5, 0);
        System.out.println(powerResult2);
        assertEquals(1, powerResult2, 0.5);

        double powerResult3 = calculator.power(5, 6);
        System.out.println(powerResult3);
        assertEquals(15625, powerResult3, 100);

    }
}