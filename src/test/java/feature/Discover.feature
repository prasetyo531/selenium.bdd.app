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
  Scenario: Follow - check post detail on discover
    Given User clicks discover from homescreen menu
    When User clicks post on discover
    And User clicks button follow
    And User back to discover
    When User clicks post again and button follow is dissapear
    And User back to discover
    Then User back to homescreen

  @FDBRMA-290
  Scenario: Scroll post grid and list on hashtag detail
    Given User clicks discover from homescreen menu
    When User clicks trending hashtag
    Then User scroll post grid on hashtag detail
    And User clicks random post on hashtag detail
    Then User scroll post list on hashtag detail
    And User back to post grid screen
    And User back to discover
    Then User back to homescreen

  @FDBRMA-289
  Scenario Outline: Follow - check post detail on hashtag detail
    Given User clicks discover from homescreen menu
    When User clicks search hashtag and input "<hashtag>"
    When User clicks most top hashtag of hashtag result
    And User clicks random post on hashtag detail
    And User clicks button follow
    And User back to post grid screen
    When User clicks post again and button follow is dissapear
    And User back to post grid screen
    Then User back to search hashtag screen

    Examples:
      |    hashtag        |
      |	    skin	     |


