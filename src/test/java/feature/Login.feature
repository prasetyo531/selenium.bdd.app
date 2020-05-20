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

  #FDBRMA-111
  @Android @Login @Staging @Wip @Regression @RealAccount @RealDevices @UiTest
  Scenario Outline: Login using unverified phone number
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then user enters the "<phonenumber>" phonenumber to login
    And user clicks next button on login screen
    Then user will see error msg as modal

    Examples:
      |   phonenumber        |
      |	  081284919999	     |

  #FDBRMA-110
  @Android @Login @Staging @Wip @Regression @RealAccount @RealDevices @UiTest
  Scenario Outline: Login using unregistered phone number
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then user enters the "<phonenumber>" phonenumber to login
    And user clicks next button on login screen
    Then user will see error msg as modal

    Examples:
      |   phonenumber        |
      |	  081284919999	     |

  #FDBRMA-104
  @Android @Login @Staging @Wip @Regression @RealAccount @RealDevices @UiTest
  Scenario Outline: Login using verified email address
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then user enters the "<phonenumber>" phonenumber to login
    And user clicks next button on login screen
    Then user will see error msg as modal

    Examples:
      |   phonenumber        |
      |	  081284919999	     |

  #FDBRMA-106
  @Android @Login @Staging @Wip @Regression @RealAccount @RealDevices @UiTest
  Scenario Outline: Login using registered email address
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then user enters the "<phonenumber>" phonenumber to login
    And user clicks next button on login screen
    Then user will see error msg as modal

    Examples:
      |   phonenumber        |
      |	  081284919999	     |

  #FDBRMA-112
  @Android @Login @Staging @Wip @Regression @RealAccount @RealDevices @UiTest
  Scenario Outline: Login using unregistered email address
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then user enters the "<phonenumber>" phonenumber to login
    And user clicks next button on login screen
    Then user will see error msg as modal

    Examples:
      |   phonenumber        |
      |	  081284919999	     |

  #FDBRMA-173
  @Android @Login @Staging @Wip @Regression @RealAccount @RealDevices @UiTest
  Scenario Outline: Login using email that registered to multiple account
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then user enters the "<phonenumber>" phonenumber to login
    And user clicks next button on login screen
    Then user will see error msg as modal

    Examples:
      |   phonenumber        |
      |	  081284919999	     |

  #FDBRMA-174
  @Android @Login @Staging @Wip @Regression @RealAccount @RealDevices @UiTest
  Scenario Outline: Login using username that registered to multiple account
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then user enters the "<phonenumber>" phonenumber to login
    And user clicks next button on login screen
    Then user will see error msg as modal

    Examples:
      |   phonenumber        |
      |	  081284919999	     |


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
