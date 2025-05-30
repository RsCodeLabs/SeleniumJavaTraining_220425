package com.javapractice.collections.comparators;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DefaultComparatorExample {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("John", 75),
                new Student("Alice", 85),
                new Student("Bob", 65)
        );
        System.out.println("Original list:"+students);
        Collections.sort(students);
        System.out.println("Original list:"+students);

    }
}


class Student implements Comparable<Student> {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name + " - " + marks;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.marks, other.marks);
    }
}
