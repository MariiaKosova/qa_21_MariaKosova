package com.telran.wiki.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchHelper extends HelperBase {
    public SearchHelper(WebDriver driver) {
        super(driver);
    }

    public void printInSearchAndGo(String searchWord) {
        //driver.findElement(By.name("search")).click();
        click(By.name("search"));
        driver.findElement(By.name("search")).clear();
        driver.findElement(By.name("search")).sendKeys(searchWord);
        //driver.findElement(By.name("go")).click();
        click(By.name("go"));
    }

    public String findArticleTitle() {
        return driver.findElement(By.cssSelector("#firstHeading")).getText().toLowerCase();
    }
}
