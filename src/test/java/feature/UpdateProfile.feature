Feature: Update Profile

  In order to perform sucessfull update profile
  if user update beauty profile, product matches and beauty box direct to beauty concern
  if user update beauty concern, product matches and beauty box direct to beauty profile

  #FDBRMA-276 #RPA-138 #RPA-140
  @Android @Smoke @updateprofile @staging @OkrDone @FDBRMA-276
  Scenario Outline: Input all Field on profile screen
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<username>" username on login screen
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    And User clicks login button on login screen
    Then User will see modal account status on homescreen
    And User clicks profile from homescreen menu and edit profile
    And User fill dob, location, gender, bio "<bio>"
    When User clicks save to save all updated field
    Then User will see all inputed data location and "<bio>" are stored

    Examples:
      |   username        |   password      |     bio       |
      |	  bddbeautyid01	  |   test123       |   pras pras pras  |

  #FDBRMA-278
  @Android @Smoke @updateprofile @staging @OkrDone @FDBRMA-278
  Scenario Outline: Save profile using empty personal info, save without fill any field
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<username>" username on login screen
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    And User clicks login button on login screen
    Then User will see modal account status on homescreen
    And User clicks profile from homescreen menu and edit profile
    When User clicks save to save all updated field
    Then User will see all inputed data location and bio are empty

    Examples:
      |   username            |   password      |
      |	  emptypersonal03	  |   test123       |