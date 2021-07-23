Feature: Update Profile

  In order to perform sucessfull update profile
  if user update beauty profile, product matches and beauty box direct to beauty concern
  if user update beauty concern, product matches and beauty box direct to beauty profile

  #FDBRMA-328
  @Android @Smoke @updateprofile @staging @OkrDone @FDBRMA-328
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
      |	  productmatches	  |   test123       |

  #FDBRMA-329 #RPA-129
  @Android @Smoke @updateprofile @staging @OkrDone @FDBRMA-329
  Scenario Outline: Update beautyID from beautyID drawer using user haven't complete data beautyID
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<username>" username on login screen
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    And User clicks login button on login screen
    Then User will see modal account status on homescreen
    And User clicks profile from homescreen menu
    When User clicks beautyId button on beauty drawer on profile
    Then User will direct to empty data beauty id screen

    Examples:
      |   username        |   password      |
      |	  productmatches  |   test123       |

  #FDBRMA-283 #RPA-137
  @Android @Smoke @updateprofile @staging @OkrDone @FDBRMA-283
  Scenario Outline: Update beautyID from beautyID drawer - complete data beautyid
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<username>" username on login screen
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    And User clicks login button on login screen
    Then User will see modal account status on homescreen
    And User clicks profile from homescreen menu
    When User clicks beautyId button on beauty drawer on profile
    Then User will direct to edit beauty id screen
    And User clicks edit and complete beauty profile
    Then User will see completed data beauty profile screen
    And User clicks edit and complete beauty concern
    Then User will see completed data beautyid screen

    Examples:
      |   username            |   password      |
      |	  emptypersonal013	  |   test123       |

  #FDBRMA-279 #FDBRMA-281
  @Android @Smoke @updateprofile @staging @OkrDone @FDBRMA-279
  Scenario Outline: Update beauty profile and then click save on its own screen
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<username>" username on login screen
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    And User clicks login button on login screen
    Then User will see modal account status on homescreen
    And User clicks profile from homescreen menu and edit beautyId
    Then User will direct to edit beauty id screen
    And User clicks edit and complete beauty profile
    Then User will see completed data beauty profile screen
    And User will see toast msg to inform beauty profile updated
    Then User will see completed data beauty profile screen

    Examples:
      |   username                 |   password      |
      |	  emptybeautyprofileown06  |   test123       |

  #FDBRMA-280 #FDBRMA-282
  @Android @Smoke @updateprofile @staging @OkrDone @FDBRMA-280
  Scenario Outline: Update beauty concern and then click save on its own screen
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<username>" username on login screen
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    And User clicks login button on login screen
    Then User will see modal account status on homescreen
    And User clicks profile from homescreen menu and edit beautyId
    Then User will direct to edit beauty id screen
    And User clicks edit and complete beauty concern
    Then User will see completed data beauty concern screen

    Examples:
      |   username                |   password      |
      |	  emptypersonal015	  |   test123       |

  @Android @Smoke @updateprofile @staging @OkrDone @FDBRMA-279 @wip
  Scenario Outline: Update beauty profile and then click save on edit profile screen
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<username>" username on login screen
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    And User clicks login button on login screen
    Then User will see modal account status on homescreen

    Examples:
      |   username                |   password      |
      |	  emptypersonal015	  |   test123       |

  @Android @Smoke @updateprofile @staging @OkrDone @FDBRMA-280 @wip
  Scenario Outline: Update beauty concern and then click save on edit profile screen
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<username>" username on login screen
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    And User clicks login button on login screen
    Then User will see modal account status on homescreen

    Examples:
      |   username                |   password      |
      |	  emptypersonal015	  |   test123       |

  @Android @Smoke @staging @OkrDone @RPA-275
  Scenario Outline: Close Bottom Sheet Vertical Ellipsis Menu
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<username>" username on login screen
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    And User clicks login button on login screen
    Then User will see modal account status on homescreen
    And User clicks profile from homescreen menu and close more menu
    Then User click beautyid and close drawer beautyId

    Examples:
      |   username        |   password      |
      |	  productmatches  |   test123       |
