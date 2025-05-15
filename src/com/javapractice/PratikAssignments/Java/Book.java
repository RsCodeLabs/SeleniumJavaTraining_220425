package com.javapractice.PratikAssignments.Java;

public class Book {
    String title;
    String author;

    public Book()
    {
        System.out.println("Default Book Created");
    }

    public Book(String title, String author)
    {
        this.title = title;
        this.author = author;
        System.out.println("Book Created with Title: " + title + " and Author: " + author);
    }

    public void bookDetails(String title, String author)
    {
        System.out.println("Book Created with Title: " + title + " and Author: " + author);
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java", "John");
        b1.bookDetails("Python", "Sena");
    }
}
