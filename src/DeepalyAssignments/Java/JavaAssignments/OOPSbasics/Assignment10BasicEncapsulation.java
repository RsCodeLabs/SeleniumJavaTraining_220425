/***
 * Encapsulation:
 * Java Assignment 10:
 * Title: Student Details Management
 * Objective: Use private fields and public getters/setters to control access to data.
 * 🔧 Requirements:
 * Create a class Student with private fields:
 * name (String)
 * age (int)
 * Add public getter and setter methods for both fields.
 * In the main() method:
 * Create an object of Student
 * Set name and age
 * Print the values using getter methods
 * ✅ Expected Output:
 * Student Name: John
 * Student Age: 20
 */
package DeepalyAssignments.Java.JavaAssignments.OOPSbasics;
public class Assignment10BasicEncapsulation {
    private String name;
    private int age;

    public Assignment10BasicEncapsulation(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        System.out.println("Student Name : " + name);
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public int getAge(){
        System.out.println("Student Age : "+age);
        return age;
    }
    
    public void setAge(int age){
        this.age = age;
    }

    public static void main(String[] args) {
    
        Assignment10BasicEncapsulation student = new Assignment10BasicEncapsulation("Deepaly",9);
        System.out.println("Initial Name and Age values from getter methods: ");
        student.getName();
        student.getAge();
        System.out.println("After updating the Name and Age values using setter methods and then displaying the new values using getter methods: ");
        student.setName("John");
        student.setAge(20);
        student.getName();
        student.getAge();


    }
}
