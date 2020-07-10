Feature: Login into account

  In order to perform sucessfull login
  User input phone number, will direct to otp
  User input email or password, display password
  If user input wrong combination display error msg
  If user input suspend email/phone display sneak msg

  ##################################################################################
  #ANDROID
  ##################################################################################

  #FDBRMA-171 #FDBRMA-103 #FDBRMA-116
  @Android @Login @Staging @Smoke @RealAccount @RealDevices @IntegrationTest
  Scenario Outline: Login using verified phone number
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<phonenumber>" phonenumber to login
    And User clicks next button on login screen
    When user input correct otp from phone on otp screen from android to login
    Then User will see modal account status on homescreen

    Examples:
      |        phonenumber          |
      |	       081284915951	        |
      |        6281284915951        |
      |       +6281284915951        |

  #FDBRMA-172
  @Android @Login @Production @Regression @RealAccount @RealDevices @UiTest
  Scenario Outline: Login using phone number, input starts with 9812
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<phonenumber>" phonenumber to login
    And User clicks login button on login screen
    Then display msg "Please enter your correct phone number" is displayed under email username phone field

    Examples:
      |        phonenumber          |
      |	        9812	            |

  #FDBRMA-111
  @Android @Login @Production @Regression @RealAccount @RealDevices @UiTest
  Scenario Outline: Login using unverified phone number
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<phonenumber>" phonenumber to login
    And User clicks next button on login screen
    Then user see and close modal phone number is not verified

    Examples:
      |   phonenumber        |
      |	  0812849159510	     |

  #FDBRMA-110
  @Android @Login @Production @Regression @RealAccount @RealDevices @UiTest
  Scenario Outline: Login using unregistered phone number
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<phonenumber>" phonenumber to login
    And User clicks next button on login screen
    Then user see and close modal phone number is not registered

    Examples:
      |   phonenumber        |
      |	  0812812812812	     |

  #FDBRMA-104
  @Android @Login @Production @Regression @RealAccount @RealDevices @UiTest
  Scenario Outline: Login using verified email address
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then user enters the "<email>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    Then User will see modal account status on homescreen

    Examples:
      |           email                  |        password       |
      |	      testflight@mailinator.com	 |        test123        |

  #FDBRMA-106
  @Android @Login @Production @Regression @RealAccount @RealDevices @UiTest
  Scenario Outline: Login using registered email address
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then user enters the "<email>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    Then User will see modal account status on homescreen

    Examples:
      |           email                  |        password       |
      |	      verifyprod@mailinator.com	 |        test123        |

  #FDBRMA-112
  @Android @Login @Production @Regression @RealAccount @RealDevices @UiTest
  Scenario Outline: Login using unregistered email address
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then user enters the "<email>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    Then User see and close modal email is not registered

    Examples:
      |           email                      |        password       |
      |	      unregistered@unregistered.com	 |        test123        |

  #FDBRMA-365
  @Android @Login @Production @Regression @RealAccount @RealDevices @UiTest
  Scenario Outline: Login with valid username and password
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then user enters the "<email>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    Then User will see modal account status on homescreen

    Examples:
      |         email        |        password       |
      |	      putwid	 |        tester123        |

   #FDBRMA-117
  @Android @Login @Production @Regression @RealAccount @RealDevices @UiTest
  Scenario Outline: Login input username contains special character
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then user enters the "<email>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    Then User will see modal account status on homescreen

    Examples:
      |         email        |        password       |
      |	      wong_pinky	 |        tuhanyesus        |

  #FDBRMA-128 & FDBRMA-109
  @Android @Login @Production @Regression @RealAccount @RealDevices @UiTest
  Scenario Outline: Login using phone number. Input number less than 8 characters and more than 14 characters
    Given User navigates to onboarding screen by click next
    When User clicks login button on onboarding screen
    Then User enters the "<phonenumber>" phonenumber to login
    And User clicks login button on login screen
    Then display msg "Please enter your correct phone number" is displayed under phone number field

    Examples:
      |         phonenumber              |
      |           081702                 |
      |       081702081702081702081702   |

  # FDBRMA-114
  @Android @Login @Production @Regression @RealAccount @RealDevices @UiTest
  Scenario Outline: Login using wrong password of email address
    Given User navigates to onboarding screen by click next
    When User clicks login button on onboarding screen
    Then user enters the "<username>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    Then User see and close modal email is not registered

    Examples:
      | username                 | password  |
      | testflight@mailinator.com | 123qwerty |

   #FDBRMA-115
  @Android @Login @Production @Regression @RealAccount @RealDevices @UiTest
  Scenario Outline: Login using wrong password of username
    Given User navigates to onboarding screen by click next
    When User clicks login button on onboarding screen
    Then user enters the "<username>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    Then User see and close modal username is not registered

    Examples:
      | username | password  |
      | putwid   | 123qwerty |

   #FDBRMA-173
  @Android @Login @Staging @Regression @RealAccount @RealDevices @UiTest
  Scenario Outline: Login using email that registered to multiple account
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then user enters the "<email>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    Then user see and close modal email is used to multiple account

    Examples:
      |           email                      |        password       |
      |	      duplicate01@duplicate.com	     |        test123        |

  #FDBRMA-275
  @Android @Login @Production @Regression @RealAccount @RealDevices @UiTest
  Scenario Outline: Login using unverified phone number and then login using email that link to unverified phone
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<phonenumber>" phonenumber to login
    And User clicks next button on login screen
    Then user see and click login on modal phone number is not verified
    Then user changes inputed login field to "myjne001@gmail.com" to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    Then User will see modal account status on homescreen

    Examples:
      |      phonenumber         |   password   |
      |	    0812849159510	     |   test123    |

  ##################################################################################
  #IOS
  ##################################################################################

  #FDBRMA-171 #FDBRMA-103 #FDBRMA-116
  @Ios @Login @Staging @Regression @RealAccount @RealDevices @IntegrationTest
  Scenario Outline: Login using verified phone number
    Given User navigates to onboarding screen by click next
    When User clicks login button on onboarding screen
    Then User enters the "<phonenumber>" phonenumber to login
    And User clicks next button on login screen
    When user input correct otp from phone on otp screen from ios to login
    Then user will see modal account status on ios homescreen

    Examples:
      |   phonenumber        |
      |	  087808192493	     |
      |	  6287808192493	     |
      |	  +6287808192493	 |

  #FDBRMA-104
  @FDBRMA-104
  Scenario Outline: Login using verified email address
    Given User navigates to onboarding screen by click next
    When User clicks login button on onboarding screen
    Then user enters the "<email>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    Then user will see modal account status on ios homescreen

    Examples:
      |          email                  |        password       |
      |	   testflight@mailinator.com    |        test123        |

  #FDBRMA-106
  @Ios @Login @Production @Regression @RealAccount @RealDevices @UiTest
  Scenario Outline: Login using registered email address
    Given User navigates to onboarding screen by click next
    When User clicks login button on onboarding screen
    Then user enters the "<email>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    Then user will see modal account status on ios homescreen

    Examples:
      |           email                  |        password       |
      |	      verifyprod@mailinator.com	 |        test123        |

  #FDBRMA-172
  @FDBRMA-172iOS
  Scenario Outline: Login using phone number, input starts with 9812
    Given User navigates to onboarding screen by click next
    When User clicks login button on onboarding screen
    Then User enters the "<phonenumber>" phonenumber to login
    And User clicks login button on login screen
