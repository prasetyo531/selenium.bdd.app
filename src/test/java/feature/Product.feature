Feature: User navigate to screen related to product action

  In order to perform sucessfull share, add wishlist, remove wishlist, filter
  And sort product
  I should able to operate all feature

  Background: User is Logged In
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the username on login screen
    And User clicks next button on login screen
    And User enters the password on login screen
    And User clicks login button on login screen
    Then User will see modal account status on homescreen

  #FDBRMA-596
  @Android @Staging @Product @Producttest
  Scenario Outline: Search product from product category
    Given User clicks menu product category from homescreen menu
    When User input "<productname>" on search bar
    Then User will see search result of product
    When User tap any product from search result
    Then User will direct to product detail screen
    When User click back from product detail
    Then User will see search result and condition state

    Examples:
      | productname  |
      |     natu     |

  #FDBRMA-413
  @Android @Staging @Product @Producttest
  Scenario Outline: Check if product has no review
    Given User clicks menu product category from homescreen menu
    When User input "<productname>" on search bar
    Then User will see search result of product
    When User tap product without review from search result
    Then User will see wording be the first to review this product

    Examples:
      | productname  |
      | citrus kombucha |