package com.javapractice.supriyaAssignments.selenium;
/*
Automate TVS Motor Online Booking Process
using Selenium
Category: Selenium WebDriver, Automation Testing, Java
Problem Statement:
You are tasked with automating the online vehicle booking flow on the
TVS Motor official website using Selenium WebDriver in Java. The
objective is to simulate a user navigating through the vehicle booking
process, handling elements like dropdowns, text inputs, checkboxes,
and verifying error messages for invalid input.
_______________________________

Requirements:
Write a Java program using Selenium WebDriver to perform the following steps:
Launch Chrome browser and navigate to https://www.tvsmotor.com/.
Print the page title.
Click on the "Buy Vehicle" link.
Select the TVS Jupiter model.
Wait for the page to fully load and scroll to the bottom.
Click the "DRUM SXC" tab.
Click the "Next" button to proceed.
Enter a location (e.g., "Delhi") and select "Dwarka,New Delhi" from
the dropdown.
Enter an invalid mobile number and print any error messages displayed.
Tick the "Get updates" checkbox and verify its selected state.
Enter only a first name (e.g., "Neha") in the name field and validate the error shown.
Enter an invalid email (e.g., "mk.gmail.com") and validate the error shown.
Accept the Privacy Policy by selecting the checkbox and verify its state.
Click the "Verify Mobile Number" button.
Close the browser.
________________________________
Constraints:

Use WebDriverWait instead of Thread.sleep wherever possible.
Use JavaScriptExecutor to scroll to elements when necessary.
Validate the presence and correctness of error messages where applicable.
Use XPath locators for identifying elements

 */

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import javax.xml.xpath.XPath;
import java.time.Duration;

public class Assignment4TVSMotors {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        /*
        driver.get("https://www.tvsmotor.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        //Print the page title.
        System.out.println("Title of the Page is:   "+ driver.getTitle());
        //Click on the "Buy Vehicle" link.
        WebElement BuyVehicle  = driver.findElement(By.xpath("//a[@href='https://www.tvsmotor.com/book-online']"));
        BuyVehicle.click();
*/
        driver.get("https://www.tvsmotor.com/book-online/booking-journey?106");
        //Select the TVS Jupiter model.

        //Wait for the page to fully load and scroll to the bottom.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        JavascriptExecutor js =  (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500);");
        //Scroll to the end
       // js.executeScript("window.scrollTo(0, document.body.scrollHeight);");


        //Click the "DRUM SXC" tab.
        WebElement DrumSXC  = driver.findElement(By.xpath("//a[@data-rr-ui-event-key='DRUM SXC']"));
        DrumSXC.click();

        //Click the "Next" button to proceed.
        WebElement NextButton  = driver.findElement(By.xpath("//button[text()='Next']"));
        NextButton.click();

        //Enter a location (e.g., "Delhi") and select "Dwarka,New Delhi" from
        //the dropdown.
        WebElement Location  = driver.findElement(By.xpath("//input[@name = 'pincode']"));
        Location.sendKeys("Delhi");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        WebElement LocationDD = driver.findElement(By.xpath("//input[@name='pincode']/../div/div[2]/div"));
        // Select the dropdown element
        Select LocationSelect = new Select(LocationDD);
        LocationSelect.selectByVisibleText("Dwarka,New Delhi"); //Dwarka,New Delhi
    }
}
