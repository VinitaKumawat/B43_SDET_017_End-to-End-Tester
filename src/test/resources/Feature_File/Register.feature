Feature: User Registration

  Scenario: Successful Registration
    Given I am on the registration page
    When I fill in the registration form with valid details
    And I click the register button
    