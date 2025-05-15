package com.javapractice.assignmentsAfterClass;

/*
    Assignment 3 : Write a Java class Book that includes:
•   A default constructor that prints "Default Book Created"
•   A parameterized constructor that accepts title and author
•   A method display() to print book details
________________________________________
🔰 Expected Output:
Default Book Created
Book Title: Java Basics, Author:John Doe
*/

    public class Book {

        Book() {        // Default Constructor is called when ever a object is created
            System.out.println("Default Book Created");
        }
        public void Book(String a, String b) {        // Parameterised Constructor
           System.out.println("In Parameterised Constructor : Title of the Book is " + a);
           System.out.println("In Parameterised Constructor: Author of the Book is " + b);
        }
        public void display(String x,String y) {        // Method displaying the Book details

            System.out.println("In Display method: Title of the Book is " + x);
            System.out.println("In Display method: Author of the Book is " + y);
        }


        public static void main(String[] args) {
            Book obj = new Book(); // Constructor gets called automatically
            obj.Book("HARRY POTTER", "JK Rowling");
            obj.display("RICH DAD POOR DAD", "Robert Kiyosaki");
        }
    }
