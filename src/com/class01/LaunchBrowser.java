package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe"); //.exe for windows only!
        WebDriver driver = new ChromeDriver();//launch the browser
        driver.get("http://www.amazon.com");
        String URL = driver.getCurrentUrl();
        System.out.println(URL);//print url what was captured from browser
       String title= driver.getTitle();
        System.out.println(title);// print a title of URL
        driver.quit();// close browser
    }
}
