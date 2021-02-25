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
      |	  usertalk	      |   test1234    |
    
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
  @Android @Talk @TestTalkMacia @Pass @checkPras
  Scenario Outline: Follow member from recent talk card
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    And User enters the "<username>" username and "<password>" password then click login button on login screen
    Then User will see modal account status on homescreen
    And User click menu fdtalk on homescreen menu
    And User scroll until see recent activity
    When User follow member from recent talk card
    Then User will see button change to following

    Examples:
      | username   | password |
      | usertalk01 | test123  |
    
  #FDBRMA-611
  @Android @Talk @TestTalkMacia @Pass @check
  Scenario Outline: Follow member from recent topic card
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    And User enters the "<username>" username and "<password>" password then click login button on login screen
    Then User will see modal account status on homescreen
    And User click menu fdtalk on homescreen menu
    And User scroll until see recent activity
    Then User click on tab Topic
    When User follow member from recent topic card
    Then User will see button change to following

    Examples:
      | username   | password |
      | usertalk01 | test123  |
    
  #FDBRMA-612
  @Android @Talk @TestTalkMacia @Pass @check
  Scenario Outline: Like recent talk from recent talk tab
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    And User enters the "<username>" username and "<password>" password then click login button on login screen
    Then User will see modal account status on homescreen
    And User click menu fdtalk on homescreen menu
    And User scroll until see recent activity
    When User like recent talk from tab Talk
    Then User will see counter liked is increased

    Examples:
      | username | password |
      | usertalk | test1234 |

  #FDBRMA-613
  @Android @Talk @TestTalkMacia @Pass @check
  Scenario Outline: Reply most recent talk
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    And User enters the "<username>" username and "<password>" password then click login button on login screen
    Then User will see modal account status on homescreen
    And User click menu fdtalk on homescreen menu
    And User scroll until see recent activity
    When User tap on reply button at talk card
    Then User will see topic detail screen
    When User reply talk on topic detail
    Then User will see new reply talk

    Examples:
      | username | password |
      | usertalk | test1234 |  

  #FDBRMA-614
  @Android @Talk @TestTalkMacia @Pass @check
  Scenario Outline: Reply most recent topic
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    And User enters the "<username>" username and "<password>" password then click login button on login screen
    Then User will see modal account status on homescreen
    And User click menu fdtalk on homescreen menu
    And User scroll until see recent activity
    Then User click on tab Topic
    When User click on recent topic
    Then User will see topic detail screen
    When User reply topic on topic detail
    Then User will see new reply topic

    Examples:
      | username | password |
      | usertalk | test1234 |      

  #FDBRMA-616
  @Android @Talk @TestTalkMacia @Pass @checkPras
  Scenario Outline: Check see more talk
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    And User enters the "<username>" username and "<password>" password then click login button on login screen
    Then User will see modal account status on homescreen
    And User click menu fdtalk on homescreen menu
    And User scroll until last screen
    When User click on see more talk
    Then User will see list of recent talk

    Examples:
      | username | password |
      | usertalk | test1234 |    
    
  #FDBRMA-617
  @Android @Talk @TestTalkMacia @Pass @check
  Scenario Outline: Check see more topic
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    And User enters the "<username>" username and "<password>" password then click login button on login screen
    Then User will see modal account status on homescreen
    And User click menu fdtalk on homescreen menu
    When User scroll and click tab Topic
    And User scroll until last screen
    When User click on see more topic
    Then User will see list of recent topic

    Examples:
      | username | password |
      | usertalk | test1234 |        
    