package com.javapractice.PratikAssignments.Java;

class Employee
{
    String name;
    int empId;

    public Employee(String name, int empId)
    {
        System.out.println("Employee Name: " + name + " and Employee ID: " + empId);
    }

    public void work()
    {
        System.out.println("Employee is working");
    }
}

class Manager extends Employee
{
    public Manager(String name, int empId) {
        super(name, empId);
    }

    public void manageTeam()
    {
        System.out.println("Manager is managing the team");
    }
}

class Developer extends Employee
{
    public Developer(String name, int empId) {
        super(name, empId);
    }

    public void writeCode()
    {
        System.out.println("Developer is writing code");
    }
}

public class Assignment14EmployeeInheritanceRealTimeEx {
    public static void main(String[] args) {
        Manager m = new Manager("John", 101);
        m.work();

        Developer d = new Developer("Bob", 102);
        d.work();
    }
}
