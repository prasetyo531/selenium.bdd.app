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
    Then User enters the "<username>" username on login screen
    And User enters the "<password>" password on login screen
    And User clicks login button on login screen
    When User click complete verify button on modal
    Then User clicks verify now button on verify email screen
    And User fill "<phone>" phone and verify on verify phone screen
    And User fill all mandatory field on personal info screen
    And User choose beauty profile on beauty profile screen
    And User choose beauty concern on beauty concern screen
    Then User will see congratulation modal

    Examples:
      |   email        |   password    |       phone           |
      |	  bddregister	  |   test123     |     081284915951      |

  #FDBRMA-222
  @Android @Smoke @Profile @RealDevices @IntegrationTest @WIP
  Scenario Outline: Verifiy Inputed Email
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<username>" username on login screen
    And User enters the "<password>" password on login screen
    And User clicks login button on login screen
    When User click complete verify button on modal
    Then User clicks verify now button on verify email screen
    And User fill "<phone>" phone and verify on verify phone screen
    And User fill all mandatory field on personal info screen
    And User choose beauty profile on beauty profile screen
    And User choose beauty concern on beauty concern screen
    Then User will see congratulation modal

    Examples:
      |   username        |   password    |       phone           |
      |	  bddregister	  |   test123     |     081284915951      |

  #FDBRMA-223
  @Android @Smoke @Profile @RealDevices @IntegrationTest @WIP
  Scenario Outline: Verifiy Changed Email
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<username>" username on login screen
    And User enters the "<password>" password on login screen
    And User clicks login button on login screen
    When User click complete verify button on modal
    Then User clicks verify now button on verify email screen
    And User fill "<phone>" phone and verify on verify phone screen
    And User fill all mandatory field on personal info screen
    And User choose beauty profile on beauty profile screen
    And User choose beauty concern on beauty concern screen
    Then User will see congratulation modal

    Examples:
      |   username        |   password    |       phone           |
      |	  bddregister	  |   test123     |     081284915951      |

  #FDBRMA-227
  @Android @Smoke @Profile @RealDevices @IntegrationTest @WIP
  Scenario Outline: Verify Registered Phone
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<username>" username on login screen
    And User enters the "<password>" password on login screen
    And User clicks login button on login screen
    When User click complete verify button on modal
    Then User clicks verify now button on verify email screen
    And User clicks verify now button on verify phone screen
    And User fill all mandatory field on personal info screen
    And User choose beauty profile on beauty profile screen
    And User choose beauty concern on beauty concern screen
    Then User will see congratulation modal

    Examples:
      |   username        |   password    |
      |	  bddregister	  |   test123     |

  #FDBRMA-228
  @Android @Smoke @Profile @RealDevices @IntegrationTest @WIP
  Scenario Outline: Verify Inputed Phone
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<username>" username on login screen
    And User enters the "<password>" password on login screen
    And User clicks login button on login screen
    When User click complete verify button on modal
    Then User clicks verify now button on verify email screen
    And User clicks verify now button on verify phone screen
    And User fill all mandatory field on personal info screen
    And User choose beauty profile on beauty profile screen
    And User choose beauty concern on beauty concern screen
    Then User will see congratulation modal

    Examples:
      |   username        |   password    |
      |	  bddregister	  |   test123     |

  #FDBRMA-229
  @Android @Smoke @Profile @RealDevices @IntegrationTest @WIP
  Scenario Outline: Verify Changed Phone
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<username>" username on login screen
    And User enters the "<password>" password on login screen
    And User clicks login button on login screen
    When User click complete verify button on modal
    Then User clicks verify now button on verify email screen
    And User clicks verify now button on verify phone screen
    And User fill all mandatory field on personal info screen
    And User choose beauty profile on beauty profile screen
    And User choose beauty concern on beauty concern screen
    Then User will see congratulation modal

    Examples:
      |   username        |   password    |
      |	  bddregister	  |   test123     |

  #FDBRMA-19
  @FDBRMA-19
  Scenario Outline: Verify Input With Invalid Format Email
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<username>" username on login screen
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    And User clicks login button on login screen
    When User click complete verify button on modal
    And User change email and input "<email>" and click verify on verify email screen
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
    Then User enters the "<username>" username on login screen
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    And User clicks login button on login screen
    When User click complete verify button on modal
    And User skip verify email
    And User input "<phone>" and click verify on verify phone screen
    Then display msg "Please enter your correct phone number" is displayed under verify phone field

    Examples:
      |   username    |   password      |     phone      |
      |	  vnsphl	  |   dora12345     |      0         |
      |	  vnsphl	  |   dora12345     |    081702      |
      |	  vnsphl	  |   dora12345     |  081702081702081702081702 |

  @FDBRMA-253
  Scenario Outline: Save personal info upload image profile
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<username>" username on login screen
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    And User clicks login button on login screen
    When User click complete verify button on modal
    Then User click skip button on verify email screen
    And User click skip button on verify phone screen
    When User take picture to complete personal info
    Then User will see image that has taken appear in thumbnail

    Examples:
      |   username    |   password      |   location    |
      |	  uploadimg01	  |   test123     | Batam         |

  @FDBRMA-254
  Scenario Outline: Save personal info input fullname contains special character
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<username>" username on login screen
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    And User clicks login button on login screen
    When User click complete verify button on modal
    Then User click skip button on verify email screen
    And User click skip button on verify phone screen
    When User fill all mandatory field on personal info screen "<fullname>"
    Then User will see modal fullname only alphabet

    Examples:
      |   username        |   password      |     fullname         |
      |	  verifywebprod	  |   test123       |       vnsphl2        |
      |	  verifywebprod	  |   test123       |       vnsph_satu     |


  #FDBRMA-250 #FDBRMA-251 #FDBRMA-252 #FDBRMA-255 #FDBRMA-366 #FDBRMA-256 #FDBRMA-257 #FDBRMA-258 #FDBRMA-259 #FDBRMA-260 #FDBRMA-262 #FDBRMA-261 #FDBRMA-263 #FDBRMA-264 #FDBRMA-265 #FDBRMA-266
  @FDBRMA-250
  Scenario Outline: Verify profile as registered user, skip verify email and phone
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<username>" username on login screen
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    And User clicks login button on login screen
    When User click complete verify button on modal
    Then User click skip button on verify email screen
    And User click skip button on verify phone screen
    And User fill all mandatory field on personal info screen "<fullname>" and "<location>"
    And User choose beauty profile on beauty profile screen
    And User choose beauty concern on beauty concern screen
    Then User will see progress bar verify on homescreen

    Examples:
      |   username    |   password      |     fullname      |    location    |
      |	  vnsphl30	  |   test123     |       vnsphldua     |     Bima        |

