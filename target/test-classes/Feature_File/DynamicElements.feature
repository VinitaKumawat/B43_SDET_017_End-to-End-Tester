@SmokeTest
Feature: Test dynamic elements such as Categories, Sort, and Language

  Scenario: Selecting a category filter
    Given I am on the ToolShop home page
    When I select a category "Hand Tools"
    Then The products should be filtered by the selected category

  Scenario: Sorting products by price
    Given I am on the ToolShop home page
    When I select sort option "Price: Low to High"
    Then The products should be sorted by the selected option "Price: Low to High"

  Scenario: Changing the website language
    Given I am on the ToolShop home page
    When I change the language to "EN"
    Then The website language should change to "EN"