Feature: Login into account

  @android
  Scenario Outline: Login to account with credentials
    Given user swipe images onboarding screen
    When user clicks on the login button
    Then user directed to login form
    And user enters the "<username>" username
    And user enter the "<password>" password
    And user clicks on the login button
    Then user should be directed to homepage

    Examples:
      |   username    |		password		 |
      |	  testqa	  |		test123 		 |
