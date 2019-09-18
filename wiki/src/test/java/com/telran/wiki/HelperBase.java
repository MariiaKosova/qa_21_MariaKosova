package com.telran.wiki;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

  public class HelperBase {
    WebDriver driver;

    public HelperBase(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isElementPresent(By locator) {
        return driver.findElements(locator).size() > 0;
    }

      public void click(By locator) {
          driver.findElement(locator).click();
      }

      public void enterValues(By field, String value) {
          driver.findElement(field).click();
          driver.findElement(field).clear();
          driver.findElement(field).sendKeys(value);
      }
}
