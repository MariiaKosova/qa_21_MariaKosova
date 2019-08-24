package com.telran.selenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class loginToEbay extends TestBase{

    @Test
    public void logInTest(){
        driver.get("https://www.ebay.com/");

        click(By.id("gh-ug"));

        click(By.id("userid"));
        driver.findElement(By.id("userid")).clear();
        driver.findElement(By.id("userid")).sendKeys("asas@sasa.com");

        click(By.id("pass"));
        driver.findElement(By.id("pass")).clear();
        driver.findElement(By.id("pass")).sendKeys("123456");

        click(By.id("sgnBt"));

    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

}
