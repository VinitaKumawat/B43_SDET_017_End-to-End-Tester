Feature: Add to Cart Functionality

  Scenario: Add Combination Pliers to Cart
    Given I am on the Combination Pliers product page
    When I click on "Add to cart"
    Then the product should be added to the cart successfully
