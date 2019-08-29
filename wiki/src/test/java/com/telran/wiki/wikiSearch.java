package com.telran.wiki;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class wikiSearch extends TestBase1 {

    @Test
    public void searchInWiki() {

        driver.findElement(By.name("search")).click();
        driver.findElement(By.name("search")).clear();
        driver.findElement(By.name("search")).sendKeys("dogo argentino");

        driver.findElement(By.name("go")).click();

    }
}
