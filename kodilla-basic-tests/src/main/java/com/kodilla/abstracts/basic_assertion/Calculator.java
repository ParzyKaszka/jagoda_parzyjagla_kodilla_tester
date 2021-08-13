package com.kodilla.abstracts.basic_assertion;

import java.lang.Math;

import static java.lang.Math.*;

public class Calculator {

    public int sum(int a, int b) {
        return Math.addExact(a, b);
    }

    public int subtract(int a, int b) {
        return Math.subtractExact(a, b);
    }

    public double power(double a, double b) {
        return Math.pow(a, b);
    }
}