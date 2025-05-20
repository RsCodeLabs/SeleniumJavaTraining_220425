package com.javapractice.ExceptionHandling;

public class Registration {

    public  void registerUser(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("User is underage. Registration failed.");
        } else {
            System.out.println("User registered successfully.");
        }
    }

    public static void main(String[] args) throws InvalidAgeException {
        Registration registration = new Registration();

            registration.registerUser(16);

    }
}
