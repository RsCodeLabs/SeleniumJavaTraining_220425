package com.javapractice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollActionsDemo {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com");

        driver.manage().window().maximize();

        JavascriptExecutor js =  (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500);");
        js.executeScript("window.scrollBy(0, -200);");

        // Scroll to the right
        js.executeScript("window.scrollBy(500, 0);");

        //Scroll to the end
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

        Thread.sleep(5000);


        //Scroll to an Element
        WebElement widget = driver.findElement(By.xpath("//h5[text()='Widgets']"));
        js.executeScript("arguments[0].scrollIntoView(true);",widget);

        //Hilight the element to verify Scroll
        js.executeScript("arguments[0].style.border='3px solid red'", widget);





    }
}
