Feature: User navigate to talk homepage

  In order to perform sucessfull join group, sorting group, find all talk group or even leave group
  And search topic, talk, group
  I should able to operate all feature

  
  #FDBRMA-400
  @Android @Talk 
  Scenario Outline: Join group from snippet on Home Screen
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    And User enters the "<username>" username and "<password>" password then click login button on login screen
    Then User will see modal account status on homescreen
    And user close modal rate app
    And User scroll until see talk section on homescreen
    When User clicks join any group from group card on homescreen
    Then User will see member button on group card homescreen
    
    Examples:
      |   username        |   password    |
      |	  usertalk	      |   test123     |
    
  #FDBRMA-71 #FDBRMA-78 #FDBRMA-83
  @Android @Talk
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
    
  #FDBRMA-610
  @Android @Talk @TestTalkMacia1
  Scenario Outline: Follow member from recent talk card
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    And User enters the "<username>" username and "<password>" password then click login button on login screen
    Then User will see modal account status on homescreen
    And User click menu fdtalk on homescreen menu
    And User scroll until see recent activity
    And user follow member from recent talk card

    Examples:
      | username | password |
      | usertalk | test1234 |
    
  #FDBRMA-611
  @Android @Talk @TestTalkMacia1
  Scenario Outline: Follow member from recent topic card
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    And User enters the "<username>" username and "<password>" password then click login button on login screen
    Then User will see modal account status on homescreen
    And User click menu fdtalk on homescreen menu
    And User scroll until see recent activity
    Then User click on tab Topic
    And user follow member from recent talk card

    Examples:
      | username   | password |
      | usertalk01 | test1234 |  
    
  #FDBRMA-612
  @Android @Talk @TestTalkMacia @Failed
  Scenario Outline: Like recent talk from recent talk tab
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    And User enters the "<username>" username and "<password>" password then click login button on login screen
    Then User will see modal account status on homescreen
    And User click menu fdtalk on homescreen menu
    And User scroll until see recent activity
    And user like recent talk from tab Talk

    Examples:
      | username   | password |
      | usertalk01 | test1234 |      
    