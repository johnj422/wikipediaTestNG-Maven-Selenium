package org.wikipedia.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.wikipedia.configuration.WebOperations;

public class BasePage extends WebOperations {

    @FindBy(id = "mw-head")
    private WebElement topBar;

    public BasePage(WebDriver driver) {
        super(driver);
    }
}
