package com.telran.wiki;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Framework {
    WebDriver driver;

    public void init() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://en.wikipedia.org");
    }

    public void stop() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

    public void fillTheLogInForm(By passForLogIn, String logIn, By passForPassword, String password) {
        enterValues(passForLogIn, logIn);
        enterValues(passForPassword, password);
    }

    public void clickLogInConfirmation() {
        driver.findElement(By.id("wpLoginAttempt")).click();
    }

    public void cliclLogInButtonInHeader() {
        driver.findElement(By.id("pt-login")).click();
    }

    public void enterValues(By field, String value) {
        driver.findElement(field).click();
        driver.findElement(field).clear();
        driver.findElement(field).sendKeys(value);
    }

    public void printInSearchAndGo(String searchWord) {
        driver.findElement(By.name("search")).click();
        driver.findElement(By.name("search")).clear();
        driver.findElement(By.name("search")).sendKeys(searchWord);
        driver.findElement(By.name("go")).click();
    }

    public String findArticleTitle() {
        return driver.findElement(By.cssSelector("#firstHeading")).getText().toLowerCase();
    }

    public boolean incorrectRegistrationHint() {
        return isElementPresent(By.cssSelector(".error"));
    }

    public boolean isElementPresent(By locator) {
        return driver.findElements(locator).size() > 0;
    }
}
