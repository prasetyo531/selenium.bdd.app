Feature: Create account

  In order to perform sucessfull register
  User can register using phone number and email

  ##################################################################################
  #ANDROID
  ##################################################################################

  #FDBRMA-119
  @Android @Register @Staging @Regression @RealAccount @RealDevices @IntegrationTest
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
      |   phonenumber        |              email                      |      username            |
      |	  081284915951	     |    bddappregisterandro@mailinator.com   |    bddappregisterandro    |

  #FDBRMA-120 #FDBRMA-121
  @Android @Register @Staging @Regression @RealAccount @RealDevices @UiTest
  Scenario Outline: Register using new phone number
    Given User navigates to onboarding screen by swipe
    When User clicks register button on onboarding screen
    Then user enters the "<phonenumber>" phonenumber to register
    And user clicks next button on register screen
    Then user will direct to otp screen from phone to register

    Examples:
      |       phonenumber        |
      |	    6281284919999	     |
      |	    +6281284919999	     |

  ##################################################################################
  #IOS
  ##################################################################################

  #FDBRMA-119
  @Ios @Register @Staging @Regression @RealAccount @RealDevices @IntegrationTest
  Scenario Outline: Register using new phone number
    Given User navigates to onboarding screen by click next
    When User clicks register button on onboarding screen
    Then user enters the "<phonenumber>" phonenumber to register
    And user clicks next button on register screen
    When user input correct otp from phone on otp screen from ios to register
    Then user enters the "<email>", "<username>", password and select dob to register
    And user clicks submit button on complete account screen
    Then user will see modal account status on homescreen

    Examples:
      |   phonenumber        |              email                 |      username        |
      |	  087808192493	     |    bddappregisterios@mailinator.com   |    bddappregisterios    |

  #FDBRMA-120 #FDBRMA-121
  @Ios @Register @Staging @Regression @RealAccount @RealDevices @UiTest
  Scenario Outline: Register using new phone number
    Given User navigates to onboarding screen by swipe
    When User clicks register button on onboarding screen
    Then user enters the "<phonenumber>" phonenumber to register
    And user clicks next button on register screen
    Then user will direct to otp screen from phone to register

    Examples:
      |       phonenumber        |
      |	     6281284909999	     |
      |	    +6281284909999	     |