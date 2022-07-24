package com.class05_DropDowns;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MultiSelectDropDown {
    public static String url = "https://syntaxprojects.com/basic-select-dropdown-demo.php";
    private static boolean option;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement statesDD = driver.findElement(By.id("multi-select"));

        Select select = new Select(statesDD);
        boolean isMultiple = select.isMultiple();
        System.out.println(isMultiple);

        if(isMultiple) {

            List<WebElement> options = select.getOptions();
            for(WebElement option: options) {
                String optionText = option.getText();
                select.selectByVisibleText(optionText);
            }

        }
        select.deselectByIndex(5);
        select.deselectAll();
    }
}