package com.javapractice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAndKeyboardActionsExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();

        // Perform mouse actions here

        // Example: Move to an element, click, etc.
        Actions actions = new Actions(driver);
        // Example: Hover over an element
        WebElement computerMenu = driver.findElement(By.xpath("//ul[@class='top-menu']//a[normalize-space(text())='Computers']"));
        actions.moveToElement(computerMenu).perform();

        //2. Right Click
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        WebElement rightClickButton = driver.findElement(By.xpath("//span[text()='right click me']"));
        actions.contextClick(rightClickButton).perform();

        //3. Double Click
        WebElement doubleClickButton = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
        actions.doubleClick(doubleClickButton).perform();

        //handle Alert
        driver.switchTo().alert().accept();
        driver.get("https://demo.guru99.com/test/drag_drop.html");

        //Drag and Drop
        WebElement sourceBank = driver.findElement(By.id("credit2"));
        WebElement TargetAccount = driver.findElement(By.id("bank"));
        actions.dragAndDrop(sourceBank, TargetAccount).perform();

        //KeyBoard Actions - Shift
        driver.get("https://www.google.com/");
        WebElement searchBox = driver.findElement(By.name("q"));
        actions.moveToElement(searchBox).click()
                .keyDown(Keys.SHIFT)
                .sendKeys("selenium")
                .keyUp(Keys.SHIFT)
                .keyDown(Keys.ENTER)
                .build()
                .perform();
       // searchBox.sendKeys("selenium");







    }
}
