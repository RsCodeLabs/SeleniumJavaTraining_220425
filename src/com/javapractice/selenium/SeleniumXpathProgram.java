package com.javapractice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumXpathProgram {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com//");
        Thread.sleep(2000);
        driver.manage().window().maximize();


        //1. Absolute Xpath
        WebElement email = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input"));
        email.sendKeys("ravi123@gmail.com");
        Thread.sleep(2000);
        email.clear();


        //2. Relative Xpath
        WebElement email1 = driver.findElement(By.xpath("//input[@id='email']"));
        email1.sendKeys("teja123@gmail.com");
        Thread.sleep(2000);
        email1.clear();

        //3. Relative Xpath with Attribute
        WebElement email2 = driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']"));
        email2.sendKeys("teja1234@gmail.com");
        Thread.sleep(2000);
        email2.clear();

        //4. Contains
        WebElement email3 = driver.findElement(By.xpath("//input[contains(@placeholder,'phone number')]"));
        email3.sendKeys("Ravi1234@gmail.com");
        Thread.sleep(2000);
        email3.clear();

        //5. Starts-with
        WebElement email4 = driver.findElement(By.xpath("//input[starts-with(@placeholder,'Email')]"));
        email4.sendKeys("TejaRavi123@gmail.com");
        Thread.sleep(2000);
        email4.clear();

        //6. Text()  ---> //tagname[text()='value']
        WebElement forgottenPassword = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
        forgottenPassword.click();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(4000);

        // 7. Normalize-space
        WebElement forgottenPassword2 = driver.findElement(By.xpath("//a[normalize-space(text())='Forgotten password?']"));
        forgottenPassword2.click();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);


        //8. And /
        WebElement email6 = driver.findElement(By.xpath("//input[@id='email' and @name='email']"));
        email6.sendKeys("AndXpath@gmail.com");
        Thread.sleep(2000);
        email6.clear();

        //9. Or
        WebElement email7 = driver.findElement(By.xpath("//input[@id='email' or @name='email']"));
        email7.sendKeys("ORXpath@gmail.com");
        Thread.sleep(2000);
        email7.clear();


       // 10.Parent to child
        WebElement email8 = driver.findElement(By.xpath("//form/div/div/div/input"));
        email8.sendKeys("parentTochuild@gmail.com");
        Thread.sleep(2000);
        email8.clear();

        //11.ancestor
        WebElement divTag2 = driver.findElement(By.xpath("//input[@id='email']/ancestor::form"));
        System.out.println("tag name is"+divTag2.getTagName());
        Thread.sleep(2000);

       // 12.descedent
       WebElement email10 = driver.findElement(By.xpath("//form/descendant::input[@name='email']"));
       email10.sendKeys("descendant@gmail.com");
        Thread.sleep(2000);
        email10.clear();

        //13. parent
        WebElement divTag = driver.findElement(By.xpath("//input[@name='email']/parent::div"));
        System.out.println("tag name is"+divTag.getTagName());
        Thread.sleep(2000);


        //14.child
        WebElement email11 = driver.findElement(By.xpath("//div[@class='_6lux']/child::input"));
        email11.sendKeys("child@gmail.com");
        Thread.sleep(2000);
        email11.clear();


        driver.findElement(By.linkText("Create new account")).click();


        //15.following-sibiling
        WebElement customGender = driver.findElement(By.xpath("//label[text()='Male']/../following-sibling::span//input")) ;
        customGender.click();

        //16 preceding-sibling
        WebElement femaleGender = driver.findElement(By.xpath("//label[text()='Male']/../preceding-sibling::span//input"));
        femaleGender.click();



























    }
}
