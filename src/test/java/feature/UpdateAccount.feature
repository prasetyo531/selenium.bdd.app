Feature: Update Account

  In order to perform sucessfull update account
  if user update fullname, user will see fullname is updated
  if user update password, user not able to login using old password

  #FDBRMA-368 #FDBRMA-254
  @Android @Smoke @updateprofile @staging @OkrDone @FDBRMA-368
  Scenario Outline: Update full name - input fullname contains number, special character
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<username>" username on login screen
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    And User clicks login button on login screen
    Then User will see modal account status on homescreen
    And User clicks profile from homescreen menu and edit account
    And User fill fullname "<fullname>"
    When User clicks save to save all updated field
    Then User will see modal fullname only alphabet

    Examples:
      |   username        |   password      |       fullname        |
      |	  bddbeautyid04	  |   test123       |     bddbeautyid04     |
      |	  bddbeautyid04	  |   test123       |     bdd_beauty_id     |

  #FDBRMA-374
  @Android @Smoke @updateprofile @staging @OkrDone @FDBRMA-374
  Scenario Outline: Update full name
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<username>" username on login screen
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    And User clicks login button on login screen
    Then User will see modal account status on homescreen
    And User clicks profile from homescreen menu and edit account
    And User fill fullname "<fullname>"
    When User clicks save to save all updated field
    And User will see toast msg after update fullname
    Then User will see fullname "<fullname>" on profile updated

    Examples:
      |   username        |   password      |       fullname        |
      |	  bddbeautyid04	  |   test123       |     fullnamebnerdong     |

  ##### Update Password #####

  #FDBRMA-277
  @Android @Smoke @updateprofile @staging @OkrDone @FDBRMA-277
  Scenario Outline: Update password
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<username>" username on login screen
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    And User clicks login button on login screen
    Then User will see modal account status on homescreen
    And User clicks profile from homescreen menu and edit account
    And User clicks change password
    And User input "<oldpassword>" on old password field
    And User input new "<newpassword>" on new password field
    And User input new "<confirmnewpassword>" on confirm new password field
    When User clicks submit button to change password
    Then Display sneak msg "Change Password Success!"

    Examples:
      |   username    |   password       |   oldpassword        |     newpassword       |  confirmnewpassword       |
      |	  matches00	  |   test123       |     test123          |     test1234          |     test1234               |

  #RPA-147
  @Android @Smoke @updateprofile @staging @OkrDone @RPA-147
  Scenario Outline: Update password again - input old password when login
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<username>" username on login screen
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    And User clicks login button on login screen
    Then User see and close modal account not found

    Examples:
      |   username    |   password      |
      |	  matches00	  |   test123      |

  #FDBRMA-284
  @Android @Smoke @updateprofile @staging @OkrDone @FDBRMA-284
  Scenario Outline: Update password - input wrong old password
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<username>" username on login screen
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    And User clicks login button on login screen
    Then User will see modal account status on homescreen
    And User clicks profile from homescreen menu and edit account
    And User clicks change password
    And User input "<oldpassword>" on old password field
    And User input new "<newpassword>" on new password field
    And User input new "<confirmnewpassword>" on confirm new password field
    When User clicks submit button to change password
    Then Display sneak msg "Old Password Incorrect"

    Examples:
      |   username    |   password       |   oldpassword        |     newpassword      |    confirmnewpassword    |
      |	  matches01	  |   test123       |     test1234          |     test123          |    test123               |

  #FDBRMA-286 #FDBRMA-287
  @Android @Smoke @updateprofile @staging @OkrDone @FDBRMA-286
  Scenario Outline: Update Password, Input password less than 6 characters and more than 25 characters
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<username>" username on login screen
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    And User clicks login button on login screen
    Then User will see modal account status on homescreen
    And User clicks profile from homescreen menu and edit account
    And User clicks change password
    And User input "<oldpassword>" on old password field
    And User input new "<newpassword>" on new password field
    And User input new "<confirmnewpassword>" on confirm new password field
    When User clicks submit button to change password
    Then Display sneak msg "Password should be 6-25 characters in length"

    Examples:
      |   username        |   password      |       oldpassword        |     newpassword       |  confirmnewpassword    |
      |	  campaigntest	  |   test123       |     bddbeautyid          |          pwd          |      test1234           |
      |	  campaigntest	  |   test123       |     bddbeautyid          |  passwordpasswordpasswordpasswordpasswordpasswordpasswordpasswordpassword |  test1234 |

  #FDBRMA-427
  @Android @Smoke @updateprofile @staging @OkrDone @FDBRMA-427
  Scenario Outline: Update password - input new password same as old password
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<username>" username on login screen
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    And User clicks login button on login screen
    Then User will see modal account status on homescreen
    And User clicks profile from homescreen menu and edit account
    And User clicks change password
    And User input "<oldpassword>" on old password field
    And User input new "<newpassword>" on new password field
    And User input new "<confirmnewpassword>" on confirm new password field
    When User clicks submit button to change password
    Then Display sneak msg "Password should not same with old password"

    Examples:
      |   username    |   password       |   oldpassword        |     newpassword       |    confirmnewpassword    |
      |	  campaigntest	  |   test123       |     test123          |     test123         |     test1234             |

  #FDBRMA-426
  @Android @Smoke @updateprofile @staging @OkrDone @FDBRMA-426
  Scenario Outline: Update password - input password contains username
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<username>" username on login screen
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    And User clicks login button on login screen
    Then User will see modal account status on homescreen
    And User clicks profile from homescreen menu and edit account
    And User clicks change password
    And User input "<oldpassword>" on old password field
    And User input new "<newpassword>" on new password field
    And User input new "<confirmnewpassword>" on confirm new password field
    When User clicks submit button to change password
    Then Display sneak msg "Your password cannot include your username"

    Examples:
      |   username    |   password       |   oldpassword        |     newpassword     |   confirmnewpassword    |
      |	  campaigntest	  |   test123       |     test123      |     campaigntest     |   campaigntest             |

  #RPA-313
  @Android @Smoke @updateprofile @staging @OkrDone @RPA-313
  Scenario Outline: Update password  - input new confirm password different with new password
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<username>" username on login screen
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    And User clicks login button on login screen
    Then User will see modal account status on homescreen
    And User clicks profile from homescreen menu and edit account
    And User clicks change password
    And User input "<oldpassword>" on old password field
    And User input new "<newpassword>" on new password field
    And User input new "<confirmnewpassword>" on confirm new password field
    When User clicks submit button to change password
    Then Display sneak msg "New and confirm password do not match"

    Examples:
      |   username    |   password       |   oldpassword        |     newpassword     |   confirmnewpassword    |
      |	  campaigntest	  |   test123       |     test123      |     test1234     |   campaigntest             |