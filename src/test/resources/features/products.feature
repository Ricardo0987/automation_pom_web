@ProductCases @AllCases
Feature: Products page

  Background:
    Given I am on the site
    When I login with my "standard_user" and "secret_sauce"
    Then I should see the product page

  @TestCase_6
  Scenario Outline: Sort products
    Given I am on the products page
    When I Sort products by "<value>"
    Then I should see the products ordered "<products_ordered>"

    Examples:
      | value      | products_ordered                                      |
      | name_asc   | Sauce Labs Backpack,Test.allTheThings() T-Shirt (Red) |
      | name_desc  | Test.allTheThings() T-Shirt (Red),Sauce Labs Backpack |
      | price_asc  | Sauce Labs Onesie,Sauce Labs Fleece Jacket            |
      | price_desc | Sauce Labs Fleece Jacket,Sauce Labs Onesie            |


  @TestCase_7
  Scenario: add Product to the cart
    Given I am on the products page
    When I add product to the cart
    Then I should see the products added to the cart


  @TestCase_8
  Scenario: remove Product to the cart
    Given I am on the products page
    When I add product to the cart
    And I should see the products added to the cart
    And I remove product to the cart
    Then I should see the shopping cart empty


