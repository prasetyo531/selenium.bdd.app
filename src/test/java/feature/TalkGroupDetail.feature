Feature: User navigate to talk group screen

  In order to perform sucessfull add topic
  And search topic
  I should able to operate all feature

  #FDBRMA-94
  @Android @Talk @AddTopic @demotalk
  Scenario Outline: Create topic at not joined group
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    And User enters the "<username>" username and "<password>" password then click login button on login screen
    Then User will see modal account status on homescreen
    And User click menu fdtalk on homescreen menu
    When User submit add topic at not joined group
    And User will see confirmation that inform user will automatically joined group after add topic
    Then User will see new topic added

    Examples:
      |   username       |   password    |
      |	  bddtalk02      |   test123     |

  @Android @Talk @EditTopic @Bug @demotalk
  Scenario Outline: Edit topic at not joined group - edit description
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    And User enters the "<username>" username and "<password>" password then click login button on login screen
    Then User will see modal account status on homescreen
    And User click menu fdtalk on homescreen menu
    When User edit topic at not joined group "<group>" and search topic "<topic>"
    And User will see confirmation that inform user will automatically joined group after edit topic
    Then User will see topic updated

    Examples:
      |   username       |   password    |      group     |   topic    |
      |	  bddtalk02      |   test123     | Feminine Care  | bdd edit topic  |
