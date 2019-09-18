package com.telran.wiki;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginHelper extends HelperBase {

    public LoginHelper(WebDriver driver) {
        super(driver);
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

    public boolean incorrectRegistrationHint() {
        return isElementPresent(By.cssSelector(".error"));
    }
}
