package com.telran.wiki;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class TestBase1 {

    protected static Framework frwork = new Framework();

    @BeforeSuite
    public void setUp(){
        frwork.init();
    }

    @AfterSuite
    public void tearDown() throws InterruptedException {
        frwork.stop();
    }

}
