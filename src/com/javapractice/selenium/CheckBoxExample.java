package com.javapractice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/login");
        WebElement RMCheckbox = driver.findElement(By.xpath("//label[text()='Remember me?']/preceding-sibling::input[2]"));
        System.out.println("Is RM displayed?"+ RMCheckbox.isDisplayed());
        System.out.println("Is RM enabled?"+ RMCheckbox.isEnabled());
        // Check if the checkbox is selected
        System.out.println("Is RM selected?"+ RMCheckbox.isSelected());
        // Click the checkbox
        if(!RMCheckbox.isSelected()){
            RMCheckbox.click();
        }
        System.out.println("Is RM selected?"+ RMCheckbox.isSelected());

        driver.close();

    }
}
