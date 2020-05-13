Feature: Verify account

  In order to perform sucessfull verify
  User should have real email
  User should have real number
  User should fill personal info, beauty profile and concern

  @Android @Smoke @Profile @RealDevices
  Scenario Outline: Verify profile as registered user, user havent complete any detail
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then user enters the "<username>" on login screen
    And user enters the "<password>" on login screen
    And user clicks login button on login screen
    When user click complete verify button on homescreen
    Then user clicks verify now button on verify email screen
    And user fill phone and verify on verify phone screen
    And user fill all mandatory field on personal info screen
    And user choose beauty profile on beauty profile screen
    And user choose beauty profile on beauty concern screen
    Then user will see congratulation modal

    Examples:
      |   username        |   password    |
      |	  bddregister	  |   test123     |