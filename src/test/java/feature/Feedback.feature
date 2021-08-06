Feature: Feedback

  In order to acceptence criteria
  Send feedback by user
  User can send feedback by with or without attach screenshot

  Background: User is Logged In
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the username on login screen
    And User clicks next button on login screen
    And User enters the password on login screen
    And User clicks login button on login screen
    Then User will be directed to homescreeen app

  @RPA-272 @feedback @Staging @OkrDone @DemoTest
  Scenario: Send Feedback Without Input All Mandatory Fields
    Given User open profile then open feedback menu
    When User click submit
    Then display modal popup to fill out field

  @RPA-273 @feedback @Staging @OkrDone
  Scenario: Send Feedback Without Attach Screenshots
    Given User open profile then open feedback menu
    When User fill out all field and click submit
    Then display success modal popup

  @RPA-274 @feedback @Staging @OkrDone
  Scenario: Send Feedback With Attach Screenshots
    Given User open profile then open feedback menu
    When User fill out all field and attach screenshot
    Then display success modal popup