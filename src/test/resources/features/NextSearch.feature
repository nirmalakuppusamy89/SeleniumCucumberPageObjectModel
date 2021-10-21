@next
Feature: Search Feature Test
  As a user
  I should search and retrieve the relevant products

  Background:
    Given I'm on next home page

  @search
  Scenario:  verify product search with product name
    When I enter searchTerm "T-Shirt"
    And I click searchIcon
    Then I should get redirected to results page with heading as "T-Shirt"