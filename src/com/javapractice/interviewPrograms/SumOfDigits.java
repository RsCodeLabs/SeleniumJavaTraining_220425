package com.javapractice.interviewPrograms;

import static org.openqa.selenium.remote.http.Contents.string;

public class SumOfDigits {
    public static void main(String[] args) {
        int num = 340;
        int sum = 0;
        boolean firstDigitReached = false;
        int lastDigit = 0;
        int removeLastDigit;

        while (num != 0) {
            lastDigit = num % 10;
            sum = sum + lastDigit;
            num = num / 10;
        }

        System.out.println("sum of digits: "+sum);
    }
}
