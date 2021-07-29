Feature: Follow User

  Background: User is Logged In
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the username on login screen
    And User clicks next button on login screen
    And User enters the password on login screen
    And User clicks login button on login screen
    Then User will be directed to homescreeen app

  #staging
  @Android @Comment @RPA-203
  Scenario Outline: Search user then Follow them from user profile screen
    When User clicks search "<fullname>" users on homescreen
    And User select most top result
    When User clicks follow on user profile
    Then User will see button change to following

    Examples:
      |   fullname    |
      |	  hanafeberia |

  @Android @Discover @Staging @RPA-200
  Scenario: Follow - check post detail on discover
    Given User clicks discover from homescreen menu
    When User clicks post on discover
    And User clicks button follow
    And User back to discover
    When User clicks post again and button follow is dissapear
    And User back to discover
    Then User back to homescreen

  @Android @Discover @Production @FDBRMA-289 @RPA-201
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
      |	    hash	     |

  #follower-following screen
  #RPA-277 #RPA-202 #RPA-297
  @Android @Comment @RPA-277
  Scenario: Open Followers Tab From Followers Counter at Profile Screen - Open Another User Profile Screen From Followers Tab - Follow user from follow button at followers list
    When User clicks followers tab profile
    Then User will see list user which following account
    When User clicks follow on list follower
    Then User will see button change to following on list
    When User click user from list
    Then User will directed to user profile