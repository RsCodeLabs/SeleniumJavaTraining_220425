package com.javapractice.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoblazeassignment {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[text()='Phones']")).click();
        Thread.sleep(2000);


        // Use id locator
        driver.findElement(By.id("login2")).click();
        Thread.sleep(2000);



        //
        driver.findElement((By.id("loginusername"))).sendKeys("Deepaly");
        Thread.sleep(2000);


        //Use className locator to click the close button of the login popup.
//        driver.findElement(By.className("btn btn-secondary")).click();////*[@id="logInModal"]/div/div/div[3]/button[1]
//        driver.findElement(By.xpath("//button[text()='Close']"));
//        driver.findElement(By.xpath("//button[text()='Close']"));
        driver.findElement(By.xpath("//button[text()='Close']/preceeding::class='modal-footer'")).click();
//        driver.findElement(By.xpath("//div[@class='modal-footer']/child::button[1]")).click();





        /*
        3. Use name locator to enter a username in the login popup. (If the name attribute is not present, simulate one by locating another element that does use it or explain the fallback.)
        4. Use className locator to click the close button of the login popup.
        5. Use linkText locator to click on the "Phones" category in the left sidebar.
        6. Use partialLinkText locator to click on a phone product that contains the word "Nok" (e.g., "Nokia").
        7. Use cssSelector locator to click on the "Add to cart" button for that product.
        8. Use xpath locator to click on the "Cart" link in the top menu.
        */

        //<li class="nav-item">
        //          <a class="nav-link" id="cartur" href="cart.html">Cart</a>
        //        </li>








    }
}
