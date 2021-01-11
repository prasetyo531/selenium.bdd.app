Feature: User navigate to talk homepage

  In order to perform sucessfull join group, sorting group, find all talk group or even leave group
  And search topic, talk, group
  I should able to operate all feature

  #FDBRMA-71 #FDBRMA-78 #FDBRMA-83
  @Android @Talk @Talktest @demotalk
  Scenario Outline: Check functionality of 'Join Group' button on group card
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    And User enters the "<username>" username and "<password>" password then click login button on login screen
    Then User will see modal account status on homescreen
    And User click menu fdtalk on homescreen menu
    When User join any group from group card on talk home
    Then User will see member button and see joined group appear on joined tab

    Examples:
      |   username        |   password    |
      |	  bddtalk01	      |   test123     |