Feature: Invite Friends

  In order to acceptence criteria
  User can share invite url to their contacts

  Background: User is Logged In
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the username on login screen
    And User clicks next button on login screen
    And User enters the password on login screen
    And User clicks login button on login screen
    Then User will be directed to homescreeen app

  @RPA-227 @feedback @Staging @OkrDone @DemoTest
  Scenario: Invite Friends Using Share Button
    Given User open profile then open invite menu
    When User click share
    Then User will see option which app to taking share