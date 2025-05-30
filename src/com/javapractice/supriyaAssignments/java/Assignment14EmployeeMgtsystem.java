package com.javapractice.supriyaAssignments.java;

public class Assignment14EmployeeMgtsystem {
   /* The base class Employee should have fields like name and empId, and a method work().
    A Manager class should extend Employee and have a method manageTeam().
    A Developer class should extend Employee and have a method writeCode().
    Demonstrate calling methods for both manager and developer in the main() method.
*/
   public static void main(String[] args) { //Demonstrate calling methods for both manager and developer in the main() method.
       Manager manager= new Manager();
       manager.manageTeam();
       manager.work("Srinidhi","EMP12345");
       Developer dev = new Developer();
       dev.writeCode();
       dev.work("Saanvi", "EMP3456");
   }
}

class Employee {// The base class Employee should have fields like name and empId, and a method work().
    String name;
    String empId;
    public void work(String name, String empId) {
        System.out.println("Work method in Employee class");
        System.out.println("Name of the Employee: "+name +"  Employee ID is : " +empId);
    }
}

class Manager extends Employee {//A Manager class should extend Employee and have a method manageTeam().
    void manageTeam(){
        System.out.println("Manage team method in Manager class");
    }
}

class Developer extends Employee {//A Developer class should extend Employee and have a method writeCode()
    void writeCode(){
        System.out.println("Write code method in Developer class");
    }
}