package com.telran.wiki;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class wikiLogIn extends TestBase1 {

    @Test
    public void logInInWiki() throws InterruptedException {
        frwork.getLogin().cliclLogInButtonInHeader();
        frwork.getLogin().fillTheLogInForm(By.id("wpName1"), "ewro@fdsa.com", By.id("wpPassword1"), "3456");
        frwork.getLogin().clickLogInConfirmation();
        Assert.assertTrue(frwork.getLogin().incorrectRegistrationHint());
    }
}
