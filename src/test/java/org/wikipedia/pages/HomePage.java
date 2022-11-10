package org.wikipedia.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage {

    @FindBy(css = "#simpleSearch > input[type='search']")
    private WebElement searchInput;

    @FindBy(className = "suggestions")
    private WebElement searchSuggestionsContainer;

    @FindBy(css = ".suggestions-results a")
    private List<WebElement> searchSuggestions;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public ArticlePage searchArticle(String text){
        typeOnInput(searchInput, text);
        waitForVisibility(searchSuggestionsContainer);
        getSearchSuggestion(text);
        return new ArticlePage(getDriver());
    }

    public void getSearchSuggestion(String text){
        clickElement(searchSuggestions.stream().filter(s -> s.getText().equals(text)).findFirst().get());
    }
}
