package com.javapractice.collections;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        //Creating a linked list
       LinkedList<String> colors =  new LinkedList<>();

       colors.add("Red");
         colors.add("Green");
            colors.add("Blue");
            colors.add("Yellow");
        System.out.println("Linked List: " + colors);

        //Adding an element at the first position
        colors.addFirst("Pink");

        //Adding an element at the last position
        colors.addLast("Black");

        System.out.println("After adding elements: " + colors);

        //Removing the first element
        colors.removeFirst();
        //Removing the last element
        colors.removeLast();
        System.out.println("After removing elements: " + colors);

        //contains
        if(colors.contains("Red")) {
            System.out.println("Linked List contains Red");
        }

        //Getting the first element
        String firstElement = colors.getFirst();
        System.out.println("First element: " + firstElement);

        //Getting the last element
        String lastElement = colors.getLast();
        System.out.println("Last element: " + lastElement);

        //Getting the size of the linked list
        int size = colors.size();
        System.out.println("Size of linked list: " + size);
        //Iterating through the linked list
        System.out.println("Iterating through the linked list:");
        for (String color : colors) {
            System.out.println(color);
        }
        //Clearing the linked list
        colors.clear();
        System.out.println("After clearing the linked list: " + colors);







    }
}
