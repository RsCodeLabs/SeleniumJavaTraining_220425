package com.javapractice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorTypesDemoBlaze {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        try {
            // Step 1: Open the website
            driver.get("https://www.demoblaze.com/");
            driver.manage().window().maximize();
            Thread.sleep(1000);

            // Step 2: Use 'id' locator to click "Log in"
            WebElement loginButton = driver.findElement(By.id("login2"));
            loginButton.click();
            Thread.sleep(1000);

            // Step 3: Use 'name' locator (fallback: no name, using XPath with name-like behavior)
            // Login fields on demoblaze do not have a name, so simulate the use of name via XPath
            WebElement username = driver.findElement(By.xpath("//input[@id='loginusername']"));
            username.sendKeys("testuser");

            // Step 4: Use 'className' locator to close login popup
            WebElement closeBtn = driver.findElements(By.className("btn-secondary")).get(2);
            closeBtn.click();
            Thread.sleep(1000);

            // Step 5: Use 'linkText' locator to click on "Phones"
            WebElement phonesLink = driver.findElement(By.linkText("Phones"));
            phonesLink.click();
            Thread.sleep(1000);

            // Step 6: Use 'partialLinkText' locator to click on "Nokia"
            WebElement nokiaPhone = driver.findElement(By.partialLinkText("Nok"));
            nokiaPhone.click();
            Thread.sleep(1000);

            // Step 7: Use 'cssSelector' locator to click "Add to cart"
            WebElement addToCart = driver.findElement(By.cssSelector("a[class='btn btn-success btn-lg']"));
            addToCart.click();
            Thread.sleep(1000);

            // Alert handling: Accept the alert that appears
            driver.switchTo().alert().accept();
            Thread.sleep(1000);

            // Step 8: Use 'xpath' locator to click "Cart"
            WebElement cartLink = driver.findElement(By.xpath("//a[@id='cartur']"));
            cartLink.click();
            Thread.sleep(2000);

            System.out.println("Test completed successfully!");

        } finally {
          //  driver.quit();
        }
    }
}
