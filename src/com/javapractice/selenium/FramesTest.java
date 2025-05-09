package com.javapractice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");

        //switch to Frame
        driver.switchTo().frame(0);
        System.out.println("Switched to frame using Index");



        driver.switchTo().defaultContent();
        WebElement runButton = driver.findElement(By.id("runbtn"));
        runButton.click();



        //Switch to frame using name or id
        driver.switchTo().frame("iframeResult");
        System.out.println("Switched to frame using name");
        driver.switchTo().defaultContent();
        runButton.click();

        //Switch to frame using WebElement
        WebElement iframeElement = driver.findElement(By.id("iframeResult"));
        driver.switchTo().frame(iframeElement);
        System.out.println("Switched to frame using webelement");
        driver.switchTo().defaultContent();










    }
}
