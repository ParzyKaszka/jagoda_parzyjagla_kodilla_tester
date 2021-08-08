package com.kodilla.inheritance.homework;

public class SystemApp {
    public static void main(String[] args) {
        Windows7 windows7 = new Windows7();
        windows7.turnOn();
        windows7.turnOff();
        IOS10 ios10 = new IOS10();
        ios10.turnOn();
        ios10.turnOff();
    }
}