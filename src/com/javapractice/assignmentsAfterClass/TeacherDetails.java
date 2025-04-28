package com.javapractice.assignmentsAfterClass;

public class TeacherDetails {

        String name;
        String subject;
        int experience;

    public static void main(String[] args) {
        //Object creation
        TeacherDetails teacher1 =new TeacherDetails();
        TeacherDetails teacher2 =new TeacherDetails();
        TeacherDetails teacher3 =new TeacherDetails();

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
