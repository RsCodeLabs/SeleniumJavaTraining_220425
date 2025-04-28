package com.javapractice.Homework;

public class Teacher {
    String name;
    String subject;
    int experience;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Subject: " + subject);
        System.out.println("Years of Experience: " + experience);
    }

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        teacher1.name = "Sarah";
        teacher1.subject = "Maths";
        teacher1.experience = 10;

        Teacher teacher2 = new Teacher();
        teacher2.name = "Sarah";
        teacher2.subject = "Science";
        teacher2.experience = 4;

        Teacher teacher3 = new Teacher();
        teacher3.name = "Mala";
        teacher3.subject = "English";
        teacher3.experience = 8;

        teacher1.display();
        teacher2.display();
        teacher3.display();
    }
}