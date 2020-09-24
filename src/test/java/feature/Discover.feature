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
    Then User will see modal account status on homescreen

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

  @FDBRMA-289 @FDBRMA-303
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

  @FDBRMA-291 @FDBRMA-301 @FDBRMA-302 @WIP
  Scenario Outline: Click popular hashtag on search screen - Click Like and Comment post on hashtag screen
    Given User clicks discover from homescreen menu
    When User clicks search hashtag and click trending hashtag
    Then User will directed to hashtag detail
    When User click random post then like post
    And User post comment "<comment>"
    Then User will see counter like and comment increased

    Examples:
      |           comment            |
      |	    wah aku mau juga	     |

  @FDBRMA-292
  Scenario Outline: Search result, choose hashtag through scroll
    Given User clicks discover from homescreen menu
    When User clicks search hashtag and input "<hashtag>"
    Then User scroll hashtag list on search result hashtag

    Examples:
      |    hashtag        |
      |	    skin	     |
