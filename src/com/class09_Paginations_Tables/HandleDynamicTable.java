package com.class09_Paginations_Tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandleDynamicTable {
    public static String url = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester");

        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");
        WebElement loginButton = driver.findElement(By.className("button"));
        loginButton.click();

        List<WebElement> rows = driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr"));
        for(int i=1; i<rows.size(); i++){ //start from 1 so we dont print the header.
            String rowText = rows.get(i).getText();
            System.out.println(rowText);
            //to get all the text in a table.

            //to click one of the element inside the table, we use if condition and below codes.
            if(rowText.contains("Bob Feather")){
                List<WebElement> checkBoxes = driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr/td[1]"));
                //We have selected all 8 checkboxes and now we click on the one that we want to select.
                checkBoxes.get(i - 1).click();//we have minus because we dont want to print the header.

                //to click in several checkboxes, look at the common word or use if condition.
                //to click on several, write FamilyAlbum instead of Bob Feather.
            }
        }
    }
}