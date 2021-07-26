Feature: User do comment, like or mention

  In order to perform sucessfull do contribution
  I should able to comment, like or mention other members

  @Android @Comment @Regression @OkrDone @FDBRMA-355 @FDBRMA-360
  Scenario: Reply in comment of post - Delete comment on post
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the username that have post on login screen
    And User clicks next button on login screen
    And User enters the password on login screen
    And User clicks login button on login screen
    Then User will be directed to homescreeen app
    When User clicks feed from homescreen menu and select comment post
    And User click reply from any comment and click post
    Then User will see submited comment
    When User delete comment
    Then User will see comment deleted

  @Android @Comment @Regression @OkrDone @FDBRMA-356 @FDBRMA-361
  Scenario: Reply in comment of review - Delete comment on review
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the username that have review on login screen
    And User clicks next button on login screen
    And User enters the password on login screen
    And User clicks login button on login screen
    Then User will be directed to homescreeen app
    When User clicks feed from homescreen menu and select comment review
    And User click reply from any comment and click post
    Then User will see submited comment
    When User delete comment
    Then User will see comment deleted

  @Android @Comment @OkrDone @FDBRMA-336
  Scenario: Report comment
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the username that have post on login screen
    And User clicks next button on login screen
    And User enters the password on login screen
    And User clicks login button on login screen
    Then User will be directed to homescreeen app
    When User clicks feed from homescreen menu and select comment post
    And User report comment
    Then User will see toast msg after report comment