package com.javapractice.OOPS;

public class myBook {
        String title="Default Book Title";
        String author ="Default Author";
        public myBook(){
            System.out.println("Default Book Created");
        }
        public myBook(String title, String author){
            System.out.println("Title : "+title+" Author : "+ author);
        }
        public void display(){
            System.out.println("Book details : "+this.title+"Author : "+this.author);
        }

    public static void main(String[] args) {
        myBook myBook1 = new myBook();
        myBook1.display();
        myBook myBook2 = new myBook("Java Basics","John Doe" );



    }

}
