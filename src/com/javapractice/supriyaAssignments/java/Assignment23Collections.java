package com.javapractice.supriyaAssignments.java;
/*
Create a Java program to simulate a To-Do List Manager using ArrayList, without any user input. Your program should demonstrate common ArrayList methods such as add(), set(), remove(), size(), contains(), indexOf(), and clear().

🔸 Requirements:
Create an ArrayList<String> to store to-do tasks.
Add the following tasks:
"Buy groceries"
"Pay electricity bill"
"Finish Java assignment"
"Call the doctor"
Display the full list of tasks.
Update "Pay electricity bill" to "Pay internet bill" using set() and indexOf().
Remove "Buy groceries" using remove().
Check if "Finish Java assignment" is in the list using contains().
Display the number of tasks using size().
Display the index of "Call the doctor" using indexOf().
Clear the entire task list using clear().
Show that the list is empty.
 */

import java.util.ArrayList;

public class Assignment23Collections {
    public static void main(String[] args) {

        ArrayList<String> ToDoList = new ArrayList<>();
        ToDoList.add("Buy groceries");
        ToDoList.add("Pay electricity bill");
        ToDoList.add("Finish Java assignment");
        ToDoList.add("Call the doctor");

        System.out.println("Original Tasks: \n" +ToDoList);
        int IndexX= ToDoList.indexOf("Pay electricity bill");
        ToDoList.set(IndexX,"Pay internet bill");
        System.out.println("After update of Pay electricity bill to Pay internet bill");
        System.out.println("Updated List :" +ToDoList);
        ToDoList.remove("Buy groceries");
        System.out.println("After deleting Buy groceries from TO DO List");
        System.out.println("Updated List :" +ToDoList);
        boolean IsTrue = ToDoList.contains("Finish Java assignment");
        if (IsTrue)
        {
            System.out.println("Is 'Finish Java assignment' in the list? true");
        }
        else
        {
            System.out.println("Is 'Finish Java assignment' in the list? false");
        }
        int NumTasks = ToDoList.size();
        System.out.println("Total tasks : " +NumTasks);

        int IndexDr= ToDoList.indexOf("Call the doctor");
        System.out.println("Index of 'Call the doctor' is = " +IndexDr);

        ToDoList.clear();
        System.out.println("After clearing, tasks: " +ToDoList);
        boolean IsEmpty = ToDoList.isEmpty();
        if (IsEmpty)
        {
            System.out.println("Is list empty? : true");
        }
        else
        {
            System.out.println("Is list empty? : false");
        }
    }

}
