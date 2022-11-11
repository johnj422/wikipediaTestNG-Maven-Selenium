package org.wikipedia.pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ArticlePage extends BasePage{

    @FindBy(css = "#firstHeading span")
    private WebElement articleTitle;

    @FindBy(css = ".listaref ol li")
    private List<WebElement> references;

    @FindBy(className = "infobox")
    private WebElement sideInfoBox;

    public ArticlePage(WebDriver driver) {
        super(driver);
    }

    public String getArticleTitle() {
        return articleTitle.getText();
    }

    public int getAmountOfReferences() {
        return references.size();
    }

    public boolean sideInfoBoxIsDisplayed() {
        return sideInfoBox.isDisplayed();
    }
}
