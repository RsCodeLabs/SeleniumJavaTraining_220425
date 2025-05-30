package com.javapractice.collections.comparators;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomComparatorExmaple {
    public static void main(String[] args) {
        List<Student2> students = Arrays.asList(
                new Student2("Charlie", 70),
                new Student2("Alice", 90),
                new Student2("Alice", 60),
                new Student2("Bob", 80)
        );

        System.out.println("Original list:"+students);
        // Sorting using custom comparator
        Collections.sort(students,new MultiFiledComparator());

        System.out.println("Original list:"+students);
    }

}

class MultiFiledComparator implements Comparator<Student2> {

    @Override
    public int compare(Student2 o1, Student2 o2) {
      //  return o1.name.compareTo(o2.name); // Sort by name
        int nameCompare = o2.name.compareTo(o1.name);
        if(nameCompare!=0){
            return nameCompare;
        }
        else{
            return Integer.compare(o2.marks, o1.marks); // Sort by marks
        }
    }
}



