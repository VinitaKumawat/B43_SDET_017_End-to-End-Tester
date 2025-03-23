Feature: Checkout Functionality

  Scenario: Proceed to Checkout after adding the product to the cart
    Given I am on the cart page with Combination Pliers added
    When I click on "Proceed to checkout"
    Then I should be redirected to the checkout page
