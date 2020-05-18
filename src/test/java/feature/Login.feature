Feature: Login into account

  In order to perform sucessfull login
  User input phone number, will direct to otp
  User input email or password, display password
  If user input wrong combination display error msg
  If user input suspend email/phone display sneak msg

  #FDBRMA-103
  @Android @Login @Regression @RealAccount @RealDevices @IntegrationTest
  Scenario Outline: Login using verified phone number
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then user enters the "<phonenumber>" phonenumber to login
    And user clicks next button on login screen
    When user input correct otp from phone on otp screen from android to login
    Then user will see modal account status on homescreen

    Examples:
      |   phonenumber        |
      |	  081284915951	     |

    #FDBRMA-103
  @Ios @Login @Regression @RealAccount @RealDevices @IntegrationTest
  Scenario Outline: Login using verified phone number
    Given User navigates to onboarding screen by click next
    When User clicks login button on onboarding screen
    Then user enters the "<phonenumber>" phonenumber to login
    And user clicks next button on login screen
    When user input correct otp from phone on otp screen from ios to login
    Then user will see modal account status on ios homescreen

    Examples:
      |   phonenumber        |
      |	  087808192493	     |
