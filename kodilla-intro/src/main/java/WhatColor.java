import java.util.Scanner;

public class WhatColor {
    public String getColor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the first letter of a color?");
        String color = scanner.nextLine().toUpperCase();
        switch (color) {
            case "Y":
                return "Yellow";
            case "B":
                return "Blue";
            case "O":
                return "Orange";
            case "P":
                return "Pink";
            case "G":
                return "Green";
            case "W":
                return "White";
            default:
                return "It's not color";
        }
    }
}