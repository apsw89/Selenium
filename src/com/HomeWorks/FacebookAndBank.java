package com.HomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
        fill out the form
        click on register
        close the browser

        navigate to fb.com
        click on create new account
        fill up all the textboxes
        click on sign up button
        close the pop up
        close the browser */
public class FacebookAndBank {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        Thread.sleep(2000);
        driver.findElement(By.linkText("Register")).click();
        driver.findElement(By.id("customer.firstName")).sendKeys("Barack");
        driver.findElement(By.id("customer.lastName")).sendKeys("Trump");
        driver.findElement(By.id("customer.address.street")).sendKeys("10 White House");
        driver.findElement(By.id("customer.address.city")).sendKeys("Washington");
        driver.findElement(By.id("customer.address.state")).sendKeys("Washington DC");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("012345");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("917 913 8823");
        driver.findElement(By.id("customer.ssn")).sendKeys("2133 0002 22332");
        driver.findElement(By.id("customer.username")).sendKeys("Bara7777");
        driver.findElement(By.id("customer.password")).sendKeys("Bara777");
        driver.findElement(By.id("repeatedPassword")).sendKeys("Bara777");

        driver.get("http://www.facebook.com"); //open FB
        driver.findElement(By.partialLinkText("Create")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Barrack");
        driver.findElement(By.name("lastname")).sendKeys("Obama");
        driver.findElement(By.name("reg_email__")).sendKeys("Barrack@bara.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Barrack@bara.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("Barrack@bara.com");
        driver.findElement(By.name("birthday_month")).sendKeys("Jul");
        driver.findElement(By.name("birthday_day")).sendKeys("12");
        driver.findElement(By.name("birthday_year")).sendKeys("2000");
        driver.findElement(By.cssSelector("input._8esa[value='2']")).click();
        driver.findElement(By.name("websubmit")).click();
        driver.findElement(By.cssSelector("img[src='https://static.xx.fbcdn.net/rsrc.php/v3/y2/r/__geKiQnSG-.png']")).click();

        driver.close();
    }
}