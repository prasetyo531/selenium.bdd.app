Feature: Create account

  In order to perform sucessfull register
  User can register using phone number and email

  ##################################################################################
  #ANDROID
  ##################################################################################

  #FDBRMA-119
  @Android @Register @Staging @Smoke @RealAccount @RealDevices @IntegrationTest
  Scenario Outline: Register using new phone number starts with 0
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
  @Android @Register @Production @Regression @RealAccount @Emulator @UiTest
  Scenario Outline: Register using new phone number starts with 62 and +62
    Given User navigates to onboarding screen by swipe
    When User clicks register button on onboarding screen
    Then user enters the "<phonenumber>" phonenumber to register
    And user clicks next button on register screen
    Then user will direct to otp screen from phone to register

    Examples:
      |       phonenumber        |
      |	    6281284919999	     |
      |	    +6281284919998	     |

  #FDBRMA-213 #FDBRMA-123 #FDBRMA-124 #FDBRMA-212
  @Android @Register @Production @Regression @RealAccount @Emulator @UiTest
  Scenario Outline: Signup input with invalid format phone or email
    Given User navigates to onboarding screen by swipe
    When User clicks register button on onboarding screen
    Then user enters the "<phonenumber>" phonenumber to register
    And user clicks next button on register screen
    Then display msg "This email or phone number is invalid" is displayed under phone number field

    Examples:
      |                 phonenumber                |
      |	                     0	                   |
      |	                   081702	               |
      |	         081702081702081702081702          |
      |	             wrongformatemail              |
      |	          wrongformatemail@gmail           |
      |	     wrongformatemail@gmail@gmail.com      |

  #FDBRMA-136
  @Android @Register @Production @Regression @RealAccount @Emulator @UiTest
  Scenario Outline: Signup input email with incorrect format email
    Given User navigates to onboarding screen by swipe
    When User clicks register button on onboarding screen
    Then user enters the "<email>" phonenumber to register
    And user clicks next button on register screen
    Then display msg "Please enter your correct email address" is displayed under phone number field

    Examples:
      |               email               |
      |	          jzjsh++..-@test.com     |

  #FDBRMA-214
  @Android @Register @Production @Regression @RealAccount @Emulator @UiTest
  Scenario Outline: Signup input phone number starts without 0
    Given User navigates to onboarding screen by swipe
    When User clicks register button on onboarding screen
    Then user enters the "<phonenumber>" phonenumber to register
    And user clicks next button on register screen
    Then display msg "Please enter your correct phone number" is displayed under phone number field

    Examples:
      |       phonenumber         |
      |	      81284919990	      |

  #FDBRMA-175
  @Android @Register @Production @Regression @RealAccount @Emulator @UiTest
  Scenario Outline: Register using registered phone number
    Given User navigates to onboarding screen by swipe
    When User clicks register button on onboarding screen
    Then user enters the "<phonenumber>" phonenumber to register
    And user clicks next button on register screen
    Then show modal identify your phone number android

    Examples:
      | phonenumber |
      | 08170223322 |

  #FDBRMA-130
  @Android @Register @Production @Regression @RealAccount @Emulator @UiTest
  Scenario Outline: Register using verified phone number
    Given User navigates to onboarding screen by swipe
    When User clicks register button on onboarding screen
    Then user enters the "<phonenumber>" phonenumber to register
    And user clicks next button on register screen
    Then show modal verified phone number android

    Examples:
      | phonenumber  |
      | 087885221338 |

  #FDBRMA-135

  #FDBRMA-211

  #FDBRMA-137


  ##################################################################################
  #IOS
  ##################################################################################

  #FDBRMA-119
  @Ios @Register @Staging @Regression @RealAccount @RealDevices @IntegrationTest
  Scenario Outline: Register using new phone number, starts with 0
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
  @Ios @Register @Production @Regression @RealAccount @RealDevices @UiTest
  Scenario Outline: Register using new phone number, starts with 62
    Given User navigates to onboarding screen by click next
    When User clicks register button on onboarding screen
    Then user enters the "<phonenumber>" phonenumber to register
    And user clicks next button on register screen
    Then user will direct to otp screen from phone to register

    Examples:
      |       phonenumber        |
      |	     6287808192493	     |
      |	     +6287808192493	     |

  #FDBRMA-175
  @Ios @Register @Production @Regression @RealAccount @RealDevices @UiTest
  Scenario Outline: Register using registered phone number
    Given User navigates to onboarding screen by click next
    When User clicks register button on onboarding screen
    Then user enters the "<phonenumber>" phonenumber to register
    And user clicks next button on register screen
    Then show modal identify your phone number ios

    Examples:
      |     phonenumber    |
      |     08170223322   |

  #FDBRMA-130
  @Ios @Register @Production @Regression @RealAccount @RealDevices @UiTest
  Scenario Outline: Register using verified phone number
    Given User navigates to onboarding screen by click next
    When User clicks register button on onboarding screen
    Then user enters the "<phonenumber>" phonenumber to register
    And user clicks next button on register screen
    Then show modal verified phone number ios

    Examples:
      |     phonenumber    |
      |     087885221338   |

