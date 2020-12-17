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
    Then User will see modal account status on homescreen

  @FDBRMA-322 @demo
  Scenario: Scroll product list of brand detail
    Given User clicks menu all brand from homescreen menu
    When User clicks one of popular brand to find product
    Then User will see product list of brand