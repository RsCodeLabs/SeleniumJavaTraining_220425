package com.javapractice.collections.set;


import java.util.TreeSet;

import java.util.Set;

public class TreeSetExample {

    public static void main(String[] args) {

        // Create an Set
        TreeSet<Number> numbers = new TreeSet<>();

        // Add elements to the Set

        numbers.add(50);
        numbers.add(20);
        numbers.add(70);
        numbers.add(40);
        numbers.add(90);


        // Print the Set
        System.out.println("TreeSet: " + numbers);

        //first and last
        System.out.println("First Element: " + numbers.first());  //20
        System.out.println("Last Element: " + numbers.last()); //90

        //Higher and lower
        System.out.println("Higher than 45: " + numbers.higher(45));//50
        System.out.println("Lower than 40: " + numbers.lower(45));//40

        //Ceiling and floor
        System.out.println("Ceiling of 45: " + numbers.ceiling(45));//50
        System.out.println("Floor of 45: " + numbers.floor(23));//

        //Subset
        System.out.println("Subset from 20 to 70: " + numbers.subSet(20, 77)); //20, 40, 50,

        //HeadSet
        System.out.println("HeadSet till 50: " + numbers.headSet(50)); //20, 40

        //TailSet
        System.out.println("TailSet from 50: " + numbers.tailSet(50)); //50, 70, 90

        //Poll first and last
        System.out.println("Poll First: " + numbers.pollFirst()); //20
        System.out.println("Poll Last: " + numbers.pollLast()); //90
        // Print the Set after poll
        System.out.println("TreeSet after poll: " + numbers);





    }
}