#    Then User should not able to login

    Examples:
      |        phonenumber          |
      |	        9812	            |

  #FDBRMA-110
  @FDBRMA-110iOS
  Scenario Outline: Login using unregistered phone number
    Given User navigates to onboarding screen by click next
    When User clicks login button on onboarding screen
    Then User enters the "<phonenumber>" phonenumber to login
    And User clicks next button on login screen
    Then User see and close modal phone number is not registered ios

    Examples:
      |   phonenumber        |
      |	  0812812812812	     |

  #FDBRMA-111
  @FDBRMA-111iOS
  Scenario Outline: Login using unverified phone number
    Given User navigates to onboarding screen by click next
    When User clicks login button on onboarding screen
    Then User enters the "<phonenumber>" phonenumber to login
    And User clicks next button on login screen
    Then User see and close modal phone number is not verified ios

    Examples:
      |   phonenumber        |
      |	  0812849159510	     |

  #FDBRMA-365
  @FDBRMA-365Ios
  Scenario Outline: Login with valid username and password
    Given User navigates to onboarding screen by click next
    When User clicks login button on onboarding screen
    Then user enters the "<username>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen

    Examples:
      | username | password  |
      | putwid   | 123tester |

  #FDBRMA-115
  @FDBRMA-115Ios
  Scenario Outline: Login using wrong password of username
    Given User navigates to onboarding screen by click next
    When User clicks login button on onboarding screen
    Then user enters the "<username>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    Then User see and close modal username is not registered ios

    Examples:
      | username | password  |
      | putwid   | 123qwerty |
