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
    Then User will be directed to homescreeen app

  @Android @Discover1 @Staging @FDBRMA-319
  Scenario: Scroll post list on discover
    Given User clicks discover from homescreen menu
    When User scroll post of discover
    Then User back to homescreen

  @Android @Discover @Production @FDBRMA-290
  Scenario: Scroll post grid and list on hashtag detail
    Given User clicks discover from homescreen menu
    When User clicks trending hashtag
    Then User scroll post grid on hashtag detail
    And User clicks random post on hashtag detail
    Then User scroll post list on hashtag detail
    And User back to post grid screen
    And User back to discover
    Then User back to homescreen

  @Android @Discover @Production @FDBRMA-291 @FDBRMA-301 @FDBRMA-302
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

  @Android @Discover @Production @FDBRMA-292
  Scenario Outline: Search result, choose hashtag through scroll
    Given User clicks discover from homescreen menu
    When User clicks search hashtag and input "<hashtag>"
    Then User scroll hashtag list on search result hashtag

    Examples:
      |    hashtag        |
      |	    skin	     |
