Feature: Login into account

  In order to perform sucessfull login
  As user that have complete profile
  I should see greeting text, search bar, notification, ads

  @android
  Scenario Outline: Login to account with credentials
    Given User navigates to onboarding screen by swipe
    When User click login button on onboarding screen
    Then User input "<username>" username and "<password>" password
    When User click login button on login screen
    Then User should be directed to homescreen
    And User can see product matches

    Examples:
      |   username    |		password		 |
      |	  putwid	  |		tester123 		 |


  @ios
  Scenario Outline: Login to account with credentials
    Given User navigates to onboarding screen by click next
    When User click login button on onboarding screen
    Then User input "<username>" username and "<password>" password
    When User click login button on login screen
    Then User should be directed to homescreen
    And User can see product matches

    Examples:
      |   username    |		password		 |
      |	  putwid	  |		tester123 		 |
