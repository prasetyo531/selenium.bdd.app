Feature: User navigate to topic detail screen

  In order to perform sucessfull reply topic and reply talk
  And search topic
  I should able to operate all feature

  ####  Topic ####
  @Android @Talk @ReplyTopic
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
      |   username       |   password    |    group    |
      |	  bddtalk03      |   test123     | Combination Skin  |

  ####  Talk ####

  @Android @Talk @ReplyTalk
  Scenario Outline: Create reply talk at not joined group