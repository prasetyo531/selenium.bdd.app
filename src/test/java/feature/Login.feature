Feature: Login into account

  In order to perform sucessfull login
  User input phone number, will direct to otp
  User input email or password, display password
  If user input wrong combination display error msg
  If user input suspend email/phone display sneak msg

  @android
  Scenario Outline: Login using verified phone number
    Given User navigates to onboarding screen by swipe
    When User click login button on onboarding screen
    Then user enters the "<phonenumber>" phonenumber
    And user clicks on the next button
    When user input correct otp on otp screen to login
#    Then user will direct to homescreen

    Examples:
      |   phonenumber        |
      |	  081284915951	     |
