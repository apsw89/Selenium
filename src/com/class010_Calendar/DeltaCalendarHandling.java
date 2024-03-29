package com.class010_Calendar;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class DeltaCalendarHandling {

    public static String url = "http://www.delta.com";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();


        WebElement calendar = driver.findElement(By.id("calDepartLabelCont"));
        calendar.click();

        WebElement nextButton = driver.findElement(By.xpath("//span[text() = 'Next']"));
        WebElement dMonth = driver.findElement(By.className("dl-datepicker-month-0"));
        String dMonthText = dMonth.getText();

        // click on next until month is October
        while(!dMonthText.equals("October")) {
            nextButton.click();
            dMonthText = dMonth.getText();
        }

        List<WebElement> departDates = driver.findElements(By.xpath("//tbody[@class = 'dl-datepicker-tbody-0']/tr/td"));
        for(WebElement departDate: departDates) {
            if(departDate.getText().equals("30")) {
                departDate.click();
                break;
            }
        }

        WebElement rMonth = driver.findElement(By.className("dl-datepicker-month-1"));
        String rMonthtext = rMonth.getText();

        while(!rMonthtext.equals("December")) {
            nextButton.click();
            rMonthtext = rMonth.getText();
        }

        List<WebElement> returnDates = driver.findElements(By.xpath("//tbody[@class = 'dl-datepicker-tbody-1']/tr/td"));
        for(WebElement returnDate: returnDates) {
            if(returnDate.getText().equals("20")) {
                returnDate.click();
                break;
            }
        }
    driver.quit();
    }

}