package com.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageGoogleSearch {
    public static final String LEFT_BRACKET_BUTTON = "td:nth-child(1) > .A2W7l > .MEdqYd";
    public static final String ONE_BUTTON = "tr:nth-child(4) > td:nth-child(1) > .A2W7l > .XRsWPe";
    public static final String PLUS_BUTTON = "tr:nth-child(5) .mF5fo > .MEdqYd";
    public static final String TWO_BUTTON = "tr:nth-child(4) > td:nth-child(2) > .A2W7l > .XRsWPe";
    public static final String RIGHT_BRACKET_BUTTON = "td:nth-child(2) > .A2W7l > .MEdqYd";
    public static final String MULTIPLY_BUTTON = "tr:nth-child(3) .mF5fo > .XRsWPe";
    public static final String THREE_BUTTON = "tr:nth-child(4) > td:nth-child(3) > .A2W7l > .XRsWPe";
    public static final String MINUS_BUTTON = "tr:nth-child(4) .mF5fo > .XRsWPe";
    public static final String FOUTH_BUTTON = "tr:nth-child(3) > td:nth-child(1) > .A2W7l > .XRsWPe";
    public static final String ZERO_BUTTON = "tr:nth-child(5) .A2W7l > .XRsWPe";
    public static final String DIVIDE_BUTTON = "tr:nth-child(2) .mF5fo > .XRsWPe";
    public static final String FIVE_BUTTON = "tr:nth-child(3) > td:nth-child(2) > .A2W7l > .XRsWPe";
    public static final String EQUAL_BUTTON = ".UUhRt";
    public static final String ANSWER_FIELD = "cwos";
    public static final String HISTORY_AREA = "//*[@class=\"vUGUtc\"]";
    public static final String SIX_BUTTON = "tr:nth-child(3) > td:nth-child(3) > .A2W7l > .XRsWPe";
    public static final String SIN_BUTTON = "tr:nth-child(2) > td:nth-child(2) .Krlpq";

    private WebDriver chromeDriver;

    PageGoogleSearch(WebDriver chromeDriver){
        this.chromeDriver=chromeDriver;
    }

    public PageGoogleSearch click(By element){
        chromeDriver.findElement(element).click();
        return this;
    }
}

