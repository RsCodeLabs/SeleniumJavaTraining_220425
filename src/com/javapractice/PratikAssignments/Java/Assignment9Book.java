package com.javapractice.PratikAssignments.Java;

/*
    Assignment 9 : Write a Java class Book that includes:
•   A default constructor that prints "Default Book Created"
•   A parameterized constructor that accepts title and author
•   A method display() to print book details
________________________________________
🔰 Expected Output:
Default Book Created
Book Title: Java Basics, Author:John Doe
*/

public class Assignment9Book {
    String title;
    String author;

    public Assignment9Book()
    {
        System.out.println("Default Book Created");
    }

    public Assignment9Book(String title, String author)
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
        Assignment9Book b1 = new Assignment9Book();
        new Assignment9Book("Java", "John");
        b1.bookDetails("Python", "Sena");
    }
}
