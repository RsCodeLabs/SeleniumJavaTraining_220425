package com.javapractice.Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
public class LocatorsExample {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--incognito");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        // Using different locators to find elements
        //ID
        driver.findElement(By.id("user-name")).sendKeys("visual_user");

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
