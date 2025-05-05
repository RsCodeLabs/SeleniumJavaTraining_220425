package com.javapractice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        // Using different locators to find elements
        //ID
        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        //Name
        driver.findElement(By.name("password")).sendKeys("secret_sauce");

//className
        driver.findElement(By.className("submit-button")).click();

        //LinkText
        driver.findElement(By.linkText("Twitter")).click();

        //PartialLinkText
        driver.findElement(By.partialLinkText("Linked")).click();

        //TagName
        driver.findElements(By.tagName("a"));


        //xpath
        driver.findElement(By.xpath("//a[@href='https://www.facebook.com/saucelabs']")).click();

        //cssSelector
        driver.findElement(By.cssSelector("a[href='https://www.facebook.com/saucelabs']")).click();






    }
}
