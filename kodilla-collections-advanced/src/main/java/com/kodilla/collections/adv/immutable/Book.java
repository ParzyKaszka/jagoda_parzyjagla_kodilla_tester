package com.kodilla.collections.adv.immutable;

public class Book {
    public String author;
    public String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
}