package com.javapractice.supriyaAssignments.java;

public class Assignment2TeacherDetails {

        String name;
        String subject;
        int experience;

    public static void main(String[] args) {
        //Object creation
        Assignment2TeacherDetails teacher1 =new Assignment2TeacherDetails();
        Assignment2TeacherDetails teacher2 =new Assignment2TeacherDetails();
        Assignment2TeacherDetails teacher3 =new Assignment2TeacherDetails();

        //Initialization of the values
        teacher1.name = "Supriya";
        teacher1.subject = "Math";
        teacher1.experience = 10;
        teacher2.name = "Shiva";
        teacher2.subject = "Science";
        teacher2.experience = 15;
        teacher3.name = "Srinidhi";
        teacher3.subject = "Computers";
        teacher3.experience = 5;

        //Printing the details of the Teachers
        System.out.println("Name: "+teacher1.name +", Subject: "+teacher1.subject + ", Years of experience: "+teacher1.experience);
        System.out.println("Name: "+teacher2.name +", Subject: "+teacher2.subject + ", Years of experience: "+teacher2.experience);
        System.out.println("Name: "+teacher3.name +", Subject: "+teacher3.subject + ", Years of experience: "+teacher3.experience);
    }

}
