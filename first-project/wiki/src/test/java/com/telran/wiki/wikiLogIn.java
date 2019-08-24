package com.telran.wiki;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class wikiLogIn extends TestBase1 {

    @Test
    public void logInInWiki() throws InterruptedException {
        driver.findElement(By.id("pt-login")).click();

        enterValues(By.id("wpName1"), "ewro@fdsa.com");
        enterValues(By.id("wpPassword1"), "3456");

        driver.findElement(By.id("wpLoginAttempt")).click();
    }

    public void enterValues(By field, String value) {
        driver.findElement(field).click();
        driver.findElement(field).clear();
        driver.findElement(field).sendKeys(value);
    }

}
