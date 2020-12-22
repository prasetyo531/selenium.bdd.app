Feature: User navigate to talk group screen

  In order to perform sucessfull add topic
  And search topic
  I should able to operate all feature

  #FDBRMA-94
  @Android @Talk @Topictest
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
