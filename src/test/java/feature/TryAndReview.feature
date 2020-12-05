Feature: User Join Campaign

  In order to perform sucessfull join campain
  I should able to fill form personal info, beauty profile, beauty concern and address
  If user cancel post, user will get confirmation modal

  #FDBRMA-306 #FDBRMA-452 #FDBRMA-457 #FDBRMA-458 #FDBRMA-459 #FDBRMA-460 #FDBRMA-461 #FDBRMA-485 #FDBRMA-473 #FDBRMA-489
  @Android @Tnr
  Scenario Outline: Click Join Now on highlighted campaign - Complete Personal Info - Complete Beauty Profile and Concern - Complete Shipping Info - Submit Campaign
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then user enters the "<email>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    Then User will see modal account status on homescreen and click tnr menu
    When User clicks join campaign from campaign detail of highlighted campaign
    Then User will see participant summary form
    And User complete data tnr on personal info screen "<fullname>"
    And User complete data tnr on beauty profile screen
    And User complete data tnr on beauty concern screen
    And User complete data tnr on shipping information screen "<firstname>", "<lastname>" and set main address
    When User clicks submit to join campaign using main address
    Then User will see success toast message after joined campaign

    Examples:
      |         email            |    password    |  fullname   |      firstname       |     lastname    |
      |	      bddtnrandroid011	 |    test123     |    newtnr   |      address1        |   1address      |


  #FDBRMA-478 #FDBRMA-453 #FDBRMA-454
  @Android @Tnr @wip
  Scenario Outline: Save Personal Info without input any field - Min char Full Name - More than 100 char
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then user enters the "<email>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    Then User will see modal account status on homescreen and click tnr menu
    When User clicks join campaign from campaign detail of highlighted campaign
    Then User will see participant summary form
    When User save data personal info screen without fill any field
    Then Display red toast "Oops ... you need to fill in all data"
#    When User input "<fullname>" fullname field
#    Then Display red toast "Fullname should be 2-100 chars in length"

    Examples:
      |         email            |    password    |  fullname   |
      |	      tnrpersonalinfo01	 |    test123     |    ne   |
      |	      tnrpersonalinfo01	 |    test123     |    askmdlasmdalmdlakmsdlkamsdlakdmaldsmalkdmalmdsladmalsdmalmdladjsandjasdhasdhajsdhashdausdahsduasdaysdha   |

  #FDBRMA-455
  @Android @Tnr
  Scenario Outline: Save Personal Info Input Special Char
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then user enters the "<email>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    Then User will see modal account status on homescreen and click tnr menu
    When User clicks join campaign from campaign detail of highlighted campaign
    Then User will see participant summary form
    When User input "<fullname>" fullname field and choose dob and gender
    And User save data personal info screen
    Then Display red toast "Fullname must be alpha character"

    Examples:
      |         email            |    password    |  fullname     |   validfullname     |
      |	      tnrpersonalinfo01	 |    test123     |    newtnr@#   |     newtnr          |

  #FDBRMA-456
  @Android @Tnr
  Scenario Outline: Save Personal Not select gender
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then user enters the "<email>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    Then User will see modal account status on homescreen and click tnr menu
    When User clicks join campaign from campaign detail of highlighted campaign
    Then User will see participant summary form
    When User input correct "<fullname>" fullname field and choose dob
    And User save data personal info screen without choose gender
    Then Display red toast "Oops ... you need to fill in all data"

    Examples:
      |         email            |    password    |  fullname     |
      |	      tnrpersonalinfo01	 |    test123     |    newtnr   |

  #FDBRMA-462
  @Android @Tnr @demoVerify
  Scenario Outline: Save Add New Address without fill all mandatory field
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then user enters the "<email>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    Then User will see modal account status on homescreen and click tnr menu
    When User clicks join campaign from campaign detail of highlighted campaign
    Then User will see participant summary form
    When User save address form but let empty all mandatory field
    Then Display red toast "Oops ... you need to fill in all data"

    Examples:
      |         email            |    password    |
      |	      tnrpersonalinfo01	 |    test123     |

  #FDBRMA-463
  @Android @Tnr @demoVerify
  Scenario Outline: Save Add New Address without fill first name
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then user enters the "<email>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    Then User will see modal account status on homescreen and click tnr menu
    When User clicks join campaign from campaign detail of highlighted campaign
    Then User will see participant summary form
    When User save address form but let empty first name
    Then Display red toast "Oops ... you need to fill in all data"

    Examples:
      |         email            |    password    |
      |	      tnrpersonalinfo01	 |    test123     |

  #FDBRMA-464
  @Android @Tnr @demoVerify
  Scenario Outline: Save Add New Address without fill last name
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then user enters the "<email>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    Then User will see modal account status on homescreen and click tnr menu
    When User clicks join campaign from campaign detail of highlighted campaign
    Then User will see participant summary form
    When User save address form but let empty last name
    Then Display red toast "Oops ... you need to fill in all data"

    Examples:
      |         email            |    password    |
      |	      tnrpersonalinfo01	 |    test123     |