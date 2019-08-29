package com.telran.selenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class loginToEbay extends TestBase{

    @Test
    public void logInTest(){
        openSite("https://www.ebay.com/");

        initLogin();

        fillLoginForm("asas@sasa.com", "123456");

        clickLoginButton();

    }


}
