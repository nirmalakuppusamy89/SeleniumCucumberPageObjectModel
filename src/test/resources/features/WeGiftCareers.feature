@we-gift-careers
Feature: Check the number of engineering roles in WeGift
  As a user I want to check the number of engineering roles in WeGift
  So that I can apply for a select role

  Background:
    Given I am on the WeGift website homepage

    Scenario: Verify the number of Engineering roles in WeGift careers page
      When I am on the WeGift careers page
      And I navigate to open positions section
      Then verify the number of Engineering role is "7"
