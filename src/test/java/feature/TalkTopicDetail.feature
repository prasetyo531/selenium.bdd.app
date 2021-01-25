Feature: User navigate to topic detail screen

  In order to perform sucessfull reply topic and reply talk
  And search topic
  I should able to operate all feature

  ####  Topic ####
  @Android @Talk @ReplyTopic @Bug
  Scenario Outline: Create reply topic at not joined group
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    And User enters the "<username>" username and "<password>" password then click login button on login screen
    Then User will see modal account status on homescreen
    And User click menu fdtalk on homescreen menu
    When User submit reply topic at not joined group "<group>"
    And User will see confirmation that inform user will automatically joined group after reply topic
    Then User will see new reply topic added and user will member of group

    Examples:
      | username  | password | group            |
      | bddtalk03 | test123  | Combination Skin |

  @Android @Talk @ReplyTopic @TalkProfile
  Scenario Outline: Open created topic from profile
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    And User enters the "<username>" username and "<password>" password then click login button on login screen
    Then User will see modal account status on homescreen
    When User clicks topic from topic list on profile
    Then User will direct to topic detail screen

    Examples:
      |   username    |   password    |
      |	  putwid      |   123tester   |
    
  ####  Edit Topic ####
  #FDBRMA-97 
  @Android @Talk @ReplyTopic @TalkProfile @TestTalkMacia
  Scenario Outline: Check title field - field title is empty
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    And User enters the "<username>" username and "<password>" password then click login button on login screen
    Then User will see modal account status on homescreen
    And user close modal rate app
    When User clicks topic from topic list on profile
    And User edit topic from topic on list profile 
    And User submit topic with empty title
    Then User will see toast msg that title at least have 15 character

    Examples:
      | username | password |
      | usertalk | test123  |
    
  #FDBRMA-98
  @Android @Talk @ReplyTopic @TalkProfile @TestTalkMacia
  Scenario Outline: Check description field - field description is empty
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    And User enters the "<username>" username and "<password>" password then click login button on login screen
    Then User will see modal account status on homescreen
    And user close modal rate app
    When User clicks topic from topic list on profile
    And User edit topic from topic on list profile
    And User submit topic with empty description
    Then User will see toast msg that desc at least have 100 character

    Examples:
      | username | password |
      | usertalk | test123  |    
    
  #FDBRMA-99
  @Android @Talk @ReplyTopic @TalkProfile @TestTalkMaciaFailed
  Scenario Outline: Check tagging field - remove all tags
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    And User enters the "<username>" username and "<password>" password then click login button on login screen
    Then User will see modal account status on homescreen
    And user close modal rate app
    When User clicks topic from topic list on profile
    And User edit topic from topic on list profile
    And User submit topic after remove all tags
    Then User will see toast msg that need at least one tag

    Examples:
      | username | password |
      | usertalk | test123  |      
    
    
  

  ####  Talk ####
  @Android @Talk @ReplyTalk @Bug
  Scenario Outline: Create reply talk at not joined group
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    And User enters the "<username>" username and "<password>" password then click login button on login screen
    Then User will see modal account status on homescreen
    And User click menu fdtalk on homescreen menu
    When User submit reply talk at not joined group "<group>" and at topic "<topic>"
    And User will see confirmation that inform user will automatically joined group after reply talk
#    Then User will see new reply talk added and user will member of group

    Examples:
      |   username       |   password    |    group        |   topic    |
      |	  bddtalk03      |   test123     | Men's Grooming  |  topic no in  |

  @Android @Talk @TalkProfile @demotalk2
  Scenario Outline: Open created talk from profile
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    And User enters the "<username>" username and "<password>" password then click login button on login screen
    Then User will see modal account status on homescreen
    When User clicks talk from talk list on profile
    Then User will direct to topic detail screen

    Examples:
      |   username    |   password    |
      |	  putwid      |   123tester   |