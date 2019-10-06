package com.telran.wiki.manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

public class Framework{
    WebDriver driver;
    SessionHelper session;
    SearchHelper search;
    LoginHelper login;
    private String browser;

    public Framework(String browser) {
        this.browser = browser;
    }

    public void init() {
        if (browser.equals(BrowserType.CHROME)){
            driver = new ChromeDriver();
        }
        if (browser.equals(BrowserType.FIREFOX)){
            driver = new FirefoxDriver();
        }

        //driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        session = new SessionHelper(driver);
        search = new SearchHelper(driver);
        login = new LoginHelper(driver);

        session. openSite("https://en.wikipedia.org");
    }


    public void stop() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

    public SessionHelper getSession() {
        return session;
    }

    public SearchHelper getSearch() {
        return search;
    }

    public LoginHelper getLogin() {
        return login;
    }
}
