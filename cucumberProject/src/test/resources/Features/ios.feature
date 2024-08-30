#@tag
Feature: Amazon search and add to Cart
#  @tag1
  Scenario: Search for ios devices and add to cart
    Given I search Amazon website
    When I search for "IOS" devices
    And I add the first item to the cart
    Then I verify the first item to the cart
