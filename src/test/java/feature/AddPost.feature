Feature: User Add Post

  In order to perform sucessfull submit post
  I should able to fill all option of add post process

  Background: User is Logged In
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the username on login screen
    And User clicks next button on login screen
    And User enters the password on login screen
    And User clicks login button on login screen
    Then user will see modal account status on homescreen

  @FDBRMA-54
  Scenario: Add post image only camera - Add post without tag product
    Given User clicks add post from homescreen menu
    When User take picture to add post
    Then User enters caption of post
    And User clicks submit post and choose yes to skip tagging product
    Then User will direct to feed where last post is at most top