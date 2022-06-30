package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe"); //.exe for windows only!
        WebDriver driver = new ChromeDriver();//launch the browser
        driver.get("http://www.facebook.com"); //open FB
        driver.navigate().to("http://www.google.com");//then go to google
        driver.navigate().back(); //and back to FB
        driver.navigate().forward();//and back to google
      //  Thread.sleep(4000);//timer for pause between code parts (1000 = 1 second!)
        driver.navigate().refresh();//refresh
       // driver.manage().window().maximize();// maximize this window
        driver.manage().window().fullscreen();
          // driver.close();//will close the current tab
          // driver.quit();//will quit the whole browser

    }
}