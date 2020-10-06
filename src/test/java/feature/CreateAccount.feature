Feature: Create account

  In order to perform sucessfull register
  User can register using phone number and email

  ##################################################################################
  #ANDROID
  ##################################################################################

  #FDBRMA-119
  @Android @Register @Staging @Smoke @RealAccount @RealDevices @IntegrationTest
  Scenario Outline: Signup using new phone number starts with 0
    Given User navigates to onboarding screen by swipe
    When User clicks register button on onboarding screen
    Then User enters the "<phonenumber>" phonenumber to register
    And User clicks next button on register screen
    When user input correct otp from phone on otp screen to register
    Then user enters the "<email>", "<username>", password and select dob to register
    And user clicks submit button on complete account screen
    Then User will see modal account status on homescreen

    Examples:
      |   phonenumber        |              email          |      username     |
      |	  081284915951	     |    realotp@mailinator.com   |     realotp01     |

  #FDBRMA-120 #FDBRMA-121
  @Android @Register @Production @Regression @RealAccount @Emulator @UiTest
  Scenario Outline: Signup using new phone number starts with 62 and +62
    Given User navigates to onboarding screen by swipe
    When User clicks register button on onboarding screen
    Then User enters the "<phonenumber>" phonenumber to register
    And User clicks next button on register screen
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
    Then User enters the "<phonenumber>" phonenumber to register
    And User clicks next button on register screen
    Then display msg "This email or phone number is invalid" is displayed under phone number field

    Examples:
      |                 phonenumber                |
      |	                     0	                   |
      |	                   081702	               |
      |	         081702081702081702081702          |
      |	             wrongformatemail              |
      |	          wrongformatemail@gmail           |
      |	     wrongformatemail@gmail@gmail.com      |

  #FDBRMA-130
  @Android @Register @Production @Regression @RealAccount @Emulator @UiTest
  Scenario Outline: Signup using verified phone number
    Given User navigates to onboarding screen by swipe
    When User clicks register button on onboarding screen
    Then User enters the "<phonenumber>" phonenumber to register
    And User clicks next button on register screen
    Then show modal verified phone number android

    Examples:
      | phonenumber  |
      | 087885221338 |

  #FDBRMA-135
  @Android @Register @Production @Regression @RealAccount @Emulator @UiTest
  Scenario Outline: Sign up using new email address
    Given User navigates to onboarding screen by swipe
    When User clicks register button on onboarding screen
    Then user enters the "<email>" email to register
    And User clicks next button on register screen
    Then user will direct to otp screen from email to register

    Examples:
      |                      email                       |
      |	   bddappregisterphoneandroid99@mailinator.com     |

  #FDBRMA-363
  @Android @Register @Production @Regression @RealAccount @Emulator @UiTest
  Scenario Outline: Signup input email with incorrect format email
    Given User navigates to onboarding screen by swipe
    When User clicks register button on onboarding screen
    Then User enters the "<email>" phonenumber to register
    And User clicks next button on register screen
    Then display msg "Please enter your correct email address" is displayed under phone number field

    Examples:
      |               email               |
      |	          jzjsh++..-@test.com     |

  #FDBRMA-214
  @Android @Register @Production @Regression @RealAccount @Emulator @UiTest
  Scenario Outline: Signup input phone number starts without 0
    Given User navigates to onboarding screen by swipe
    When User clicks register button on onboarding screen
    Then User enters the "<phonenumber>" phonenumber to register
    And User clicks next button on register screen
    Then display msg "Please enter your correct phone number" is displayed under phone number field

    Examples:
      |       phonenumber         |
      |	      81284919990	      |

  #FDBRMA-175
  @Android @Register @Production @Regression @RealAccount @Emulator @UiTest
  Scenario Outline: Signup using registered phone number
    Given User navigates to onboarding screen by swipe
    When User clicks register button on onboarding screen
    Then User enters the "<phonenumber>" phonenumber to register
    And User clicks next button on register screen
    Then show modal identify your phone number android

    Examples:
      | phonenumber |
      | 08170223322 |


  @Android @Register @Production @Regression @RealAccount @Emulator @UiTest
  Scenario Outline: Signup using registered email
    Given User navigates to onboarding screen by swipe
    When User clicks register button on onboarding screen
    Then User enters the "<email>" phonenumber to register
    And User clicks next button on register screen
    Then show modal email has been registered

    Examples:
      |            email           |
      | sprint46ios@mailinator.com |

  #FDBRMA-137
  @Android @Register @Production @Regression @RealAccount @Emulator @UiTest
  Scenario Outline: Signup using verified email
    Given User navigates to onboarding screen by swipe
    When User clicks register button on onboarding screen
    Then user enters the "<email>" email to register
    And User clicks next button on register screen
    Then show modal verified email android

    Examples:
      |          email            |
      | testflight@mailinator.com |

  #FDBRMA-211
  @Android @Register @Production @Regression @RealAccount @Emulator @UiTest
  Scenario Outline: Signup input unregistered phone from login modal account not found
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<phonenumber>" phonenumber to login
    And User clicks next button on login screen
    Then user see and click yes on modal phone number is not registered
    Then User enters the "<phonenumber>" phonenumber to register
    And User clicks next button on register screen

    Examples:
      |     phonenumber      |
      |	    6285678900987	 |

  #FDBRMA-119 #FDBRMA-144
  @Android @bypassotp
  Scenario Outline: Signup using new phone number starts with 0
    Given User navigates to onboarding screen by swipe
    When User clicks register button on onboarding screen
    Then User enters the "<phonenumber>" phonenumber to register
    And User clicks next button on register screen
    When user input bypass otp from phone on otp screen to register
    Then user enters the "<email>", "<username>", password and select dob to register
    And user clicks submit button on complete account screen
    Then User will see modal account status on homescreen

    Examples:
      |   phonenumber        |              email               |      username     |
      |	  081501209990	     |    bypassotp_02@mailinator.com   |    bypassotp02    |


  # Verification Screen #

  #FDBRMA-143 #FDBRMA-148
  @Android @bypassotp
  Scenario Outline: Input Wrong verification code - Resend code
    Given User navigates to onboarding screen by swipe
    When User clicks register button on onboarding screen
    Then User enters the "<phonenumber>" phonenumber to register
    And User clicks next button on register screen
    When User input wrong otp code
    Then Display error msg "You entered invalid code"
    When User click resend code
    Then Error msg will dissapear

    Examples:
      |   phonenumber        |
      |	  081501209990	     |

  #FDBRMA-145  #FDBRMA-215
  @Android @bypassotp
  Scenario Outline: Resend code more than 3 times
    Given User navigates to onboarding screen by swipe
    When User clicks register button on onboarding screen
    Then User enters the "<phonenumber>" phonenumber to register
    And User clicks next button on register screen
    When User click resend code 3 times
    Then Display error msg "You have reached a limit for sending code. Please try again in 58 minutes"
    When User input wrong otp code
    Then Display error msg "You entered invalid code"
    When User click resend code 3 times
    Then Display error msg "You have reached a limit for sending code. Please try again in 58 minutes"

  ##################################################################################
  #IOS
  ##################################################################################

  #FDBRMA-119
  @Ios @Register @Staging @Regression @RealAccount @RealDevices @IntegrationTest
  Scenario Outline: Register using new phone number, starts with 0
    Given User navigates to onboarding screen by click next
    When User clicks register button on onboarding screen
    Then User enters the "<phonenumber>" phonenumber to register
    And User clicks next button on register screen
    When user input correct otp from phone on otp screen from ios to register
    Then user enters the "<email>", "<username>", password and select dob to register
    And user clicks submit button on complete account screen
    Then User will see modal account status on homescreen

    Examples:
      |   phonenumber        |              email                 |      username        |
      |	  087808192493	     |    bddappregisterios@mailinator.com   |    bddappregisterios    |

  #FDBRMA-120 #FDBRMA-121
  @Ios @Register @Production @Regression @RealAccount @RealDevices @UiTest
  Scenario Outline: Register using new phone number, starts with 62
    Given User navigates to onboarding screen by click next
    When User clicks register button on onboarding screen
    Then User enters the "<phonenumber>" phonenumber to register
    And User clicks next button on register screen
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
    Then User enters the "<phonenumber>" phonenumber to register
    And User clicks next button on register screen
    Then show modal identify your phone number ios

    Examples:
      |     phonenumber    |
      |     08170223322   |

  #FDBRMA-130
  @Ios @Register @Production @Regression @RealAccount @RealDevices @UiTest
  Scenario Outline: Register using verified phone number
    Given User navigates to onboarding screen by click next
    When User clicks register button on onboarding screen
    Then User enters the "<phonenumber>" phonenumber to register
    And User clicks next button on register screen
    Then show modal verified phone number ios

    Examples:
      |     phonenumber    |
      |     087885221338   |

