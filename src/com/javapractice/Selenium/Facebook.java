package com.javapractice.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();

//        driver.findElement(By.xpath(By.xpath()));



//       //abosulte xpath
//        WebElement email = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input"));
//        email.sendKeys("deepaly4irkal@gmail.com");
//        email.clear();
//        // relative xpath
//        WebElement email1 = driver.findElement(By.xpath("input[@id='email']"));
//        email1.sendKeys("deepaly4irkal@gmail.com");
//
//        //relative xpath with other atributes placeholder

        //contains

        //
    }
}
