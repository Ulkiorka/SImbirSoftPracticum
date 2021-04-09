package com.google;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjectGoogle {
    private WebDriver chromeDriver;
    WebElement searchField;

    PageObjectGoogle(WebDriver chromeDriver){
        this.chromeDriver = chromeDriver;
        chromeDriver.get("http://google.com/");
        searchField = chromeDriver.findElement(By.name("q"));
    }

    public PageGoogleSearch find(String wordFind){
        searchField.click();
        searchField.sendKeys(wordFind);
        searchField.sendKeys(Keys.ENTER);
        return new PageGoogleSearch(chromeDriver);
    }
}

