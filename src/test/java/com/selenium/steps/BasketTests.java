package com.selenium.steps;

import com.selenium.pages.basketpage.BasketPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasketTests {


    private static final Logger LOGGER = LoggerFactory.getLogger(BasketTests.class);

    private final BasketPage BasketPage;

    public BasketTests() {
        this.BasketPage = new BasketPage();
    }

    @When("click the first item from results page")
    public void click_the_first_item_from_results_page() {

        LOGGER.info("Getting the selected product name");

        LOGGER.info("Selecting and opening the first item from the search results");

    }
    @When("select the size for the item")
    public void select_the_size_for_the_item() {


    }
    @When("click add to bag button")
    public void click_add_to_bag_button() {

    }
    @Then("verify the actual item name in the basket")
    public void verify_the_actual_item_name_in_the_basket() {

    }

}
