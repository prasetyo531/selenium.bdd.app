Feature: login into Android Apps

  As a member of female daily
  I want to login into FD Apps but I cant verify my phone number
  I switch the account and login using another account
  So that, I can login into FD Apps

  #FDBRMA-717
  @Android @switchAccount @Staging @switchAccount @OkrDone @FDBRMA-717
  Scenario Outline: Login after change account using unverified phone number
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<username>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    And User tap button get it now modal get point
    Then User will see verify phone screen to complete by user
    When User switch account by tap button change
    Then User logout from FD apps

    Examples:
      | username   | password |
      | switchaccountpras     | test123  |

  #FDBRMA-711
  @Android @switchAccount @Staging @switchAccount @OkrDone
  Scenario Outline: Login and verify using unverified phone number account
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<username>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    And User tap button get it now modal get point
    Then User will see verify phone screen to complete by user
    When User clicks verify now button on verify phone screen bypass otp
    And User tap button next on modal verify success
    Then User will see congratulation modal

    Examples:
      | username      | password |
      | switchaccountpras01 | test123  |

  #FDBRMA-714
  @Android @switchAccount @Staging @switchAccount @OkrDone
  Scenario Outline: Change account by empty phone number user
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<username>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    And User tap button get it now modal get point
    Then User will see verify phone screen to complete by user
    When User switch account by tap button change
    Then User logout from FD apps

    Examples:
      | username   | password |
      | switchaccountpras03 | test123  |

  #FDBRMA-715
  @Android @switchAccount @Staging @switchAccountDone @OkrDone
  Scenario Outline: Change account after change phone number user
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<username>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    And User tap button get it now modal get point
    Then User will see verify phone screen to complete by user
    When User change phone "<newphonum>" before switch account
    Then User logout from FD apps

    Examples:
      | username      | password | newphonum    |
      | switchaccountpras03 | test123  | 087990000000 |