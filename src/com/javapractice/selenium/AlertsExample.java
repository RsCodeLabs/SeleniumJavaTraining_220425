package com.javapractice.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlertsExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/alerts");
        // JavaScript Alert
        WebElement simpleAlert = driver.findElement(By.id("alertButton"));
        simpleAlert.click();
        System.out.println("Switching to alert");
        Alert alert = driver.switchTo().alert();
        alert.accept();
        System.out.println("Accepted alert");

        ///Confirm Alert

        WebElement confirmAlert = driver.findElement(By.id("confirmButton"));
        confirmAlert.click();
        System.out.println("Switching to alert");
        Alert alert1 = driver.switchTo().alert();
        alert1.dismiss();
        System.out.println("Dismissed alert");

        //Prompt alert
        WebElement promptAlert = driver.findElement(By.id("promtButton"));
        promptAlert.click();
        System.out.println("Switching to alert");
        Alert alert2= driver.switchTo().alert();
        alert2.sendKeys("Test");
        alert2.accept();







    }
}
