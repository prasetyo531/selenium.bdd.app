Feature: Verify account

  In order to perform sucessfull verify
  User should have real email
  User should have real number
  User should fill personal info, beauty profile and concern

 ### verify email ###

  #FDBRMA-221 #FDBRMA-227
  @Android @Smoke @Profile @RealDevices @IntegrationTest @demoVerify
  Scenario Outline: Verify Registered Email - Registered Phone
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<email>" username on login screen
    And User enters the "<password>" password on login screen
    And User clicks login button on login screen
    When User click complete verify button on modal
    And User clicks verify now button on verify email screen bypass otp
    Then User will see success msg verified by email contains "<email>"
    And User clicks verify now button on verify phone screen bypass otp
    Then User will see success msg verified by phone contains "<phone>"
#    And User complete data on personal info screen "<fullname>"
#    And User choose beauty profile on beauty profile screen
#    And User choose beauty concern on beauty concern screen
    Then User will see congratulation modal

    Examples:
      |             email             |   password    |       phone           |     fullname    |
      |	  webverify@mailinator.com	  |   test123     |     6287876600001     |     bddandroverify   |

  #FDBRMA-222 #FDBRMA-250
  @Android @Smoke @Profile @RealDevices @IntegrationTest @WIP
  Scenario Outline: Verify Inputed Email
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

  #FDBRMA-223 #FDBRMA-250
  @Android @Smoke @Profile @RealDevices @IntegrationTest @WIP
  Scenario Outline: Verify Changed Email
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


  ### verify phone ###

  #FDBRMA-227 #FDBRMA-250
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

  #FDBRMA-228 #FDBRMA-250
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

  #FDBRMA-229 #FDBRMA-250
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


  ### UI VALIDATION ###

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


  ### PERSONAL INFO SCREEN ###

  #FDBRMA-254 @FDBRMA-251 #FDBRMA-366
  @FDBRMA-254
  Scenario Outline: Save personal info input fullname contains integer or special character - input without fullname, gender and location
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

  #FDBRMA-429 #FDBRMA-250
  @FDBRMA-429
  Scenario Outline: Save personal using photo from gallery
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<username>" username on login screen
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    And User clicks login button on login screen
    When User click complete verify button on modal
    Then User click skip button on verify email screen
    And User click skip button on verify phone screen
    When User use picture from gallery to complete personal info
    Then User will see image that has taken appear in thumbnail

    Examples:
      |   username    |   password      |
      |	  newnew01	  |   test123     |