package com.selenium.steps;

import com.selenium.pages.SearchPage.WeGiftCareersPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WeGiftCareersSteps {

  private static final Logger LOGGER = LoggerFactory.getLogger(WeGiftCareersSteps.class);
  private WeGiftCareersPage weGiftCareersPage;

  public WeGiftCareersSteps() {
    this.weGiftCareersPage = new WeGiftCareersPage();
  }

  @Given("I am on the WeGift website homepage")
  public void iAmOnTheWeGiftWebsiteHomepage() {
    LOGGER.info("Opening the WeGift home page!");
    weGiftCareersPage.navigateToHomePage();


  }

  @When("I am on the WeGift careers page")
  public void iAmOnTheWeGiftCareersPage() {
    weGiftCareersPage.navigateToCareersPage();

  }

  @And("I navigate to open positions section")
  public void iNavigateToOpenPositionsSection() {
    weGiftCareersPage.navigateToOpenPositions();
  }

  @Then("verify the number of Engineering role is {string}")
  public void verifyTheNumberOfEngineeringRoleIs(String numberOfRoles) {
    weGiftCareersPage.verifyNumberOfEngineeringRoles(Integer.parseInt(numberOfRoles));


  }

}
