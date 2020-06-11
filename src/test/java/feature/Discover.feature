Feature: Discover

  In order to perform sucessfull do action on discover screen
  I should able to scroll, open post detail, follow, like and comment

  Background: User is Logged In
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the username on login screen
    And User clicks next button on login screen
    And User enters the password on login screen
    And User clicks login button on login screen
    Then user will see modal account status on homescreen

  @FDBRMA-319
  Scenario: Scroll post list on discover
    Given User clicks discover from homescreen menu
    When User scroll post of discover
    Then User back to homescreen

  @FDBRMA-326
  Scenario: Follow - check post detail
    Given User clicks discover from homescreen menu
    When User clicks post on discover
    And User clicks button follow
    And User back to discover
    When User clicks post again and button follow is dissapear
    And User back to discover
    Then User back to homescreen



