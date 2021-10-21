package com.selenium.steps;

import com.selenium.pages.searchpage.SearchPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SearchTests {

    private static final Logger LOGGER = LoggerFactory.getLogger(SearchTests.class);

    private final SearchPage searchPage;

    public SearchTests() {
        this.searchPage = new SearchPage();
    }

    @Given("I'm on next home page")
    public void i_m_on_home_page() {
        LOGGER.info("Opening the home page");
        searchPage.goToHomePage();
    }

    @When("I enter searchTerm {string}")
    public void i_enter_search_term(String searchTerm) {
        LOGGER.info("Entering the search term");
        searchPage.enterSearchTerm(searchTerm);
    }

    @When("I click searchIcon")
    public void i_click_search_icon() {
        LOGGER.info("User clicks search button");
        searchPage.clickSearchIcon();

    }

    @Then("I should get redirected to results page with heading as {string}")
    public void i_should_get_redirected_to_results_page_with_heading_as(String expectedSearchTerm) {
        LOGGER.info("Getting the actual search term value");
        searchPage.verifySearchResult(expectedSearchTerm);
    }



}
