package com.startjava.graduation.bookshelf;

public class Book {
    private String author;
    private String title;
    private String published;

    public Book(String author, String title, String published) {
        this.author = author;
        this.title = title;
        this.published = published;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getPublished() {
        return published;
    }
}