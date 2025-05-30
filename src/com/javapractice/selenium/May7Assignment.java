package com.javapractice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class May7Assignment {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get(" https://demoqa.com/automation-practice-form");
        Thread.sleep(2000);
        driver.manage().window().maximize();
/*
        Fill the following fields:

        First Name

        id="firstName"

        Last Name
        id="lastName"

        Email
        id="userEmail"

        Select gender (radio button)

        Select any value from the "State" dropdown at the bottom

        Use browser navigation:

        Refresh the page

        Navigate to https://demoqa.com

        Navigate back to the form

        Navigate forward again to demoqa.com

        */

    }
}
