package com.class05_DropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownDemo {
    public static String url = "https://www.syntaxprojects.com/basic-select-dropdown-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement daysDD = driver.findElement(By.id("select-demo"));
        Select select = new Select(daysDD); //Using Select method to find what we need to select
  /*      select.selectByIndex(4);

        Thread.sleep(1000);
        select.selectByVisibleText("Friday");

        Thread.sleep(1000);
        select.selectByValue("Saturday");*/

        List <WebElement> allOptions= select.getOptions();
        int size = allOptions.size();
        System.out.println(size);
        for (int i=1; i<size; i++){
            String All = allOptions.get(i).getText();
            select.selectByIndex(i);
            System.out.println(All);
            Thread.sleep(1000);
        }
        driver.close();
}
}
