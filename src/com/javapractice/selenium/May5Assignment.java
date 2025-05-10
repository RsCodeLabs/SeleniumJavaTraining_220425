package com.javapractice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class May5Assignment {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/");
        driver.manage().window().maximize();
        /*
        5. Use linkText locator to click on the "Phones" category in the left sidebar.
        6. Use partialLinkText locator to click on a phone product that contains the word "Nok" (e.g., "Nokia").
        7. Use cssSelector locator to click on the "Add to cart" button for that product.
        8. Use xpath locator to click on the "Cart" link in the top menu. */
        WebElement PhonesLink= driver.findElement(By.linkText("Phones"));
        PhonesLink.click();
        Thread.sleep(3000);
        driver.findElement(By.partialLinkText("Nok")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("a[class='btn btn-success btn-lg']")).click();
        //driver.findElement(By.xpath("//a[@id='cartur']")).click();
        Thread.sleep(3000);
        /*Steps to Follow:
        1. Open the website: https://www.demoblaze.com/
        2. Use id locator to click the "Log in" button on the top menu.
        3. Use name locator to enter a username in the login popup. (If the name attribute is not present, simulate one by locating another element that does use it or explain the fallback.)
        4. Use className locator to click the close button of the login popup.*/

        //Login related
        driver.findElement(By.id("login2")).click();
        WebElement username = driver.findElement(By.xpath("//input[@id='loginusername']"));
        username.sendKeys("USERNAME");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@onclick='logIn()']")).click();

    }
}
