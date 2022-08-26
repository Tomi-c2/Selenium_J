package com.company;
import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;

import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

public class Main {

    public WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/epetimehinoluwatomi/IdeaProjects/Selenium Java/driver/chromedriver");
        WebDriver driver = new ChromeDriver ();
        driver.get("https://google.com");
        driver.manage().window().maximize();

        String title = driver.getTitle();
        //Assertions.assertEquals("Google", title);

       WebElement searchBox = driver.findElement(By.name("q"));
       WebElement gmailabel = driver.findElement(By.className("gb_d"));
       searchBox.sendKeys("Hello");
       gmailabel.click();

        Select drpOptions = new Select(driver.findElement(By.className("button button--medium")));
        drpOptions.selectByVisibleText("button button--medium");

        WebElement webElement = driver.findElement(By.className("button button--medium"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", webElement);



       // ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", drpOptions);





      // driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

      /* JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("window.scrollBy(0, 400)");
       js.executeScript("arguments[0].scrollIntoView(true);", element);

        WebElement element = driver.findElement(By.name("category"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();


       Select drpOptions = new Select(driver.findElement(By.name("category")));
       drpOptions.selectByVisibleText("enquiries_about_our_products");


       WebElement drpOptions = driver.findElement(By.className("button button--medium"));
    */



	// write your code here
    }
}

