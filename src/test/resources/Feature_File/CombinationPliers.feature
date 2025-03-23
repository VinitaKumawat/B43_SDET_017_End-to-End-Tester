Feature: Combination Pliers Page

  Scenario: Add Combination Pliers to Cart
    Given I am on the Combination Pliers product page
    When I add the product to the cart
    Then I should see a confirmation message for adding to the cart

  Scenario: Add Combination Pliers to Favourites
    Given I am on the Combination Pliers product page
    When I add the product to favourites
    Then I should see a confirmation message for adding to favourites
