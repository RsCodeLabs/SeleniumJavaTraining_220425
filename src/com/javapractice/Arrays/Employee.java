package com.javapractice.Arrays;

public class Employee {
    String empID ;
    String empName;
    String empAddress;

    public Employee(String id, String name, String Address){ // Constructor
        this.empID=id;
        this.empName=name;
        this.empAddress=Address;
    }
    public void printEmployeeDetails(){   //Method
        System.out.println(empID+empName+empAddress);
    }


    //Object Creation
    public static void main(String[] args) {

        Employee e1 = new Employee("13","Ravi","Hyderabad");
        e1.printEmployeeDetails();
        Employee e2 = new Employee("12","Kumar","USA");
        e2.printEmployeeDetails();
    }


}
