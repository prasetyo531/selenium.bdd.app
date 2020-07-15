Feature: Update Profile

  In order to perform sucessfull update profile
  I should able to fill all option of add post process

  #FDBRMA-328
  @FDBRMA-328
  Scenario Outline: Update beauty id on product matches
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<username>" username on login screen
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    And User clicks login button on login screen
    Then User will see modal account status on homescreen
    When User clicks complete my beautyId button
    Then User will direct to Beauty Profile screen

    Examples:
      |   username        |   password      |
      |	  bddbeautyid01	  |   test123       |

  #FDBRMA-329
  @FDBRMA-329
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
    Then User will direct to Beauty Profile screen

    Examples:
      |   username        |   password      |
      |	  bddbeautyid02	  |   test123       |

  #FDBRMA-368
  @FDBRMA-368
  Scenario Outline: Update full name - input fullname contains special character
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
    Then User will see modal fullname only alphabet

    Examples:
      |   username        |   password      |       fullname        |     bio       |
      |	  bddbeautyid04	  |   test123       |     bddbeautyid04     |   pras pras pras  |
      |	  bddbeautyid04	  |   test123       |     bdd_beauty_id     |   pras pras pras  |

  #FDBRMA-276
  @FDBRMA-276
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
  @FDBRMA-278 @Bug
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
      |	  emptypersonal01	  |   test123       |

  #FDBRMA-283
  @FDBRMA-283
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
    Then User will direct to Beauty Profile screen

    Examples:
      |   username            |   password      |
      |	  emptypersonal01	  |   test123       |


  ##### Update Password #####

  #FDBRMA-284
  @FDBRMA-284
  Scenario Outline: Update password - input wrong old password
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
    And User clicks update password
    And User input "<oldpassword>" on old password field
    And User input new "<newpassword>" invalid format on new password field
    When User clicks submit button to change password
    Then Display sneak msg "Old Password Incorrect"

    Examples:
      |   username    |   password       |   oldpassword        |     newpassword       |
      |	  apkprod	  |   test1234       |     test123          |     test1234          |

  #FDBRMA-286 #FDBRMA-287
  @Bug
  Scenario Outline: Update Password, Input password less than 6 characters and more than 25 characters
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
    And User clicks update password
    And User input "<oldpassword>" on old password field
    When User input new "<newpassword>" invalid format on new password field
    Then display msg "New password should be 6-25 characters in length" is displayed under phone number field

    Examples:
      |   username        |   password      |       oldpassword        |     newpassword       |
      |	  apkprod	  |   test123       |     bddbeautyid          |          pwd          |
      |	  apkprod	  |   test123       |     bddbeautyid          |  passwordpasswordpasswordpasswordpasswordpasswordpasswordpasswordpassword |

