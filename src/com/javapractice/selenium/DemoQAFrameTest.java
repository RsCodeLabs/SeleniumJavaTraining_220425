/*
package com.javapractice.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQAFrameTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/frames");

        // Maximize the browser window
        driver.manage().window().maximize();

        driver.switchTo().frame("frame1");
        WebElement heading = driver.findElements(By.id("sampleHeading")).get(0);
        String headingText = heading.getText();
        System.out.println("Heading Text: " + headingText);


        // Switch back to the default content
        driver.switchTo().defaultContent();
        WebElement alertsText = driver.findElement(By.xpath("//span[text()='Alerts']"));
        String alertsTextValue = alertsText.getText();
        System.out.println("Alerts Text: " + alertsTextValue);


    }
}
*/