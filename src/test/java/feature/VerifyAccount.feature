Feature: Verify account

  In order to perform sucessfull verify
  User should have real email
  User should have real number
  User should fill personal info, beauty profile and concern

  #FDBRMA-221 #FDBRMA-227 #FDBRMA-251 #FDBRMA-255 #FDBRMA-366 #FDBRMA-254 #FDBRMA-257 #FDBRMA-258 #FDBRMA-259 #FDBRMA-260 #FDBRMA-262 #FDBRMA-261 #FDBRMA-263 #FDBRMA-264 #FDBRMA-265 #FDBRMA-266
  @Android @staging @Smoke @bypassotp @IntegrationTest @OkrDone
  Scenario Outline: Verify Registered Phone - Registered Email
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<email>" username on login screen
    And User enters the "<password>" password on login screen
    And User clicks login button on login screen
    And User tap button get it now modal get point
    Then User will see verify phone screen to complete by user
    When User clicks verify now button on verify phone screen bypass otp
    Then User will see success msg verified by phone contains "<phone>"
    When User clicks verify now button on verify email screen bypass otp
    Then User will see success msg verified by email contains "<email>"
    And User complete data on personal info screen "<fullname>"
    And User choose beauty profile on beauty profile screen
    And User choose beauty concern on beauty concern screen
    Then User will see congratulation modal

    Examples:
      |     email         |   password    |       phone       |     fullname    |
      |	  verifyempty10	  |   test123     |     6287876600002     |     verifyempty   |

  #FDBRMA-223 #FDBRMA-222 #FDBRMA-229 #FDBRMA-228 #FDBRMA-241 #FDBRMA-233
  #check email and should use new phone
  @Android @staging @Smoke @bypassotp @IntegrationTest @OkrDone
  Scenario Outline: Verify Changed Phone - Changed Email
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<email>" username on login screen
    And User enters the "<password>" password on login screen
    And User clicks login button on login screen
    And User tap button get it now modal get point
    Then User will see verify phone screen to complete by user
    Then User will see verify process
    When User change phone "<newphone>" to verify phone bypass otp
    Then User will see success msg verified by phone contains "<newphone>"
    When User change email "<newemail>" to verify email bypass otp
    Then User will see success msg verified by email contains "<newemail>"
    And User complete data on personal info screen "<fullname>"
    And User choose beauty profile on beauty profile screen
    And User choose beauty concern on beauty concern screen
    Then User will see congratulation modal

    Examples:
      |             email                 |   password    |          newemail                          |      newphone     |     fullname    |
      |	  verifynotempty10@mailinator.com	  |   test123     |     verifynotempty01@mailinator.com    |     6281390009009  |   verifynotempty   |

  #FDBRMA-239
  @Android @Smoke @bypassotp @IntegrationTest @OkrDone @FDBRMA-239 @Demo
  Scenario Outline: Changed verified Phone Using Verified Phone Number on Profile
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<username>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    Then User will see modal account status on homescreen
    And User clicks profile from homescreen menu and edit account
    When User clicks change phone number and input "<newphone>"
    Then display msg "Phone number has been registered." is displayed under verify phone field

    Examples:
      |   username           |        password       |      newphone         |
      |	      putwid	     |        123tester        |    6287005555551   |

  #FDBRMA-247
  @Android @Smoke @bypassotp @IntegrationTest @OkrDone @FDBRMA-247 @Demo
  Scenario Outline: Changed Registered Email Using Verified Email on Profile
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<username>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    Then User will see modal account status on homescreen
    And User clicks profile from homescreen menu and edit account
    When User clicks change email and input "<newemail>"
    Then display msg "Email has been registered." is displayed under verify email field

    Examples:
      |   username           |        password       |      newemail         |
      |	      putwid	     |        123tester        |    testfitri43@mailinator.com   |

  #FDBRMA-224 #FDBRMA-230
  @Android @Smoke @bypassotp @IntegrationTest @OkrDone @FDBRMA-224
  Scenario Outline: Verify Registered Email And Phone on Profile
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<email>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    Then User will see modal account status on homescreen
    And User clicks profile from homescreen menu and edit account
    When User clicks label to verify your email
    And User input bypass otp code then confirm
    Then User will see success msg verified by email contains "<email>" and label Verified will appear
