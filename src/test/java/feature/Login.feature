Feature: Login into account

  In order to perform sucessfull login
  As user that have complete profile
  I should see product matches

  @android
  Scenario Outline: Login to account with credentials
    Given User navigates to onboarding screen by swipe
    When User click login button on onboarding screen
    Then User input the "<username>" username
    And User input the "<password>" password
    When User clicks on the login button
    Then User should be directed to homepage
    And User can see product matches

    Examples:
      |   username    |		password		 |
      |	  testqa	  |		test123 		 |
