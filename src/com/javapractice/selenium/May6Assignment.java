package com.javapractice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class May6Assignment {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        Thread.sleep(2000);
        driver.manage().window().maximize();

/*
        //1. Absolute Xpath to locate and click the Amazon logo.
        WebElement amazonLogo = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[1]/div[1]/a"));
        amazonLogo.click();
        Thread.sleep(2000);

        //2. Relative Xpath to locate the search bar and enter the text Laptop
        WebElement searchBar = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        searchBar.sendKeys("Laptop");
        Thread.sleep(2000);

        //3. XPath with attribute to locate and click the search button.
        WebElement searchButton = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
        searchButton.click();
        Thread.sleep(2000);

        //4.Use contains() function to locate the search textbox using a partial attribute.
        WebElement searchTextBox1 = driver.findElement(By.xpath("//input[contains(@id,'searchtext')]"));
        searchTextBox1.click();
        Thread.sleep(2000);

        //5. Use starts-with() to locate the search input whose ID starts with twotab.//id="twotabsearchtextbox"
        WebElement searchTextBox2 = driver.findElement(By.xpath("//input[starts-with(@id,'twotab')]"));
        searchTextBox2.click();
        Thread.sleep(2000);

        //6.  Use text() to click on the “Best Sellers” link. //Worked fine but i could see 2 instances when searched for //a[text()='Bestsellers'] in dev tools
        WebElement bestSeller = driver.findElement(By.xpath("//a[text()='Bestsellers']"));
        bestSeller.click();
        Thread.sleep(2000);

//7.Use normalize-space() to print the text of the “Hello, sign in” label.
        WebElement helloSignIn = driver.findElement(By.xpath("//span[normalize-space(text())='Hello, sign in']"));
        System.out.println("Message:  " +helloSignIn.getText());
        Thread.sleep(2000);

//8. Use XPath with and to locate the search box using both id and type attributes.
        WebElement searchTextBox3 = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' and @type= 'text']"));
        System.out.println("searchTextBox3:  " +searchTextBox3.getText());
        searchTextBox3.click();
        Thread.sleep(2000);

//9. Use parent → child axis to go from nav-search to the input box.
        WebElement searchInputBox1 = driver.findElement(By.xpath("//div/form/div/div/input[@id='twotabsearchtextbox']"));
        System.out.println("searchInputBox1:  " +searchInputBox1.getText());
        searchInputBox1.sendKeys("laptop");
        Thread.sleep(2000);


//
//10. Use ancestor:: to print the tag name of the search input's ancestor form.
        WebElement searchInputBox2 = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']/ancestor::form"));
        String tagName = searchInputBox2.getTagName();
        System.out.println("Ancestor form tag: " + tagName);
        String FormElementName2 = searchInputBox2.getText();
        System.out.println("FormElementName2: " + FormElementName2);
        Thread.sleep(2000);


//11. Use descendant:: to locate any span tag inside the nav-main container.
        WebElement searchInputBox2 = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']/ancestor::form"));
        String tagName = searchInputBox2.getTagName();
        System.out.println("Ancestor form tag: " + tagName);
        String FormElementName2 = searchInputBox2.getText();
        System.out.println("FormElementName2: " + FormElementName2);
        //Get the direct parent tag name
        WebElement childElement = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        WebElement parent = childElement.findElement(By.xpath(".."));
        String parentTagName = parent.getTagName();
        System.out.println("Parent tag name: " + parentTagName);
        driver.close();

//
//12. Use following:: to locate and print the next element after “Hello, sign in”.
        WebElement followingElement = driver.findElement(By.xpath("//div[@class='nav-line-1-container']/following-sibling::span"));
        System.out.println("FollowingElement after Hello Sign In:  " +followingElement.getText());
        followingElement.click();
        Thread.sleep(2000);

//

//13. Use preceding:: to locate an element before the search input.
        WebElement B4searchInput = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']/preceding::div[1]"));
        System.out.println("Element Before SEARCH input field:  " +B4searchInput.getText());
        //ABLE TO GET THE RIGHT OUTPUT BUT GETTING BELOW ERROR :
        // Exception in thread "main" org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element <div class="nav-search-facade" data-value="search-alias=aps">...</div> is not clickable at point (377, 29). Other element would receive the click: <select aria-describedby="searchDropdownDescription" class="nav-search-dropdown searchSelect nav-progressive-attrubute nav-progressive-search-dropdown" data-nav-digest="bWVcD3YlJR7bl7mJRxk8QgeiLoU=" data-nav-selected="0" id="searchDropdownBox" name="url" style="display: block; top: 2.5px;" tabindex="0" title="Search in">...</select>
        B4searchInput.click();
        Thread.sleep(5000);
*/

//
//14. Use following-sibling:: to locate the sibling element after “Mobiles” link.
        WebElement followingSiblingOfMobileLink = driver.findElement(By.xpath("//a[text()='Mobiles']/../../following-sibling::li[1]//a"));
        System.out.println("Following Sibling element after MOBILES:  " +followingSiblingOfMobileLink.getText());
        followingSiblingOfMobileLink.click();

//
         /*
//15. Use preceding-sibling:: to locate the element before the “Electronics” link.
        WebElement PrecedingSiblingOfElectronics = driver.findElement(By.xpath("//a[text()=' Electronics ']/../../preceding-sibling::li//div/a"));
        PrecedingSiblingOfElectronics.click();
//
//16. Use self:: to select the search box itself and print its tag name.

//
//17. Use child:: to get all direct children of the nav-tools div and print count.
//
//18. Use position() to click the first link in the nav-xshop navigation bar.
//
//19. Use last() to click the last item in the nav-xshop navigation
*/
    }
}