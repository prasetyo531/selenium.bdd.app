Feature: Verify account

  In order to perform sucessfull verify
  User should have real email
  User should have real number
  User should fill personal info, beauty profile and concern

  @Android @Smoke @Profile @RealDevices @IntegrationTest @WIP
  Scenario Outline: Verify profile as registered user, email is registed, user complete all detail
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then user enters the "<username>" username on login screen
    And user enters the "<password>" password on login screen
    And user clicks login button on login screen
    When user click complete verify button on modal
    Then user clicks verify now button on verify email screen
    And user fill "<phone>" phone and verify on verify phone screen
    And user fill all mandatory field on personal info screen
    And user choose beauty profile on beauty profile screen
    And user choose beauty profile on beauty concern screen
    Then user will see congratulation modal

    Examples:
      |   username        |   password    |       phone           |
      |	  bddregister	  |   test123     |     081284915951      |

  @Android @Smoke @Profile @RealDevices @IntegrationTest @WIP
  Scenario Outline: Verify profile as registered user, email and phone is registered, user complete all detail
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then user enters the "<username>" username on login screen
    And user enters the "<password>" password on login screen
    And user clicks login button on login screen
    When user click complete verify button on modal
    Then user clicks verify now button on verify email screen
    And user clicks verify now button on verify phone screen
    And user fill all mandatory field on personal info screen
    And user choose beauty profile on beauty profile screen
    And user choose beauty profile on beauty concern screen
    Then user will see congratulation modal

    Examples:
      |   username        |   password    |
      |	  bddregister	  |   test123     |

  @Android @Smoke @Profile @RealDevices @IntegrationTest @WIP
  Scenario Outline: Verify profile as registered user, email and phone is empty, user complete all detail
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then user enters the "<username>" username on login screen
    And user enters the "<password>" password on login screen
    And user clicks login button on login screen
    When user click complete verify button on modal
    Then user fill "<email>" email and verify on verify email screen
    And user fill "<phone>" phone and verify on verify phone screen
    And user fill all mandatory field on personal info screen
    And user choose beauty profile on beauty profile screen
    And user choose beauty profile on beauty concern screen
    Then user will see congratulation modal

    Examples:
      |   username        |   password    |          email                          |     phone      |
      |	  bddregister	  |   test123     |     newverifyandroid@mailinator.com     |  081284915951  |

  @Android @Smoke @Profile @RealDevices @IntegrationTest @WIP
  Scenario Outline: Verify profile as registered user, skip verify email and phone
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then user enters the "<username>" username on login screen
    And user enters the "<password>" password on login screen
    And user clicks login button on login screen
    When user click complete verify button on modal
    Then user click skip button on verify email screen
    And user click skip button on verify phone screen
    And user fill all mandatory field on personal info screen
    And user choose beauty profile on beauty profile screen
    And user choose beauty profile on beauty concern screen
    Then user will see congratulation modal