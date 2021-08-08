@AuthCases @AllCases
Feature: authentication

  @TestCase_1
  Scenario Outline:  I should be able to log in to the application with the correct credentials.

    Given I am on the site
    When I login with my "<user_name>" and "<password>"
    Then I should see the product page

    Examples:
      | user_name               | password     |
      | standard_user           | secret_sauce |
      | performance_glitch_user | secret_sauce |


  @TestCase_2
  Scenario Outline:  I should see an error message when entering incorrect credentials.

    Given I am on the site
    When I login with my "<user_name>" and "<password>"
    Then I should see the error <message>

    Examples:
      | user_name       | password         | message                                                                   |
      | locked_out_user | asdad123         | Epic sadface: Username and password do not match any user in this service |
      | fake_user       | =-secret_sauce - | Epic sadface: Username and password do not match any user in this service |
      | standard_user   | secret_sauce  +  | Epic sadface: Username and password do not match any user in this service |


  @TestCase_3
  Scenario Outline:  I should see an error message when entering some blank credentials.

    Given I am on the site
    When I login with my "<user_name>" and "<password>"
    Then I should see the error <message>


    Examples:
      | user_name     | password     | message                            |
      | standard_user |              | Epic sadface: Password is required |
      |               | secret_sauce | Epic sadface: Username is required |
      |               |              | Epic sadface: Username is required |


  @TestCase_4
  Scenario Outline:  I should be able to see the login page when I logout.

    Given I am on the site
    When I login with my "<user_name>" and "<password>"
    And I logout from the page
    Then I should see the login page

    Examples:
      | user_name     | password     |
      | standard_user | secret_sauce |

  @TestCase_5
  Scenario Outline: I should not be able to enter the product page without logging in.

    Given I am on the site
    When i am trying to enter the url <url>
    Then I should see the error <message>


    Examples:
      | user_name     | password | url                                      | message                                                                     |
      | standard_user | asd123   | https://www.saucedemo.com/inventory.html | Epic sadface: You can only access '/inventory.html' when you are logged in. |
