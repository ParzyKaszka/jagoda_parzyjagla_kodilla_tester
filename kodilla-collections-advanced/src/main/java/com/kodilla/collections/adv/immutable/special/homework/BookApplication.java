package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();
        Book firstBook = bookManager.createBook("Malowany człowiek", "Peter V. Brett");
        Book secondBook = bookManager.createBook("Christine", "Stephen King");
        Book thirdBook = bookManager.createBook("Malowany człowiek", "Peter V. Brett");

        System.out.println(firstBook == secondBook);
        System.out.println(firstBook == thirdBook);
        System.out.println(secondBook == thirdBook);
    }
}