package com.javapractice.assignmentsAfterClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*Programming Question: Practice All Selenium Locator Types
Objective:
Automate a test case on a real-time website using all types of Selenium locators.
Target Website:
https://www.demoblaze.com/

Problem Statement:
Write a Selenium automation script in Java that interacts with the UI elements on https://www.demoblaze.com/ using the following 7 locator strategies:

id
name
className
linkText
partialLinkText
cssSelector
xpath

Steps to Follow:
1. Open the website: https://www.demoblaze.com/
2. Use id locator to click the "Log in" button on the top menu.
3. Use name locator to enter a username in the login popup. (If the name attribute is not present, simulate one by locating another element that does use it or explain the fallback.)
4. Use className locator to click the close button of the login popup.
5. Use linkText locator to click on the "Phones" category in the left sidebar.
6. Use partialLinkText locator to click on a phone product that contains the word "Nok" (e.g., "Nokia").
7. Use cssSelector locator to click on the "Add to cart" button for that product.
8. Use xpath locator to click on the "Cart" link in the top menu.

Expected Output:
Script should perform all steps and land on the cart page successfull*/

public class LocatorsAssignment {

    public static void main(String[] args) throws InterruptedException{


        WebDriver driver = new ChromeDriver();
        //1. Open the website: https://www.demoblaze.com/
        driver.get("https://www.demoblaze.com/");
        driver.manage().window().maximize();

        //2. Use id locator to click the "Log in" button on the top menu.
        driver.findElement(By.id("login2")).click();
        Thread.sleep(2000);

        //3. Use name locator to enter a username in the login popup.(using xpath as name is not present)
        WebElement username = driver.findElement(By.xpath("//input[@id='loginusername']"));
        username.sendKeys("USERNAME");
        Thread.sleep(2000);

        //4. Use className locator to click the close button of the login popup.
        WebElement closeButton = driver.findElements(By.className("btn-secondary")).get(2);
        closeButton.click();

        //5. Use linkText locator to click on the "Phones" category in the left sidebar.
        WebElement phonesLink= driver.findElement(By.linkText("Phones"));
        phonesLink.click();
        Thread.sleep(2000);

        //6. Use partialLinkText locator to click on a phone product that contains the word "Nok" (e.g., "Nokia").
        driver.findElement(By.partialLinkText("Nok")).click();
        Thread.sleep(2000);

        //7. Use cssSelector locator to click on the "Add to cart" button for that product.
        driver.findElement(By.cssSelector("a[class='btn btn-success btn-lg']")).click();
        //driver.findElement(By.xpath("//a[@id='cartur']")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();

        //8. Use xpath locator to click on the "Cart" link in the top menu.
        driver.findElement(By.xpath("//a[text()='Cart']")).click();

        driver.quit();

    }
}

/* Improvement Done :
Added proper step-wise comments and clearly aligned them with locator types.
Simulated name locator with a reasonable fallback (XPath) and explained it.

Used className with get(index) to handle duplicate class names properly.
Included Thread.sleep for better UI sync (though using WebDriverWait is better for production).
Handled the JavaScript alert using driver.switchTo().alert().accept();.
Added driver.quit() to properly close the session.
 */