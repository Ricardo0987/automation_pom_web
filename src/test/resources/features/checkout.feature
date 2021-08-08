@Checkout @AllCases
Feature: checkout

  Background:
    Given I am on the site
    When I login with my "standard_user" and "secret_sauce"
    Then I should see the product page

  @TestCase_9
  Scenario: make a successful purchase
    Given I am on the products page
    When I add product to the cart
    And I should see the products added to the cart
    And I am trying to purchase the product with my personal data "ricardo,ospina,050001"
    Then I should see the thank you page
