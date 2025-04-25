package com.javapractice.identifiers;

public class EmployeeTaxInfo {
    public static void main(String[] args) {
        // Declaring employee details
        int employeeId = 101;
        String employeeName = "Sneha";
        double monthlySalary = 50000.0;
        float taxRate = 10.5f;  // in percent
        boolean isPermanent = true;

        // Calculations
        double annualSalary = monthlySalary * 12;
        double annualTax = (annualSalary * taxRate) / 100;

        // Display output
        System.out.println("Employee Details:");
        System.out.println("ID             : " + employeeId);
        System.out.println("Name           : " + employeeName);
        System.out.println("Monthly Salary : " + monthlySalary);
        System.out.println("Annual Salary  : " + annualSalary);
        System.out.println("Tax Rate       : " + taxRate + "%");
        System.out.println("Annual Tax     : " + annualTax);
        System.out.println("Permanent?     : " + isPermanent);
    }
}
