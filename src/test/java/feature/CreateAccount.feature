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
    Then User enters the "<auth>" to register
    And User clicks next button on register screen
    Then display msg "This email or phone number is invalid" is displayed under phone number field

    Examples:
      |                     auth                   |
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

  #FDBRMA-363
  @Android @Register @Production @Regression @RealAccount @Emulator @UiTest
  Scenario Outline: Signup input email with incorrect format email
    Given User navigates to onboarding screen by swipe
    When User clicks register button on onboarding screen
    Then User enters the "<email>" email to register
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
    Then User enters the "<email>" email to register
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
    Then User enters the "<email>" email to register
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
      |	  081301209991	     |    bypassotpnumber02@mailinator.com   |    bypassotpnumber02    |

  #FDBRMA-135 #FDBRMA-177 #FDBRMA-189 #FDBRMA-197 #FDBRMA-198
  @FDBRMA-135 @bypassotp
  Scenario Outline: Sign up using new email address - by pass otp - input phone starts with 0 and 62
    Given User navigates to onboarding screen by swipe
    When User clicks register button on onboarding screen
    Then User enters the "<email>" email to register
    And User clicks next button on register screen
    When user input bypass otp from email on otp screen to register
    Then user enters the "<phone>", "<username>", password and select dob to register by email
    And user clicks submit button on complete account screen
    Then User will see modal account status on homescreen

    Examples:
      |            email                      |       phone         |       username       |
      |	   bypassotpemail03@mailinator.com   |    081201209197     |     bypassotpemail03  |
      |	   bypassotpemail03@mailinator.com   |    081201209198     |     bypassotpemail03  |

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
      |	  08150125012	  |
      |   wrongotp_01@test.com   |

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
      |	  08180125012	  |
      |   wrongotp_001@test.com   |

  #FDBRMA-154
  @FDBRMA-154 @DataStaging @otpScreen
  Scenario Outline: Tap to change number - input email
    Given User navigates to onboarding screen by swipe
    When User clicks register button on onboarding screen
    Then User enters the "<phone>" phonenumber to register
    And User clicks next button on register screen
    When User clicks tap to change auth and input email "<email>"
    Then User direct to verify email screen

    Examples:
      |       phone        |    email     |
      |	  081284915950	   |  taptochangemail01@mailinator.com  |

  #FDBRMA-188
  @FDBRMA-188 @DataStaging @otpScreen
  Scenario Outline: Tap to change email - input phone
    Given User navigates to onboarding screen by swipe
    When User clicks register button on onboarding screen
    Then User enters the "<email>" email to register
    And User clicks next button on register screen
    When User clicks tap to change auth and input phone "<phone>"
    Then User direct to verify phone screen

    Examples:
      |                   email                |    phone     |
      |	  taptochangemail02@mailinator.com	   |  081284915992  |

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

  #FDBRMA-194 #FDBRMA-195
  @Android @DataStaging @completeAccount
  Scenario Outline: Sign up by fill phone number - less than 8 - more than 14 digit
    Given User navigates to onboarding screen by swipe
    When User clicks register button on onboarding screen
    Then User enters the "<email>" email to register
    And User clicks next button on register screen
    When user input bypass otp from email on otp screen to register
    Then user enters the "<phone>", "<username>", password and select dob to register by email
    And user clicks submit button on complete account screen
    Then User will see error msg "Please enter your correct phone number" underneath phone field

    Examples:
      |            email                      |    phone       |       username        |
      |	   phoneformatless8@mailinator.com    |    081287      |     phoneformatless8  |
      |	   phoneformatmore14@mailinator.com   |    08128780012901 |     phoneformatmore14  |

  #FDBRMA-196 #cek db dulu
  @Android @DemoPras @DataStaging @completeAccount
  Scenario Outline: Submit input registered phone number
    Given User navigates to onboarding screen by swipe
    When User clicks register button on onboarding screen
    Then User enters the "<email>" email to register
    And User clicks next button on register screen
    When user input bypass otp from email on otp screen to register
    Then user enters the registered "<phone>", "<username>", password and select dob to register by email
    And user clicks submit button on complete account screen
    Then User will see modal account status on homescreen

    Examples:
      |            email                     |    phone          |       username        |
      |	   registeredphone@mailinator.com    |    6281320180251      |     registeredphone  |

  #FDBRMA-364
  @Android @DemoPras @DataStaging @completeAccount
  Scenario Outline: Submit input verified phone number
    Given User navigates to onboarding screen by swipe
    When User clicks register button on onboarding screen
    Then User enters the "<email>" email to register
    And User clicks next button on register screen
    When user input bypass otp from email on otp screen to register
    Then user enters the verified "<phone>", "<username>", password and select dob to register by email
    And user clicks submit button on complete account screen
    Then User will see error msg "Phone number has been registered" underneath phone field

    Examples:
      |            email                   |    phone             |       username        |
      |	   verifiedphone@mailinator.com    |    628118161597      |     verifiedphone  |

  #FDBRMA-200 #FDBRMA-201
  @Android @DataStaging @completeAccount
  Scenario Outline: Submit input incorrect username format - less than 3 - more than 25 - register by email
    Given User navigates to onboarding screen by swipe
    When User clicks register button on onboarding screen
    Then User enters the "<email>" email to register
    And User clicks next button on register screen
    When user input bypass otp on otp screen to register
    Then user enters the "<phone>", "<username>", password and select dob to register by email
    And user clicks submit button on complete account screen
    Then User will see error msg "Username should be 3-25 characters in length" underneath username field

    Examples:
      |            email                      |       phone         |       username       |
      |	   wrongusernameformat02@mailinator.com   |    081201209200      |     un          |
      |	   wrongusernameformat02@mailinator.com   |    081201209200      |     unasdfgthlowsdfrtflsxcdsasdf  |

  #FDBRMA-202
  @Android @DemoPras1 @DataStaging @completeAccount
  Scenario Outline: Submit input incorrect username format - contains special char
    Given User navigates to onboarding screen by swipe
    When User clicks register button on onboarding screen
    Then User enters the "<email>" phonenumber to register
    And User clicks next button on register screen
    When user input bypass otp from phone on otp screen to register
    Then user enters the "<phone>", "<username>", password and select dob to register by phone
    And user clicks submit button on complete account screen
    Then User will see error msg "Please use alphabets, numbers, and '_' symbol only" underneath username field

    Examples:
      |   email           |              phone                        |     username     |
      |	  081301200202	  |    wrongusernameformat04@mailinator.com   |     usern@m3     |

  #FDBRMA-203
  @Android @DataStaging @completeAccount
  Scenario Outline: Submit input password same with username
    Given User navigates to onboarding screen by swipe
    When User clicks register button on onboarding screen
    Then User enters the "<email>" email to register
    And User clicks next button on register screen
    When user input bypass otp on otp screen to register
    Then user enters the "<phone>", "<username>", but fill "<password>" same with username to register by email
    And user clicks submit button on complete account screen
    Then User will see error msg "Your password cannot include your username" underneath password field

    Examples:
      |         email                   |     phone           |      username     |    password     |
      |	  passusersama02@mailinator.com	|    081301200203    |      password2        |    password2    |

  #FDBRMA-204
  @Android @DataStaging @completeAccount
  Scenario Outline: Submit input registered username - register by email
    Given User navigates to onboarding screen by swipe
    When User clicks register button on onboarding screen
    Then User enters the "<email>" email to register
    And User clicks next button on register screen
    When user input bypass otp on otp screen to register
    Then user enters the "<phone>", but input registered "<username>" to register by email
    And user clicks submit button on complete account screen
    Then User will see error msg "Username has been taken" underneath username field

    Examples:
      |         email                   |     phone          |      username     |
      |	  registereduser@mailinator.com	|    081301200204    |      datatnr01    |

  #FDBRMA-206 #FDBRMA-207
  @Android @DemoPras @DataStaging @completeAccount
  Scenario Outline: Submit input password less than 6 - more than 25 - register by email
    Given User navigates to onboarding screen by swipe
    When User clicks register button on onboarding screen
    Then User enters the "<email>" to register
    And User clicks next button on register screen
    When user input bypass otp on otp screen to register
    Then user enters the "<phone>", "<username>" but input wrong format "<password>" password to register by email
#    And user clicks submit button on complete account screen
    Then User will see error msg "Password should be 6-25 characters in length" underneath password field

    Examples:
      |       email                            |    phone        |         username             |    password    |
      |	  wrongformatpass03@mailinator.com	   |  081384915206   |      wrongformatpass         |   abcd         |
      |	  wrongformatpass04@mailinator.com	   |  6281384915207  |      wrongformatpass         |   abcd1234abcd1234abcd1234abcd    |

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

