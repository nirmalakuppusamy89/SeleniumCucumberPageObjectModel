package com.selenium.pages.searchpage;

import com.selenium.pages.basepage.BasePage;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SearchPage extends BasePage {

    private static final Logger LOGGER = LoggerFactory.getLogger(SearchPage.class);

    private static final String HOME_PAGE_URL = "https://www.next.co.uk/";

    @FindBy(id = "sli_search_1")
    private WebElement searchBox;

    @FindBy(xpath = "//*[@id=\"newsearch\"]/input[4]")
    private WebElement searchIcon;

    @FindBy(xpath = "//*[@id=\"ResultHeader\"]/div[1]/h1/div")
    private WebElement actualSearchText;

    public SearchPage() {
        PageFactory.initElements(driver, this);
    }

    public void goToHomePage() {
        driver.get(HOME_PAGE_URL);
        wait.forLoading(5);
    }

    public void enterSearchTerm(String searchTerm) {
        searchBox.sendKeys(searchTerm);
    }

    public void clickSearchIcon() {
        searchIcon.click();
        wait.forLoading(5);
    }

    public void verifySearchResult(String expectedSearchTerm) {
        String actualSearchTerm = actualSearchText.getText();
        LOGGER.info("Verifying the search text");
        Assert.assertEquals(expectedSearchTerm, actualSearchTerm);

    }

}
