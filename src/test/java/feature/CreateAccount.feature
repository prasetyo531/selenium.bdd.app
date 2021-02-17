Feature: Create account

  In order to perform sucessfull register
  User can register using phone number and email

  ##################################################################################
  #ANDROID
  ##################################################################################

  #FDBRMA-119 #FDBRMA-142 #FDBRMA-155
  @Android @Register @Staging @Smoke @RealAccount @RealDevices @IntegrationTest
  Scenario Outline: Signup using new phone number starts with 0
    Given User navigates to onboarding screen by swipe
    When User clicks register button on onboarding screen
    Then User enters the "<phonenumber>" phonenumber to register
    And User clicks next button on register screen
    When user input correct otp from phone on otp screen to register
    Then user enters the "<email>", "<username>", password and select dob to register by phone
    And user clicks submit button on complete account screen
    Then User will see modal account status on homescreen

    Examples:
      |   phonenumber        |              email                  |      username     |
      |	  0812119119119	     |    bddregisandro01@mailinator.com   |     bddregisandro01     |

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
      |	    62812120120120	     |
      |	    +62812120120120	     |

  #FDBRMA-213 #FDBRMA-123 #FDBRMA-124
  @Android @Register @Production @Regression @RealAccount @Emulator @UiTest
  Scenario Outline: Signup input with invalid format phone
    Given User navigates to onboarding screen by swipe
    When User clicks register button on onboarding screen
    Then User enters the "<auth>" to register
    And User clicks next button on register screen
    Then display msg "This phone number is invalid" is displayed under phone number field

    Examples:
      |                     auth                   |
      |	                     0	                   |
      |	                   081702	               |
      |	         081702081702081702081702          |

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
      | 081284910005 |

  #FDBRMA-214
  @Android @Register @Production @Regression @RealAccount @Emulator @UiTest
  Scenario Outline: Signup input phone number starts without 0
    Given User navigates to onboarding screen by swipe
    When User clicks register button on onboarding screen
    Then User enters the "<phonenumber>" phonenumber to register
    And User clicks next button on register screen
    Then user will direct to otp screen from phone to register

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
      | 62812000978846 |

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

  #FDBRMA-119 #FDBRMA-142 #FDBRMA-155
  @FDBRMA-119 @bypassotp
  Scenario Outline: Signup using new phone number starts with 0 - by pass otp
    Given User navigates to onboarding screen by swipe
    When User clicks register button on onboarding screen
    Then User enters the "<phonenumber>" phonenumber to register
    And User clicks next button on register screen
    When user input bypass otp from phone on otp screen to register
    Then user enters the "<email>", "<username>", password and select dob to register by phone
    And user clicks submit button on complete account screen
    Then User will see modal account status on homescreen

    Examples:
      |   phonenumber        |              email                    |      username     |
      |	  0813142142155      |    bypassotpnumber04@mailinator.com   |    bypassotpnumber04    |

  ### Verification Screen ###

  #FDBRMA-143 #FDBRMA-144 #FDBRMA-148 #FDBRMA-178 #FDBRMA-179 #FDBRMA-182
  @FDBRMA-143 @DataStaging @otpScreen
  Scenario Outline: Input Wrong verification code - Resend code
    Given User navigates to onboarding screen by swipe
    When User clicks register button on onboarding screen
    Then User enters the "<auth>" to register
    And User clicks next button on register screen
    When User input wrong otp code
    Then Display error msg "You entered invalid code"
    When User click resend code
    Then Error msg will stay still

    Examples:
      |       auth        |
      |	  0815144144144	  |

  #FDBRMA-145 #FDBRMA-215 #FDBRMA-180 #FDBRMA-181
  @FDBRMA-145 @DataStaging @otpScreen
  Scenario Outline: Resend code more than 3 times
    Given User navigates to onboarding screen by swipe
    When User clicks register button on onboarding screen
    Then User enters the "<auth>" to register
    And User clicks next button on register screen
    When User click resend code 4 times
    Then Display error msg suspend "You have reached a limit for sending code. Please try again in"
    When User input wrong otp code after suspended
    Then Display error msg "You entered invalid code"
    When User click resend code
    Then Display error msg suspend "You have reached a limit for sending code. Please try again in"

    Examples:
      |       auth        |
      |	  0818215215181	  |

  #FDBRMA-154
  @FDBRMA-154 @DataStaging @otpScreen
  Scenario Outline: Tap to change number - input email
    Given User navigates to onboarding screen by swipe
    When User clicks register button on onboarding screen
    Then User enters the "<phone>" phonenumber to register
    And User clicks next button on register screen
    When User clicks tap to change auth and input email "<email>"
    Then display msg "This phone number is invalid" is displayed under phone number field

    Examples:
      |       phone        |    email     |
      |	  081284915950	   |  taptochangemail01@mailinator.com  |

  ### Complete Account Screen ###

  #FDBRMA-158
  @Android @DataStaging @completeAccount
  Scenario Outline: Submit input incorrect email address format
    Given User navigates to onboarding screen by swipe
    When User clicks register button on onboarding screen
    Then User enters the "<phonenumber>" phonenumber to register
    And User clicks next button on register screen
    When user input bypass otp from phone on otp screen to register
    Then user enters the "<email>", "<username>", password and select dob but input incorrect format email
    And user clicks submit button on complete account screen
    Then User will see error msg "Please enter your correct email address" underneath email field

    Examples:
      |   phonenumber        |        email            |      username      |
      |	  081301200158	     |    taptochangemail02    |    withoutemail    |

  #FDBRMA-161 #FDBRMA-162
  @Android @DataStaging @completeAccount
  Scenario Outline: Submit input incorrect username format - less than 3 - more than 25 - register by phone
    Given User navigates to onboarding screen by swipe
    When User clicks register button on onboarding screen
    Then User enters the "<phonenumber>" phonenumber to register
    And User clicks next button on register screen
    When user input bypass otp from phone on otp screen to register
    Then user enters the "<email>", "<username>", password and select dob to register by phone
    And user clicks submit button on complete account screen
    Then User will see error msg "Username should be 3-25 characters in length" underneath username field

    Examples:
      |   phonenumber        |              email                    |      username     |
      |	  081301200161	     |    wrongusernameformat01@mailinator.com   |    un    |
      |	  081301200161	     |    wrongusernameformat01@mailinator.com   |    unasdfgthlowsdfrtflsxcdsasdf    |

  #FDBRMA-163
  @Android @DataStaging @completeAccount
  Scenario Outline: Submit input incorrect username format - contains special char
    Given User navigates to onboarding screen by swipe
    When User clicks register button on onboarding screen
    Then User enters the "<phonenumber>" phonenumber to register
    And User clicks next button on register screen
    When user input bypass otp from phone on otp screen to register
    Then user enters the "<email>", "<username>", password and select dob to register by phone
    And user clicks submit button on complete account screen
    Then User will see error msg "Please use alphabets, numbers, and '_' symbol only" underneath username field

    Examples:
      |   phonenumber        |              email                    |      username     |
      |	  081301200163	     |    wrongusernameformat03@mailinator.com   |    usern@m3    |

  #FDBRMA-164
  @Android @DataStaging @completeAccount
  Scenario Outline: Submit input password same with username
    Given User navigates to onboarding screen by swipe
    When User clicks register button on onboarding screen
    Then User enters the "<phone>" to register
    And User clicks next button on register screen
    When user input bypass otp on otp screen to register
    Then user enters the "<email>", "<username>", but fill "<password>" same with username to register by phone
    And user clicks submit button on complete account screen
    Then User will see error msg "Your password cannot include your username" underneath password field

    Examples:
      |         phone             |                email                |      username     |    password     |
      |	       081301200164	      |    passusersama01@mailinator.com    |      password1    |    password1    |

  #FDBRMA-165
  @Android @DataStaging @completeAccount
  Scenario Outline: Submit input registered username - register by phone
    Given User navigates to onboarding screen by swipe
    When User clicks register button on onboarding screen
    Then User enters the "<phone>" to register
    And User clicks next button on register screen
    When user input bypass otp on otp screen to register
    Then user enters the "<email>" but input registered "<username>" to register by phone
    And user clicks submit button on complete account screen
    Then User will see error msg "Username has been taken" underneath username field

    Examples:
      |       phone        |    email                        |      username         |
      |	  081284915165	   |  registereduser@mailinator.com  |      datatnr01         |

  #FDBRMA-167 #FDBRMA-168
  @Android @DataStaging @completeAccount
  Scenario Outline: Submit input password less than 6 - more than 25 - register by phone
    Given User navigates to onboarding screen by swipe
    When User clicks register button on onboarding screen
    Then User enters the "<phone>" to register
    And User clicks next button on register screen
    When user input bypass otp on otp screen to register
    Then user enters the "<email>", "<username>" but input wrong format "<password>" password to register by phone
#    And user clicks submit button on complete account screen
    Then User will see error msg "Password should be 6-25 characters in length" underneath password field

    Examples:
      |       phone        |    email                        |            username             |    password    |
      |	  081384915167	   |  wrongformatpass01@mailinator.com  |      wrongformatpass         |   abcd         |
      |	  081384915168	   |  wrongformatpass02@mailinator.com  |      wrongformatpass         |   abcd1234abcd1234abcd1234abcd    |

  #FDBRMA-202
  @Android @DemoPras @DataStaging @completeAccount @register
  Scenario Outline: Submit input incorrect username format - contains special char
    Given User navigates to onboarding screen by swipe
    When User clicks register button on onboarding screen
    Then User enters the "<phone>" phonenumber to register
    And User clicks next button on register screen
    When user input bypass otp from phone on otp screen to register
    Then user enters the "<email>", "<username>", password and select dob to register by phone
    And user clicks submit button on complete account screen
    Then User will see error msg "Please use alphabets, numbers, and '_' symbol only" underneath username field

    Examples:
      |   phone           |              email                        |     username     |
      |	  081301200202	  |    wrongusernameformat04@mailinator.com   |     usern@m3     |

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
    Then user enters the "<email>", "<username>", password and select dob to register by phone
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

