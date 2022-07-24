package com.class07_MultipleWindowsAndSynchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Demo {
    public static String url ="http://accounts.google.com/signup";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        String mainPageHandle= driver.getWindowHandle();
        System.out.println(mainPageHandle);

        WebElement helpLink= driver.findElement(By.linkText("Help"));
        helpLink.click();

        Set <String> allWindowHandles = driver.getWindowHandles(); // set all IDs from tabs
        System.out.println(allWindowHandles.size());

        Iterator <String> it = allWindowHandles.iterator(); //creating Iterator to iterate the handles
        mainPageHandle =  it.next(); //take first step and assign the main page handle
        String childHandle = it.next(); //take 2nd step and have a child handle

        driver.switchTo().window(mainPageHandle);
    }


}
