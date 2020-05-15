Feature: Create account

  In order to perform sucessfull register
  User can register using phone number and email

  @Android @Register @Regression @RealAccount @RealDevices @IntegrationTest
  Scenario Outline: Register using new phone number
    Given User navigates to onboarding screen by swipe
    When User clicks register button on onboarding screen
    Then user enters the "<phonenumber>" phonenumber to register
    And user clicks next button on register screen
    When user input correct otp from phone on otp screen to register
    Then user enters the "<email>", "<username>", password and select dob to register
    And user clicks submit button on complete account screen
    Then user will see modal account status on homescreen

    Examples:
      |   phonenumber        |              email                 |      username        |
      |	  081284915951	     |    bddappregister@mailinator.com   |    bddappregister    |