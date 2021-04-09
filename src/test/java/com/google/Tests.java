package com.google;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Tests extends WebDriverSettings {

    @Test
    public void checkSum() {
        PageObjectGoogle googlePage = new PageObjectGoogle(chromeDriver);
        googlePage.find("калькулятор")
                .click(By.cssSelector(PageGoogleSearch.LEFT_BRACKET_BUTTON))
                .click(By.cssSelector(PageGoogleSearch.ONE_BUTTON))
                .click(By.cssSelector(PageGoogleSearch.PLUS_BUTTON))
                .click(By.cssSelector(PageGoogleSearch.TWO_BUTTON))
                .click(By.cssSelector(PageGoogleSearch.RIGHT_BRACKET_BUTTON))
                .click(By.cssSelector(PageGoogleSearch.MULTIPLY_BUTTON))
                .click(By.cssSelector(PageGoogleSearch.THREE_BUTTON))
                .click(By.cssSelector(PageGoogleSearch.MINUS_BUTTON))
                .click(By.cssSelector(PageGoogleSearch.FOUTH_BUTTON))
                .click(By.cssSelector(PageGoogleSearch.ZERO_BUTTON))
                .click(By.cssSelector(PageGoogleSearch.DIVIDE_BUTTON))
                .click(By.cssSelector(PageGoogleSearch.FIVE_BUTTON))
                .click(By.cssSelector(PageGoogleSearch.EQUAL_BUTTON));

        WebElement calculatedArea = chromeDriver.findElement(By.id(PageGoogleSearch.ANSWER_FIELD));
        Assertions.assertEquals(calculatedArea.getText(), "1");
        WebElement memoryArea = chromeDriver.findElement(By.xpath(PageGoogleSearch.HISTORY_AREA));
        Assertions.assertEquals(memoryArea.getText(),"(1 + 2) × 3 - 40 ÷ 5 =");
    }
    @Test
    public void checkDivisionByZero() {
        PageObjectGoogle googlePage = new PageObjectGoogle(chromeDriver);
        googlePage.find("калькулятор")
                .click(By.cssSelector(PageGoogleSearch.SIX_BUTTON))
                .click(By.cssSelector(PageGoogleSearch.DIVIDE_BUTTON))
                .click(By.cssSelector(PageGoogleSearch.ZERO_BUTTON))
                .click(By.cssSelector(PageGoogleSearch.EQUAL_BUTTON));

        WebElement calculatedArea = chromeDriver.findElement(By.id(PageGoogleSearch.ANSWER_FIELD));
        Assertions.assertEquals(calculatedArea.getText(), "Infinity");
        WebElement memoryArea = chromeDriver.findElement(By.xpath(PageGoogleSearch.HISTORY_AREA));
        Assertions.assertEquals(memoryArea.getText(),"6 ÷ 0 =");
    }

    @Test
    public void checkUncompletedExpression() {
        PageObjectGoogle googlePage = new PageObjectGoogle(chromeDriver);
        googlePage.find("калькулятор")
                .click(By.cssSelector(PageGoogleSearch.SIN_BUTTON))
                .click(By.cssSelector(PageGoogleSearch.EQUAL_BUTTON));

        WebElement calculatedArea = chromeDriver.findElement(By.id(PageGoogleSearch.ANSWER_FIELD));
        Assertions.assertEquals(calculatedArea.getText(), "Error");
        WebElement memoryArea = chromeDriver.findElement(By.xpath(PageGoogleSearch.HISTORY_AREA));
        Assertions.assertEquals(memoryArea.getText(),"sin() =");
    }

}
