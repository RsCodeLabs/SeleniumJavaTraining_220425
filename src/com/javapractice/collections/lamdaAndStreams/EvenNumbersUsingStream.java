package com.javapractice.collections.lamdaAndStreams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class EvenNumbersUsingStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

      List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0) // Filter even numbers
                .collect(Collectors.toList());

        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("numbers: " + numbers);



    }


}
