Feature: User Join Campaign

  In order to perform sucessfull join campain
  I should able to fill form personal info, beauty profile, beauty concern and address
  If user cancel post, user will get confirmation modal

  Precondition : set test data already verified
                 all personal info, beauty profile and concern data must empty

  #FDBRMA-306 #FDBRMA-452 #FDBRMA-457 #FDBRMA-458 #FDBRMA-459 #FDBRMA-460 #FDBRMA-461 #FDBRMA-485 #FDBRMA-473 #FDBRMA-489 #FDBRMA-490
  @Android @Tnr @Staging
  Scenario Outline: Click Join Now on highlighted campaign - Complete Personal Info - Complete Beauty Profile and Concern - Complete Shipping Info - Submit Campaign
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<username>" email to login
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
      |       username   |    password    |  fullname   |      firstname       |     lastname    |
      |	      tnrbdd01	 |    test123     |    newtnr   |      address1        |   1address      |

  #FDBRMA-478 #FDBRMA-453 #FDBRMA-454
  @Android @Tnr @Staging
  Scenario Outline: Save Personal Info without input any field - Min char Full Name - More than 100 char
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<email>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    Then User will see modal account status on homescreen and click tnr menu
    When User clicks join campaign from campaign detail of highlighted campaign
    Then User will see participant summary form
    And User complete data tnr on personal info screen "<fullname>"
    Then Display red toast "fullname should be 2-100 chars in length"

    Examples:
      |         email            |    password    |  fullname   |
      |	      tnrpersonalinfo01	 |    test123     |    n   |
      |	      tnrpersonalinfo01	 |    test123     |    askmdlasmdasdsadasdasdasdasdasasdasdasdasdasdasdasalmdlakmsdlkamsdlakdmaldsmalkdmalmdsladmalsdmalmdladjsandjasdhasdhajsdhashdausdahsduasdaysdha   |

  #FDBRMA-455
  @Android @Tnr @Staging
  Scenario Outline: Save Personal Info Input Special Char
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<email>" email to login
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
  @Android @Tnr @Staging
  Scenario Outline: Save Personal Not select gender
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<email>" email to login
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
      |	      tnrpersonalinfo02	 |    test123     |    newtnr   |

  ### Address Form ###

  #FDBRMA-462
  @Android @Tnr @Staging
  Scenario Outline: Save Add New Address without fill all mandatory field
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<email>" email to login
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
      |	      tnrpersonalinfo02	 |    test123     |

  #FDBRMA-463
  @Android @Tnr @Staging
  Scenario Outline: Save Add New Address without fill first name
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<email>" email to login
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
      |	      tnrpersonalinfo02	 |    test123     |

  #FDBRMA-464
  @Android @Tnr @Staging
  Scenario Outline: Save Add New Address without fill last name
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<email>" email to login
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
      |	      tnrpersonalinfo02	 |    test123     |

  #FDBRMA-465
  @Android @Tnr @Staging
  Scenario Outline: Save Add New Address without fill phone number
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<email>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    Then User will see modal account status on homescreen and click tnr menu
    When User clicks join campaign from campaign detail of highlighted campaign
    Then User will see participant summary form
    When User save address form but let empty phone number
    Then Display red toast "Oops ... you need to fill in all data"

    Examples:
      |         email            |    password    |
      |	      tnrpersonalinfo02	 |    test123     |

  #FDBRMA-466 #FDBRMA-467 #FDBRMA-468
  @Android @Tnr @Staging
  Scenario Outline: Save Add New Address without fill province, city, district
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<email>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    Then User will see modal account status on homescreen and click tnr menu
    When User clicks join campaign from campaign detail of highlighted campaign
    Then User will see participant summary form
    When User save address form but let empty province
    Then Display red toast "Oops ... you need to fill in all data"

    Examples:
      |         email            |    password    |
      |	      tnrpersonalinfo02	 |    test123     |

  #FDBRMA-469
  @Android @Tnr @Staging
  Scenario Outline: Save Add New Address without fill postal code
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<email>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    Then User will see modal account status on homescreen and click tnr menu
    When User clicks join campaign from campaign detail of highlighted campaign
    Then User will see participant summary form
    When User save address form but let empty postal code
    Then Display red toast "Oops ... you need to fill in all data"

    Examples:
      |         email            |    password    |
      |	      tnrpersonalinfo02	 |    test123     |

  #FDBRMA-470
  @Android @Tnr @Staging
  Scenario Outline: Save Add New Address without fill complete address
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<email>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    Then User will see modal account status on homescreen and click tnr menu
    When User clicks join campaign from campaign detail of highlighted campaign
    Then User will see participant summary form
    When User save address form but let empty complete address
    Then Display red toast "Oops ... you need to fill in all data"

    Examples:
      |         email            |    password    |
      |	      tnrpersonalinfo02	 |    test123     |

  #FDBRMA-471
  @Android @Tnr @Staging @CheckTnr
  Scenario Outline: Add New Address Until Maximum Number of Allowed Address
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<email>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    Then User will see modal account status on homescreen and click tnr menu
    When User clicks join campaign from campaign detail of highlighted campaign
    Then User will see participant summary form
    When User save more address after user already had 4 address
    Then User will not see button add new address on list address screen

    Examples:
      |         email    |    password    |
      |	      datatnr01	 |    test123     |

  #FDBRMA-472
  @Android @Tnr @Staging @CheckTnr
  Scenario Outline: Choose Any Address to Become Shipping Information Address
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<email>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    Then User will see modal account status on homescreen and click tnr menu
    When User clicks join campaign from campaign detail of highlighted campaign
    Then User will see participant summary form
    When User choose any address to be main address
    Then User will see label main address on participant summary form

    Examples:
      |         email    |    password    |
      |	      datatnr01	 |    test123     |

  #FDBRMA-474 #FDBRMA-477
  @Android @Tnr @Staging
  Scenario Outline: Submit Participant Summary without Completed Personal Info - without Completed Shipping Information
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<email>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    Then User will see modal account status on homescreen and click tnr menu
    When User clicks join campaign from campaign detail of highlighted campaign
    Then User will see participant summary form
    When User clicks submit to join campaign
    Then Display red toast "Oops ... you need to fill in all data"

    Examples:
      |             email            |    password    |
      |	      completepersonalinfo	 |    test123     |

  #FDBRMA-475
  @Android @Tnr @Staging @wip
  Scenario Outline: Submit Participant Summary without Completed Beauty Profile
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<email>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    Then User will see modal account status on homescreen and click tnr menu
    When User clicks join campaign from campaign detail of highlighted campaign
    Then User will see participant summary form
    When User clicks submit to join campaign
    Then Display red toast "Oops ... you need to fill in all data"

    Examples:
      |         email        |    password    |
      |	      emptyprofile	 |    test123     |

  #FDBRMA-476
  @Android @Tnr @Staging @wip
  Scenario Outline: Submit Participant Summary without Completed Beauty Concern
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<email>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    Then User will see modal account status on homescreen and click tnr menu
    When User clicks join campaign from campaign detail of highlighted campaign
    Then User will see participant summary form
    When User clicks submit to join campaign
    Then Display red toast "Oops ... you need to fill in all data"

    Examples:
      |         email    |    password    |
      |	      apkprod30	 |    test123     |

  #FDBRMA-488
  @Android @Tnr @Staging
  Scenario Outline: Submit Participant Summary without Completed All Mandatory Section
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<email>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    Then User will see modal account status on homescreen and click tnr menu
    When User clicks join campaign from campaign detail of highlighted campaign
    Then User will see participant summary form
    When User clicks submit to join campaign
    Then Display red toast "Oops ... you need to fill in all data"

    Examples:
      |         email    |    password    |
      |	      emptydatatnr	 |    test123     |

  #FDBRMA-479
  @Android @Tnr @Staging @CheckTnr02
  Scenario Outline: Save Add New Address Form With Special Characters in First Name Field
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<username>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    Then User will see modal account status on homescreen and click tnr menu
    When User clicks join campaign from campaign detail of highlighted campaign
    Then User will see participant summary form
    And User complete data tnr on shipping information screen "<firstname>", "<lastname>" and set main address
    Then Display red toast "First name must be alpha character"

    Examples:
      |       username           |    password    |  fullname   |      firstname     |     lastname    |
      |	      tnrspecialchar01	 |    test123     |    newtnr   |      *&*&*&        |   last      |

  #FDBRMA-480
  @Android @Tnr @Staging @CheckTnr02
  Scenario Outline: Save Add New Address Form With Special Characters in Last Name Field
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<username>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    Then User will see modal account status on homescreen and click tnr menu
    When User clicks join campaign from campaign detail of highlighted campaign
    Then User will see participant summary form
    And User complete data tnr on shipping information screen "<firstname>", "<lastname>" and set main address
    Then Display red toast "Last name must be alpha character"

    Examples:
      |       username           |    password    |  fullname   |      firstname     |     lastname    |
      |	      tnrspecialchar01	 |    test123     |    newtnr   |      first        |   *&*&*&*      |

  #FDBRMA-481
  @Android @Tnr @Staging @CheckTnr02
  Scenario Outline: Save Add New Address Form With More Than 32 Characters in Phone Number Field
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<username>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    Then User will see modal account status on homescreen and click tnr menu
    When User clicks join campaign from campaign detail of highlighted campaign
    Then User will see participant summary form
    And User complete data tnr on shipping information screen "<phonenumber>" and set main address
    Then Display red toast "Phone number is too long, maximum 32 characters"

    Examples:
      |       username           |    password    |  phonenumber   |
      |	      tnrspecialchar01	 |    test123     |    0823849237492374923749274729374928374982374982734729834789237498273498274982738947      |

  #FDBRMA-482 #FDBRMA-483
  @Android @Tnr @Staging @CheckTnr02
  Scenario Outline: Save Add New Address Form With Less Than Four Characters on Postal Code Field
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<username>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    Then User will see modal account status on homescreen and click tnr menu
    When User clicks join campaign from campaign detail of highlighted campaign
    Then User will see participant summary form
    And User complete data tnr on shipping information screen but input invalid format postal code "<postalcode>"
    Then Display red toast "Post code must be 4-12 digits long"

    Examples:
      |       username           |    password    |  postalcode   |
      |	      tnrspecialchar01	 |    test123     |    123        |
      |	      tnrspecialchar01	 |    test123     |    1234561234561      |

  #FDBRMA-484
  @Android @Tnr @Staging @CheckTnr02
  Scenario Outline: Save Add New Address Form With More Than 128 Characters on Complete Address Field
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<username>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    Then User will see modal account status on homescreen and click tnr menu
    When User clicks join campaign from campaign detail of highlighted campaign
    Then User will see participant summary form
    And User complete data tnr on shipping information screen but input exceed allowed length address
    Then Display red toast "Address is too long, maximum 128 characters"

    Examples:
      |       username           |    password    |
      |	      tnrspecialchar01	 |    test123     |

  #FDBRMA-486
  @Android @Tnr @Staging @CheckTnr04 @Bug
  Scenario Outline: Save Add New Address Form - set as Main Address
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<username>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    Then User will see modal account status on homescreen and click tnr menu
    When User clicks join campaign from campaign detail of highlighted campaign
    Then User will see participant summary form
    And User choose address as new main address
    Then User will see label main address on participant summary form

    Examples:
      |       username   |    password    |
      |	      tnrbdd01	 |    test123     |