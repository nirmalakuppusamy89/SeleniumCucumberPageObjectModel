package com.selenium.pages.SearchPage;

import com.selenium.pages.basepage.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WeGiftCareersPage extends BasePage {
  private static final Logger LOGGER = LoggerFactory.getLogger(WeGiftCareersPage.class);

  private static final String WE_GIFT_BASE_URL = "https://wegift.io";

  @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div/header/div/nav[1]/ul/li[4]/a")
  private WebElement companyDropdown;

  @FindBy(xpath = "//h4[contains(text(),'Careers')]")
  private WebElement careersPageOption;

  @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div/section[1]/div[1]/h1")
  private WebElement careersText;

  @FindBy(xpath = "//span[contains(text(),'See open positions')]")
  private WebElement openPositionsButton;

  @FindBy(xpath = "//*[@id=\"jobs\"]/h2")
  private WebElement openPositionsHeader;

  @FindBy(xpath = "//*[@id=\"whr_embed_hook\"]/ul[2]")
  private WebElement itemElementList;



  public WeGiftCareersPage() {

    PageFactory.initElements(driver, this);

  }

  public void navigateToHomePage() {
    driver.get(WE_GIFT_BASE_URL);
  }

  public void navigateToCareersPage() {
    LOGGER.info("Clicking on the company dropdown!");
    wait.forElementToBeDisplayed(2, companyDropdown, "companyDropdown");
    companyDropdown.click();
    wait.forElementToBeDisplayed(2, careersPageOption, "careersPageOption");
    LOGGER.info("Clicking the careers option from dropdown!");
    careersPageOption.click();
    LOGGER.info("Verifying that user in the careers page!");
    wait.forElementToBeDisplayed(5, careersText, "careersTextCareerPage");
    String careersTextCareerPage = careersText.getText();
    Assert.assertEquals("Careers", careersTextCareerPage);

  }

  public void navigateToOpenPositions() {
    LOGGER.info("Clicking on open positions button!");
    openPositionsButton.click();
    LOGGER.info("Verifying that user in the open positions section!");
    String jobsHeader = openPositionsHeader.getText();
    Assert.assertEquals("Find your place in the team", jobsHeader);

  }

  public void verifyNumberOfEngineeringRoles(int numberOfRoles) {
    wait.forElementToBeDisplayed(5, itemElementList, "itemElementList");
    LOGGER.info(String.valueOf(itemElementList.findElements(By.xpath("li")).size()));
    Assert.assertEquals(numberOfRoles, itemElementList.findElements(By.xpath("li")).size());

  }




}
