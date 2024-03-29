package com.class09_Paginations_Tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebTableWithPagination {
    public static String url = "http://syntaxprojects.com/table-pagination-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        List<WebElement> rows = driver.findElements(By.xpath("//tbody[@id='myTable']/tr"));
        WebElement nextButton = driver.findElement(By.xpath("//a[@class='next_link']"));
        boolean studentNotFound = true;

        while(studentNotFound){
            for (WebElement row : rows) {
                String rowText = row.getText();
                System.out.println(rowText);
                if(rowText.contains("Archy J")){
                    studentNotFound = false;
                    System.out.println(rowText);
                    break;
                }

            }if(studentNotFound){
                nextButton.click();
            }
        }
    }
}






