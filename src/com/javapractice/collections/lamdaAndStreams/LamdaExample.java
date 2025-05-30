package com.javapractice.collections.lamdaAndStreams;

import java.util.Arrays;
import java.util.List;

public class LamdaExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ravi", "Raju", "Ramesh", "Rajesh");

        //Traditional for loop to print names
      /*  for(String name : names) {
            System.out.println(name);
        }
*/
        // Using lambda expression to print names
        names.forEach(name -> System.out.println(name));

    }
}
