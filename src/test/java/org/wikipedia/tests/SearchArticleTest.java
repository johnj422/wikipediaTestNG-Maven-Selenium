package org.wikipedia.tests;

import org.testng.annotations.Test;
import org.wikipedia.pages.ArticlePage;
import static org.hamcrest.Matchers.*;

public class SearchArticleTest extends BaseTest {

    private final String ARTICLE_NAME = "Star Wars";

    @Test
    public void searchArticle() {
        ArticlePage articlePage = home.searchArticle(ARTICLE_NAME);
        checkThat("Article title is correct", articlePage.getArticleTitle(), is(ARTICLE_NAME));
        checkThat("List of references is not empty", articlePage.getAmountOfReferences(), not(0));
        checkThat("Element 'Info Side Box' is present", articlePage.sideInfoBoxIsDisplayed(), is(true));
    }


}
