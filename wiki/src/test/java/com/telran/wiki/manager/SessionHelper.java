package com.telran.wiki.manager;

import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase {

    public SessionHelper(WebDriver driver) {
        super(driver);
    }


    public void openSite(String path) {
        driver.get(path);
    }

}