#    When User clicks label to verify your phone
#    And User input bypass otp code then confirm
#    Then User will see success msg verified by phone contains "<phone>" and label Verified will appear

    Examples:
      |                    email                         |        password       |      phone         |
      |	      registeredemailprofile@mailinator.com	     |        test123        |    628129000224   |

  #FDBRMA-226 #FDBRMA-232 #FDBRMA-245 #FDBRMA-237
  #check email and should use new phone
  @Android @Smoke @bypassotp @IntegrationTest @OkrDone
  Scenario Outline: Verify Changed Email - Changed Phone on Profile
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<email>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    Then User will see modal account status on homescreen
    And User clicks profile from homescreen menu and edit account
    When User clicks change email "<newemail>" to verify email bypass otp
    And User input bypass otp code then confirm
    Then User will see success msg verified by email contains "<newemail>" and label Verified will appear
    When User clicks change phone "<newphone>" to verify phone bypass otp
    And User input bypass otp code then confirm
    Then User will see success msg verified by phone contains "<newphone>" and label Verified will appear

    Examples:
      |             email                 |   password    |                newemail                |      newphone      |         fullname      |
      |	  verifyprofile@mailinator.com	  |   test123     |     verifyprofilenew@mailinator.com    |     628189000226  |   changedemailphone   |

  #FDBRMA-240 #FDBRMA-248
  #check email and phone using suspend data
  @Android @Smoke @bypassotp @IntegrationTest @OkrDone
  Scenario Outline: Verify Changed Email - Changed Phone using Suspend email and phone on Profile
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<email>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    Then User will see modal account status on homescreen
    And User clicks profile from homescreen menu and edit account
    When User clicks change email "<newemail>" to verify email bypass otp
    Then Display toast error msg suspend "Email you entered has been suspended. Please try again in"
    And User clicks back
    When User clicks change phone "<newphone>" to verify phone bypass otp
    Then Display toast error msg suspend "Phone number you entered has been suspended. Please try again in"

    Examples:
      |             email             |   password    |          newemail                |      newphone      |         fullname      |
      |	  bddtalk01@mailinator.com	  |   test123     | suspendemailqa@mailinator.com    |     081280005001   |   changedemailphone   |

  #FDBRMA-234 #FDBRMA-242 #FDBRMA-246
  @Android @switchAccount @Staging @OkrDone @FDBRMA-242
  Scenario Outline: Changed Registered Phone Using Registered Phone Number - Changed Registered Email Using Registered Email
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<email>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    And User tap button get it now modal get point
    Then User will see verify phone screen to complete by user
    When User change phone "<newphone>" to verify phone bypass otp
    Then User will see success msg verified by phone contains "<newphone>"
    When User change email "<newemail>" to verify email bypass otp
    Then User will see success msg verified by email contains "<newemail>"

    Examples:
      |     email                         |   password    |       newphone    |      newemail                       |
      |	  verifyempty10@mailinator.com	  |   test123     |     628224624123 |   vverifynotempty01@mailinator.com   |

  #FDBRMA-235
  @Android @switchAccount @Staging @OkrDone @FDBRMA-235
  Scenario Outline: Changed Registered Phone Using Verified Phone Number
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<email>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    And User tap button get it now modal get point
    Then User will see verify phone screen to complete by user
    And User change "<phone>" and click verify on verify phone screen
    Then display msg "Phone number has been registered." is displayed under verify phone field

    Examples:
      |   email                               |   password    |     phone      |
      |	  verifyregistered01@mailinator.com	  |   test123     |      628123456112         |

  #FDBRMA-243
  @Android @switchAccount @Staging @OkrDone @FDBRMA-243
  Scenario Outline: Changed Registered Email Using Verified Email
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<email>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    And User clicks login button on login screen
    When User click complete verify button on modal
    And User change email and input "<newemail>" and click verify on verify email screen
    Then display msg "Email has been registered." is displayed under verify email field

    Examples:
      |   email                               |   password    |     newemail      |
      |	  emptypersonal015@mailinator.com	  |   test123     |      verifyempty07@mailinator.com         |

  #FDBRMA-236
  @Android @switchAccount @Staging @OkrDone @FDBRMA-236
  Scenario Outline: Changed Registered Phone Using Suspend Phone Number
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<email>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    And User tap button get it now modal get point
    Then User will see verify phone screen to complete by user
    And User change phone "<phone>" and confirm password
    Then Display toast error msg suspend "Phone number you entered has been suspended. Please try again in"

    Examples:
      |   email                               |   password    |     phone      |
      |	  verifyregistered01@mailinator.com	  |   test123     |      081280005001         |

  #FDBRMA-244
  @Android @switchAccount @Staging @OkrDone @FDBRMA-244
  Scenario Outline: Changed Registered Email Using Suspend Email
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<email>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    And User clicks login button on login screen
    When User click complete verify button on modal
    And User change email "<newemail>" and confirm password
    Then Display toast error msg suspend "Email you entered has been suspended. Please try again in"

    Examples:
      |   email                               |   password    |     newemail      |
      |	  emptypersonal015@mailinator.com	  |   test123     |    suspendemailqa@mailinator.com  |

  ### UI VALIDATION ###

  #FDBRMA-19
  @Android @VerifyEmail @Smoke @RealAccount @RealDevices @OkrDone
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
      |	  mixrevamp01	  |   test123     |             wrongformatemail          |
      |	  mixrevamp01	  |   test123     |         wrongformatemail@gmail        |
      |	  mixrevamp01	  |   test123     |   wrongformatemail@gmail@gmail.com    |

  #FDBRMA-20
  @Android @VerifyEmail @Smoke @RealAccount @RealDevices @OkrDone
  Scenario Outline: Verify Input With Invalid Format Phone
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<username>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    And User tap button get it now modal get point
    Then User will see verify phone screen to complete by user
    And User input "<phone>" and click verify on verify phone screen
    Then display msg "Please enter your correct phone number" is displayed under verify phone field

    Examples:
      |   username    |   password    |     phone      |
      |	  datatnr03	  |   test123     |      0         |
      |	  datatnr03	  |   test123     |    081702      |
      |	  datatnr03	  |   test123     |  081702081702081702081702 |


  ### PERSONAL INFO SCREEN ###

  #FDBRMA-254 @FDBRMA-251 #FDBRMA-255 #FDBRMA-366
  @Android @staging @Smoke @IntegrationTest @OkrDone @FDBRMA-254
  Scenario Outline: Save personal info input fullname contains integer or special character - input without fullname, gender and location
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<username>" username on login screen
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    And User clicks login button on login screen
    When User click complete verify button on modal
    Then User click skip button on verify email screen
    When User fill all mandatory field on personal info screen "<fullname>"
    Then User will see modal fullname only alphabet

    Examples:
      |   username        |   password      |     fullname         |
      |	  verifywebprod	  |   test123       |       vnsphl2        |
      |	  verifywebprod	  |   test123       |       vnsph_satu     |

  #FDBRMA-429 #FDBRMA-250 #RPA-59
  #check should use new data
  @Android @staging @Smoke @IntegrationTest @OkrDone @FDBRMA-429
  Scenario Outline: Save personal using photo from gallery
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<username>" username on login screen
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    And User clicks login button on login screen
    When User click complete verify button on modal
    Then User click skip button on verify email screen
    When User use picture from gallery to complete personal info
    Then User will see image that has taken appear in thumbnail

    Examples:
      |   username    |   password      |
      |	  profilepicture	  |   test123     |


  ### CLOSE STEPPER ###

  #RPA-26 #RPA-27
  @Android @staging @Smoke @IntegrationTest @OkrDone @RPA-26
  Scenario Outline: Save personal using photo from gallery
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<username>" username on login screen
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    And User clicks login button on login screen
    Then User check close icon on each step verify and complete

    Examples:
      |   username    |   password    |
      |	  emptyverify |   test123     |