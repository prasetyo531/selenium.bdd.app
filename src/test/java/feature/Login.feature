Feature: Login into account

  In order to perform sucessfull login
  User input phone number, will direct to otp
  User input email or password, display password
  If user input wrong combination display error msg
  If user input suspend email/phone display sneak msg

  ##################################################################################
  #ANDROID
  ##################################################################################

  #FDBRMA-103
  @Android @Login @Production @Regression @RealAccount @RealDevices @IntegrationTest
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

  #FDBRMA-111
  @Android @Login @Production @Regression @RealAccount @RealDevices @UiTest
  Scenario Outline: Login using unverified phone number
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then user enters the "<phonenumber>" phonenumber to login
    And user clicks next button on login screen
    Then user see and close modal phone number is not verified

    Examples:
      |   phonenumber        |
      |	  0812849159510	     |

  #FDBRMA-110
  @Android @Login @Production @Regression @RealAccount @RealDevices @UiTest
  Scenario Outline: Login using unregistered phone number
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then user enters the "<phonenumber>" phonenumber to login
    And user clicks next button on login screen
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
    And user clicks next button on login screen
    And user enters the "<password>" password on login screen
    When user clicks login button on login screen
    Then user will see modal account status on homescreen

    Examples:
      |           email                  |        password       |
      |	      testflight@mailinator.com	 |        test123        |

  #FDBRMA-106
  @Android @Login @Production @Regression @RealAccount @RealDevices @UiTest
  Scenario Outline: Login using registered email address
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then user enters the "<email>" email to login
    And user clicks next button on login screen
    And user enters the "<password>" password on login screen
    When user clicks login button on login screen
    Then user will see modal account status on homescreen

    Examples:
      |           email                  |        password       |
      |	      ssonew10@mailinator.com	 |        test123        |

  #FDBRMA-112
  @Android @Login @Production @Regression @RealAccount @RealDevices @UiTest
  Scenario Outline: Login using unregistered email address
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then user enters the "<email>" email to login
    And user clicks next button on login screen
    And user enters the "<password>" password on login screen
    When user clicks login button on login screen
    Then user see and close modal email is not registered

    Examples:
      |           email                      |        password       |
      |	      unregistered@unregistered.com	 |        test123        |

  #FDBRMA-173
  @Android @Login @Staging @Regression @RealAccount @RealDevices @UiTest
  Scenario Outline: Login using email that registered to multiple account
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then user enters the "<email>" email to login
    And user clicks next button on login screen
    And user enters the "<password>" password on login screen
    When user clicks login button on login screen
    Then user see and close modal email is used to multiple account

    Examples:
      |           email                      |        password       |
      |	      duplicate01@duplicate.com	     |        test123        |

   #FDBRMA-128 & FDBRMA-109
  @Android @Login @Production @Regression @RealAccount @RealDevices @UiTest
  Scenario Outline: Login using phone number. Input number less than 8 characters
    Given User navigates to onboarding screen by click next
    When User clicks login button on onboarding screen
    Then user enters the "<phonenumber>" phonenumber to login
    And user clicks login button on login screen
    Then display msg "Please enter your correct phone number" is displayed under phone number field

    Examples:
      |         phonenumber              |
      |           081702                 |
      |       081702081702081702081702   |


  ##################################################################################
  #IOS
  ##################################################################################

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
