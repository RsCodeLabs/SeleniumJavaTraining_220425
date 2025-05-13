package com.javapractice.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");

        //find amazon logo
        //<i class="a-icon a-logo"></i>
        driver.findElement(By.className("a-icon a-logo"));

        //XPath to locate the search bar
        ////*[@id="nav-search-bar-form"]
        ////input[@title='Search in']
        driver.findElement(By.xpath("//select[@title='Search in']")).sendKeys("gift");

        //<input id="nav-search-submit-button" type="submit" class="nav-input nav-progressive-attribute" value="Go" tabindex="0">
        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

        //Use contains() function to locate the search textbox using a partial attribute.
        driver.findElement(By.xpath("//input[contains(@id,'nav-search-submit-button')]")).click();

        //Use starts-with() to locate the search input whose ID starts with twotab.
        driver.findElement(By.xpath("//input[starts-with(@id,'twotab')]")).click();

        //Use text() to click on the “Best Sellers” link.
        //<a href="/gp/bestsellers/?ref_=nav_cs_bestsellers" class="nav-a  " tabindex="0" data-csa-c-type="link" data-csa-c-slot-id="nav_cs_3" data-csa-c-content-id="nav_cs_bestsellers" data-csa-c-id="ijo1co-yaiwed-jvkkch-fmkh6w">Bestsellers</a>
        driver.findElement(By.xpath("//a[@text()='Bestsellers']"));


        // Use XPath with and to locate the search box using both id and type attributes.
        driver.findElement(By.xpath("//input[@id='nav-search-submit-button' and @type='text']")).click();

        //Use parent → child axis to go from nav-search to the input box.
        driver.findElement(By.xpath("//form[@id='nav-search-bar-form']//div[2]/div"));

        //🔸 Use ancestor:: to print the tag name of the search input's ancestor form.
        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']/ancestor::form"));

        //🔸 Use descendant:: to locate any span tag inside the nav-main container.
 //        driver.findElement(By.xpath("//div[@id='nav-main']/"))
        driver.findElement(By.xpath("//div[@id='nav-main']/descendant::span[text()='Fresh']"));


        //🔸 Use following:: to locate and print the next element after “Hello, sign in”.

        //🔸 Use preceding:: to locate an element before the search input.
        //
        //🔸 Use following-sibling:: to locate the sibling element after “Mobiles” link.
        //
        //🔸 Use preceding-sibling:: to locate the element before the “Electronics” link.
        //
        //🔸 Use self:: to select the search box itself and print its tag name.
        //
        //🔸 Use child:: to get all direct children of the nav-tools div and print count.
        //
        //🔸 Use position() to click the first link in the nav-xshop navigation bar.
        //
        //🔸 Use last() to click the last item in the nav-xshop navigation list.














    }
}
