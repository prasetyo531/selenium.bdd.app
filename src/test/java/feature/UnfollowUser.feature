Feature: Unfollow User

  Background: User is Logged In
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the username on login screen
    And User clicks next button on login screen
    And User enters the password on login screen
    And User clicks login button on login screen
    Then User will be directed to homescreeen app

  #staging
  @Android @Comment @RPA-199
  Scenario Outline: Search user then Unfollow them from user profile screen
    When User clicks search "<fullname>" users on homescreen
    And User select most top result
    When User clicks unfollow on user profile
    Then User will see button change to follow

    Examples:
      |   fullname    |
      |	  hanafeberia |