Feature: User do comment, like or mention

  In order to perform sucessfull do contribution
  I should able to comment, like or mention other members

  Background: User is Logged In
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the username on login screen
    And User clicks next button on login screen
    And User enters the password on login screen
    And User clicks login button on login screen
    Then User will see modal account status on homescreen

  @FDBRMA-355 @demoCom
  Scenario: Reply in comment of post
    Given User clicks feed from homescreen menu and select comment
    When User click reply from any comment and click post
    Then User will see submited comment
    When User delete comment
    Then User will see comment deleted

  @FDBRMA-360 @demoCom
  Scenario: Delete comment on post
    Given User clicks feed from homescreen menu and select comment
    When User input comment and click post
    Then User will see submited comment
    When User delete comment
    Then User will see comment deleted

  @FDBRMA-336 @wip
  Scenario: Report comment
