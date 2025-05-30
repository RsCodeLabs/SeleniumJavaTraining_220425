package com.javapractice.supriyaAssignments.java;

import java.util.LinkedHashSet;
import java.util.Set;

/*
Assignment:
Write a Java program that:
Uses an appropriate Set implementation to store usernames.
Adds usernames: "john123", "alice", "bob", "alice" (duplicate).
Prints all usernames in the order they were added.
Checks if "bob" exists in the set and prints the result.
Prints the total number of unique usernames.

 */
public class Assignment24Set {
    public static void main(String[] args) {
        Set<String> UserNameSet = new LinkedHashSet<>();
        UserNameSet.add("john123");
        UserNameSet.add("alice");
        UserNameSet.add("bob");
        UserNameSet.add("alice");
        System.out.println("Registered Usernames:  \n" + UserNameSet);
        if (UserNameSet.contains("bob"))
            System.out.println("Is 'bob' registered? true");
        else
            System.out.println("Is 'bob' registered? false");
        System.out.println("Total unique users:" + UserNameSet.size());
    }
}
