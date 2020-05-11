Feature: Login into account

  In order to perform sucessfull login
  User input phone number, will direct to otp
  User input email or password, display password
  If user input wrong combination display error msg
  If user input suspend email/phone display sneak msg

  @androidoldlogin
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

  @iosoldlogin
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

  @android
  Scenario Outline: Login using verified phone number
    Given user has accessed login screen
    And user enters the "<phonenumber>" phonenumber
    When user clicks on the login button
#    Then user will direct to verification page
#    And user enters the "<otp>" otp code
#    When user click on the confirm button
#    Then user will direct to homepage
    Examples:
      |   phonenumber        |
      |	  085319323869	     |
