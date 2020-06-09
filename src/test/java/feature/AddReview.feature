Feature: User Add Review

  In order to perform sucessfull submit review
  I should able to fill all option of add review process

  Background: User is Logged In
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the username on login screen
    And User clicks next button on login screen
    And User enters the password on login screen
    And User clicks login button on login screen
    Then user will see modal account status on homescreen

  @FDBRMA-24
  Scenario: Add Review by select Popular Product
    Given User clicks add review from homescreen menu
    When User click one of popular product to review
    Then User choose overall rating
    And user choose usage periode product
    And user choose purchase point product
    And user choose would recommend this product
    And user fill in add review box that should contain than 200 char
    And user click submit review button
    Then user will see congrats screen and direct to review detail from feed



