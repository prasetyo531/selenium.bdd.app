Feature: Comment and Mention

  In order to perform sucessfull do action of comment or mention
  I should able to find post or review,
  I should follow another user, user whose post or review to mention

  Background: User is Logged In
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the username on login screen
    And User clicks next button on login screen
    And User enters the password on login screen
    And User clicks login button on login screen
    Then User will be directed to homescreeen app

  #staging
  @Android @Comment @FDBRMA-330
  Scenario Outline: Mention followed user on post
    When User clicks search "<fullname>" users on homescreen
    And User select most top result
    When User clicks post list on profile
    And user clicks comment icon post
    And User post "<commentmention>" comment and mention owned post
    Then User back to post detail

    Examples:
      |   fullname    |     commentmention        |
      |	  hanafeberia	 |    @h   |

  #staging
  @Android @Comment @FDBRMA-343
  Scenario Outline: Mention followed user on review
    When User clicks search "<fulname>" users on homescreen
    And User select most top result
    When User clicks reviews tab on profile
    And User clicks review list on profile
    And user clicks comment icon review
    And User post "<commentmention>" comment and mention owned review
    Then User back to review detail

    Examples:
      |   fulname            |     commentmention       |
      |	  hanafeberia	         |     @h  |

  #staging
  @Android @Comment @RPA-216
  Scenario Outline: Mention unfollowed user on post
    When User clicks search "<fullname>" users on homescreen
    And User select most top result
    When User clicks post list on profile
    And user clicks comment icon post
    And User post "<commentmention>" comment
    Then User back to post detail

    Examples:
      |   fullname    |     commentmention        |
      |	  hanafeberia	 |    test comment post @hanafeberia   |

  #staging
  @Android @Comment @RPA-314
  Scenario Outline: Mention unfollowed user on review
    When User clicks search "<fulname>" users on homescreen
    And User select most top result
    When User clicks reviews tab on profile
    And User clicks review list on profile
    And user clicks comment icon review
    And User post "<commentmention>" comment
    Then User back to review detail

    Examples:
      |   fulname            |     commentmention       |
      |	  hanafeberia	         |   @h  |
