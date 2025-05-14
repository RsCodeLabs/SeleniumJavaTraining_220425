package com.javapractice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWaitExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");


        //remove checkbox
      WebElement removeButton = driver.findElement(By.xpath("//button[text()='Remove']"));
        removeButton.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

          WebElement message = driver.findElement(By.id("message"));
        System.out.println("Message is :"+ message.getText());

        //add checkbox
        WebElement addButton = driver.findElement(By.xpath("//button[text()='Add']"));
        addButton.click();
        WebElement checkbox = driver.findElement(By.id("checkbox"));
        checkbox.click();
        System.out.println(checkbox.isDisplayed());

        //
WebElement enableButton = driver.findElement(By.xpath("//button[text()='Enable']"));
enableButton.click();
WebElement inputBox = driver.findElement(By.xpath("//input[@type='text']"));
inputBox.sendKeys("Ravi");



















    }
}
