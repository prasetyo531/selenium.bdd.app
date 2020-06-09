Feature: Verify account

  In order to perform sucessfull verify
  User should have real email
  User should have real number
  User should fill personal info, beauty profile and concern

  #FDBRMA-221
  @Android @Smoke @Profile @RealDevices @IntegrationTest @WIP
  Scenario Outline: Verifiy Registered Email
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then user enters the "<username>" username on login screen
    And user enters the "<password>" password on login screen
    And user clicks login button on login screen
    When user click complete verify button on modal
    Then user clicks verify now button on verify email screen
    And user fill "<phone>" phone and verify on verify phone screen
    And user fill all mandatory field on personal info screen
    And user choose beauty profile on beauty profile screen
    And user choose beauty profile on beauty concern screen
    Then user will see congratulation modal

    Examples:
      |   email        |   password    |       phone           |
      |	  bddregister	  |   test123     |     081284915951      |

  #FDBRMA-222
  @Android @Smoke @Profile @RealDevices @IntegrationTest @WIP
  Scenario Outline: Verifiy Inputed Email
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then user enters the "<username>" username on login screen
    And user enters the "<password>" password on login screen
    And user clicks login button on login screen
    When user click complete verify button on modal
    Then user clicks verify now button on verify email screen
    And user fill "<phone>" phone and verify on verify phone screen
    And user fill all mandatory field on personal info screen
    And user choose beauty profile on beauty profile screen
    And user choose beauty profile on beauty concern screen
    Then user will see congratulation modal

    Examples:
      |   username        |   password    |       phone           |
      |	  bddregister	  |   test123     |     081284915951      |

  #FDBRMA-223
  @Android @Smoke @Profile @RealDevices @IntegrationTest @WIP
  Scenario Outline: Verifiy Changed Email
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then user enters the "<username>" username on login screen
    And user enters the "<password>" password on login screen
    And user clicks login button on login screen
    When user click complete verify button on modal
    Then user clicks verify now button on verify email screen
    And user fill "<phone>" phone and verify on verify phone screen
    And user fill all mandatory field on personal info screen
    And user choose beauty profile on beauty profile screen
    And user choose beauty profile on beauty concern screen
    Then user will see congratulation modal

    Examples:
      |   username        |   password    |       phone           |
      |	  bddregister	  |   test123     |     081284915951      |

  #FDBRMA-227
  @Android @Smoke @Profile @RealDevices @IntegrationTest @WIP
  Scenario Outline: Verify Registered Phone
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then user enters the "<username>" username on login screen
    And user enters the "<password>" password on login screen
    And user clicks login button on login screen
    When user click complete verify button on modal
    Then user clicks verify now button on verify email screen
    And user clicks verify now button on verify phone screen
    And user fill all mandatory field on personal info screen
    And user choose beauty profile on beauty profile screen
    And user choose beauty profile on beauty concern screen
    Then user will see congratulation modal

    Examples:
      |   username        |   password    |
      |	  bddregister	  |   test123     |

  #FDBRMA-228
  @Android @Smoke @Profile @RealDevices @IntegrationTest @WIP
  Scenario Outline: Verify Inputed Phone
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then user enters the "<username>" username on login screen
    And user enters the "<password>" password on login screen
    And user clicks login button on login screen
    When user click complete verify button on modal
    Then user clicks verify now button on verify email screen
    And user clicks verify now button on verify phone screen
    And user fill all mandatory field on personal info screen
    And user choose beauty profile on beauty profile screen
    And user choose beauty profile on beauty concern screen
    Then user will see congratulation modal

    Examples:
      |   username        |   password    |
      |	  bddregister	  |   test123     |

  #FDBRMA-229
  @Android @Smoke @Profile @RealDevices @IntegrationTest @WIP
  Scenario Outline: Verify Changed Phone
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then user enters the "<username>" username on login screen
    And user enters the "<password>" password on login screen
    And user clicks login button on login screen
    When user click complete verify button on modal
    Then user clicks verify now button on verify email screen
    And user clicks verify now button on verify phone screen
    And user fill all mandatory field on personal info screen
    And user choose beauty profile on beauty profile screen
    And user choose beauty profile on beauty concern screen
    Then user will see congratulation modal

    Examples:
      |   username        |   password    |
      |	  bddregister	  |   test123     |

  #FDBRMA-19
  @FDBRMA-19
  Scenario Outline: Verify Input With Invalid Format Email
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then user enters the "<username>" username on login screen
    And user clicks next button on login screen
    And user enters the "<password>" password on login screen
    And user clicks login button on login screen
    When user click complete verify button on modal
    And user change email and input "<email>" and click verify on verify email screen
    Then display msg "Please enter your correct email address" is displayed under verify email field

    Examples:
      |   username    |   password      |                 email                 |
      |	  vnsphl	  |   dora12345     |             wrongformatemail          |
      |	  vnsphl	  |   dora12345     |         wrongformatemail@gmail        |
      |	  vnsphl	  |   dora12345     |   wrongformatemail@gmail@gmail.com    |

  #FDBRMA-20
  @FDBRMA-20
  Scenario Outline: Verify Input With Invalid Format Phone
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then user enters the "<username>" username on login screen
    And user clicks next button on login screen
    And user enters the "<password>" password on login screen
    And user clicks login button on login screen
    When user click complete verify button on modal
    And user skip verify email
    And user input "<phone>" and click verify on verify phone screen
    Then display msg "Please enter your correct phone number" is displayed under verify phone field

    Examples:
      |   username    |   password      |     phone      |
      |	  vnsphl	  |   dora12345     |      0         |
      |	  vnsphl	  |   dora12345     |    081702      |
      |	  vnsphl	  |   dora12345     |  081702081702081702081702 |


  @Android @Smoke @Profile @RealDevices @IntegrationTest @WIP
  Scenario Outline: Verify profile as registered user, skip verify email and phone
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then user enters the "<username>" username on login screen
    And user enters the "<password>" password on login screen
    And user clicks login button on login screen
    When user click complete verify button on modal
    Then user click skip button on verify email screen
    And user click skip button on verify phone screen
    And user fill all mandatory field on personal info screen
    And user choose beauty profile on beauty profile screen
    And user choose beauty profile on beauty concern screen
    Then user will see congratulation modal