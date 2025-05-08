package com.javapractice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigationAndGetMethodsExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demowebshop.tricentis.com/");
        driver.navigate().to("https://demowebshop.tricentis.com/login");
        WebElement loginText = driver.findElement(By.xpath("//Strong[text()='New Customer']/../following-sibling::div[@class='text']"));
        ////Strong[text()='New Customer']/../following-sibling::div[@class='text']
        String description = loginText.getText();
        System.out.println("Login Text: " + description);
        WebElement register = driver.findElement(By.linkText("Register"));
        String link = register.getDomAttribute("href");
        System.out.println("Link: " + link);
        String color = register.getCssValue("color");
        System.out.println("Color: " + color);
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.close();
    }
}
