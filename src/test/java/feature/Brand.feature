Feature: User navigate to brand page

  In order to perform sucessfull submit review
  I should able to fill all option of add review process

  Background: User is Logged In
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the username on login screen
    And User clicks next button on login screen
    And User enters the password on login screen
    And User clicks login button on login screen
    Then User will be directed to homescreeen app

  @Android @Brand @FDBRMA-322
  Scenario: Scroll product list of brand detail
    Given User clicks menu all brand from homescreen menu
    When User clicks one of popular brand to find product
    Then User will see product list of brand

  @Android @Brand @AA-702
  Scenario Outline: View Brand from product detail
    Given User clicks menu product category from homescreen menu
    When User input "<brandname>" on search bar
    Then User will see search result of product
    When User tap any product from search result
    Then User will direct to product detail screen
    When User click brand name on product detail
    Then User will directed to brand screen "<brandname>"

    Examples:
      |      brandname     |
      |     Emina     |
