package com.javapractice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDDAndRadioButtonsExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/r.php?entry_point=login");

        driver.manage().window().maximize();
        WebElement dayDD = driver.findElement(By.id("day"));
        // Select the dropdown element
        Select daySelect = new Select(dayDD);
        daySelect.selectByValue("6");

        WebElement monthDD = driver.findElement(By.id("month"));
        Select monthSelect = new Select(monthDD);
        monthSelect.selectByVisibleText("Oct");

        WebElement yearDD = driver.findElement(By.id("year"));
        Select yearSelect = new Select(yearDD);
        yearSelect.selectByIndex(2);

        WebElement maleRadio = driver.findElement(By.xpath("//label[text()='Male']/input"));
        maleRadio.click();

    }
}
