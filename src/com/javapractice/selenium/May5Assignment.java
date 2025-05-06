package com.javapractice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class May5Assignment {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/");
        //driver.manage().window().maximize();
        driver.findElement(By.id("login2")).click();
        driver.findElement(By.id("loginusername")).sendKeys("psupriya");
        //driver.findElement(By.className("btn btn-secondary")).click(); //Doesn't work!!
        driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[1]")).click();
        driver.findElement(By.linkText("Phones")).click();
        driver.findElement(By.partialLinkText("Nok")).click();
        driver.findElement(By.cssSelector("btn btn-success btn-lg")).click();
        driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[4]/a")).click();
    }
}
