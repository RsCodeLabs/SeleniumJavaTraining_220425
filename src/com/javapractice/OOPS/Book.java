package com.javapractice.OOPS;

public class Book {
        String title="Default Book Title";
        String author ="Default Author";
        public Book(){
            System.out.println("Default Book Created");
        }
        public Book(String title, String author){
            System.out.println("Title : "+title+" Author : "+ author);
        }
        public void display(){
            System.out.println("Book details : "+this.title+"Author : "+this.author);
        }

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.display();
        Book book2 = new Book("Java Basics","John Doe" );



    }

}
