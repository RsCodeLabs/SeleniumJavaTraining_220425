package com.javapractice.supriyaAssignments.java;

import java.util.HashMap;
import java.util.Map;

/*
Java Assignment 25:
Real-Time Basic Assignment Program (Using HashMap)
Scenario:
Create a simple contact list where each contact has a unique ID (key) and a name (value). You will:
Add contacts
Retrieve a contact by ID
Remove a contact
Check if a contact exists
Display all contacts
Sample Output:
All Contacts: {101=Alice, 102=Bob, 103=Charlie}
Contact with ID 102: Bob
Contacts after removal: {101=Alice, 102=Bob}
Is contact with ID 101 present? true
Is contact with ID 103 present? false

 */
public class Assignment25HashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        //Add contacts
        hashMap.put(101, "Alice");
        hashMap.put(102, "Bob");
        hashMap.put(103, "Charlie");
        System.out.println("All Contacts:" + hashMap);
        //Retrieve a contact by ID
        String ContactName = hashMap.get(102);
        System.out.println("Contact with ID 102:" + ContactName);
        //Remove a contact
        hashMap.remove(102);
        System.out.println("Removed the Contact details of ID 102,Bob ");
        System.out.println("Contacts after removal:" + hashMap);
        //Check if a contact exists
        if (hashMap.containsKey(102))
            System.out.println("Is contact with ID 102 present? true");
        else System.out.println("Is contact with ID 102 present? false");
        // System.out.println("The updated list is :"+hashMap);

        //Iterating through the hashmap
        System.out.println("Iterating through the elements in the hashmap:");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
           // System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        //Check if a contact exists
        if (hashMap.containsKey(entry.getKey())) {
            System.out.println("Is contact with ID " + (entry.getKey()) +" present? true");
        }
        else {
            System.out.println("Is contact with ID "+(entry.getKey()) +" present? true");
        }
    }
    }

}