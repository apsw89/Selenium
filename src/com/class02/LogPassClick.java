package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogPassClick {
    /* We will use HTML
     DOM - Document Object Model also called as Developer's tools or Dev tools
     Document - simple html document which represents
     Object -any line in HTML is considered as Object
     Model - just layout of HTML

     Locator - is an address or a position of web-element on the webpage, used to locate or identify web-elements
     Locators:
     ID,
      Name,
      TagName,
      Xpath,
       LinkText,
       PartialLinkText,
       CssSelectors,
       Classname
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.fb.com");
        driver.findElement(By.id("email")).sendKeys("4353");
        driver.findElement(By.id("pass")).sendKeys("2");
        driver.findElement(By.name("login")).click();
        Thread.sleep(3000);
        //driver.findElement(By.linkText("Forgot Password?")).click();
        driver.findElement(By.partialLinkText("Forgot")).click();
        Thread.sleep(3000);
       // driver.quit();
    }
}

