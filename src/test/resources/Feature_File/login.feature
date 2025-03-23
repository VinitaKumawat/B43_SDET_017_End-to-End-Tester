Feature: Login to the application

  Scenario: Successful login with valid credentials
    Given I am on the login page
    When I enter valid login credentials
    And I click the login button

  Scenario: Unsuccessful login with invalid credentials
    Given I am on the login page
    When I enter invalid login credentials
    And I click the login button
    Then I should see an error message indicating login failure