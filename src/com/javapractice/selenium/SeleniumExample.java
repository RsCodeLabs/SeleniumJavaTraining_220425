package com.javapractice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumExample {
    public static void main(String[] args) {
        //1. Open Chrome  -- Create An Object  of Browser Driver
        //2. Enter URL as https://www.saucedemo.com/
       // 3. Enter username as standard_user
        //4. Enter password as secret_sauce
        //5. Click on login button



        //For performing any browser Action
        // 1) We need to know what is the field we need to operate on
       // 2) We need to know the action we need to perform on that field



        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();








    }
}
