Feature: Update Profile

  In order to perform sucessfull update profile
  if user update beauty profile, product matches and beauty box direct to beauty concern
  if user update beauty concern, product matches and beauty box direct to beauty profile

  #FDBRMA-328
  @updateprofile @staging @FDBRMA-328
  Scenario Outline: Update beauty id on product matches
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<username>" username on login screen
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    And User clicks login button on login screen
    Then User will see modal account status on homescreen
    When User clicks complete my beautyId button
    Then User will direct to beauty profile screen

    Examples:
      |   username        |   password      |
      |	  bddbeautyid01	  |   test123       |

  #FDBRMA-329
  @updateprofile @staging @FDBRMA-329
  Scenario Outline: Update beauty id by click btn beauty summary box
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<username>" username on login screen
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    And User clicks login button on login screen
    Then User will see modal account status on homescreen
    And User clicks profile from homescreen menu
    When User clicks beautyId button on beauty box on profile
    Then User will direct to beauty profile screen

    Examples:
      |   username        |   password      |
      |	  bddbeautyid02	  |   test123       |

    #FDBRMA-276
  @updateprofile @staging @FDBRMA-276
  Scenario Outline: Input all Field on profile screen
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<username>" username on login screen
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    And User clicks login button on login screen
    Then User will see modal account status on homescreen
    And User clicks profile from homescreen menu
    And User clicks setting icon
    And User clicks edit profile
    And User fill dob, fullname "<fullname>", gender, location, bio "<bio>"
    When User clicks save to save all updated field
    Then User will see all inputed data "<fullname>", gender, location, "<bio>" are stored

    Examples:
      |   username        |   password      |       fullname        |     bio       |
      |	  bddbeautyid01	  |   test123       |     bddbeautyid     |   pras pras pras  |

  #FDBRMA-278
  @updateprofile @staging @FDBRMA-278 @Bug
  Scenario Outline: Save profile using empty personal info, save without fill any field
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<username>" username on login screen
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    And User clicks login button on login screen
    Then User will see modal account status on homescreen
    And User clicks profile from homescreen menu
    And User clicks setting icon
    And User clicks edit profile
    When User clicks save to save all updated field
    Then User will see all inputed data fullname, gender, location, bio are empty

    Examples:
      |   username            |   password      |
      |	  emptypersonal03	  |   test123       |

  #FDBRMA-283
  @updateprofile @staging @FDBRMA-283
  Scenario Outline: Update beauty profile and concern on beauty id box
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<username>" username on login screen
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    And User clicks login button on login screen
    Then User will see modal account status on homescreen
    And User clicks profile from homescreen menu
    When User clicks beautyId button on beauty box on profile
    Then User will direct to beauty profile screen

    Examples:
      |   username            |   password      |
      |	  emptypersonal04	  |   test123       |

  #FDBRMA-279 #FDBRMA-281
  @updateprofile @staging @FDBRMA-279
  Scenario Outline: Update beauty profile and then click save on its own screen
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<username>" username on login screen
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    And User clicks login button on login screen
    Then User will see modal account status on homescreen
    And User clicks profile from homescreen menu
    And User clicks setting icon
    And User clicks edit profile
    When User click update beauty profile and user fill all option
    Then User will see toast msg to inform beauty profile updated
    And User clicks save on edit profile screen
    When User clicks beautyId button on beauty box on profile
    Then User will direct automatically to beauty concern screen

    Examples:
      |   username                |   password      |
        |	  emptybeautyprofile07	  |   test123       |

  #FDBRMA-280 #FDBRMA-282
  @updateprofile @staging @FDBRMA-280
  Scenario Outline: Update beauty concern and then click save on its own screen
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<username>" username on login screen
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    And User clicks login button on login screen
    Then User will see modal account status on homescreen
    And User clicks profile from homescreen menu
    And User clicks setting icon
    And User clicks edit profile
    When User click update beauty concern and user fill all option
    Then User will see toast msg to inform beauty concern updated
    And User clicks save on edit profile screen
    When User clicks beautyId button on beauty box on profile
    Then User will direct automatically to beauty profile screen

    Examples:
      |   username                |   password      |
      |	  emptybeautyprofile08	  |   test123       |

