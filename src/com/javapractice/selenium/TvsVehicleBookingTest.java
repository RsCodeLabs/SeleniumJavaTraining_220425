package com.javapractice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/*
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
Enter only a first name (e.g., "Neha") in the name field and validate
the error shown.
Enter an invalid email (e.g., "mk.gmail.com") and validate the error shown.
Accept the Privacy Policy by selecting the checkbox and verify its state.
Click the "Verify Mobile Number" button.
Close the browser.

* */
public class TvsVehicleBookingTest {
    public static void main(String[] args) {
        //Launch The Driver
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tvsmotor.com/");


        //Print the page title
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);

        //Maximize the browser window
        driver.manage().window().maximize();

        //Click on the "Buy Vehicle" link
        WebElement buyVehicleLink = driver.findElement(By.xpath("//a[contains(@href,'book-online')]"));
        buyVehicleLink.click();


        //Select the TVS Jupiter model
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement motorLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[text()='TVS Jupiter'])[1]")));
        motorLink.click();


        JavascriptExecutor js = (JavascriptExecutor) driver;

        //Wait for the page to fully load
        wait.until(driver1 -> js.executeScript("return document.readyState").equals("complete"));

        //scroll to the bottom
        js.executeScript("window.scrollTo(0, -document.body.scrollHeight)");

        //Click the "DRUM SXC" tab
        WebElement vehicleModel = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-rr-ui-event-key='DRUM SXC']")));
        vehicleModel.click();

        //Click the "Next" button to proceed
        WebElement NextButton  = driver.findElement(By.xpath("//button[text()='Next']"));
        NextButton.click();

        //Enter a location (e.g., "Delhi") and select "Dwarka,New Delhi" from
        //the dropdown.


      WebElement selectLocation = wait.until(ExpectedConditions.elementToBeClickable(By.name("pincode")));
      selectLocation.sendKeys("Delhi");

        WebElement locationOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Dwarka,New Delhi']")));
        locationOption.click();
        System.out.println("Location is selected: " + locationOption.getText());

        //enter an invalid mobile number and print any error messages displayed
        WebElement mobileNumber = driver.findElement(By.name("mobile"));
        mobileNumber.sendKeys("123");

        WebElement mobileNumberErrorMessage = driver.findElement(By.xpath("//input[@name='mobile']/following-sibling::span"));
        String errorText = mobileNumberErrorMessage.getText();
        System.out.println("Error displaying for Mobile Number: " + errorText);

        //Tick the "Get updates" checkbox and verify its selected state
        WebElement updatesCheckBox = driver.findElement(By.name("updates"));
        updatesCheckBox.click();
        System.out.println("Updates checkbox is selected: " + updatesCheckBox.isSelected());

        //Enter only a first name (e.g., "Neha") in the name field and validate
        WebElement fullName = driver.findElement(By.name("name"));
        fullName.sendKeys("Neha");

        WebElement fullNameError = driver.findElement(By.xpath("//input[@name='name']/following-sibling::span"));
        System.out.println("Error displaying for Full Name: " + fullNameError.getText());


        //Enter an invalid email (e.g., "mk.gmail.com") and validate the error shown
        WebElement emailId = driver.findElement(By.name("email"));
        emailId.sendKeys("mk.gmail.com");

        WebElement emailError = driver.findElement(By.xpath("//input[@name='email']/following-sibling::span"));
        System.out.println("Error displaying for Email ID: " + emailError.getText());

        WebElement privacyPolicyCheckBox = driver.findElement(By.id("checkbox-input-privacy"));
        //Accept the Privacy Policy by selecting the checkbox and verify its state
        privacyPolicyCheckBox.click();
        System.out.println("Is Privacy Checkbox selected: " + privacyPolicyCheckBox.isSelected());


        //Click the "Verify Mobile Number" button
        WebElement verifyMobileButton = driver.findElement(By.xpath("//button[text()='Verify Mobile Number']"));
        verifyMobileButton.click();

        //Close the browser
        driver.quit();




































    }
}
