package com.telran.wiki.manager;

import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase1 {

    protected static Framework frwork = new Framework(System.getProperty("browser", BrowserType.CHROME));

    @BeforeSuite
    public void setUp(){
        frwork.init();
    }

    @AfterSuite
    public void tearDown() throws InterruptedException {
        frwork.stop();
    }

}
