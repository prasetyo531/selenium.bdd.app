Feature: User Join Campaign

  In order to perform sucessfull join campain
  I should able to fill form personal info, beauty profile, beauty concern and address
  If user cancel post, user will get confirmation modal

  c
  @Android @Tnr @tnrtest
  Scenario Outline: Click Join Now on highlighted campaign - Complete Personal Info - Complete Beauty Profile and Concern - Complete Shipping Info - Submit Campaign
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then user enters the "<email>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    Then User will see modal account status on homescreen and click tnr menu
    When User clicks join campaign from campaign detail of highlighted campaign
    Then User will see participant summary form
    And User complete data tnr on personal info screen "<fullname>"
    And User complete data tnr on beauty profile screen
    And User complete data tnr on beauty concern screen
    And User complete data tnr on shipping information screen "<firstname>", "<lastname>" and set main address
    When User clicks submit to join campaign
    Then User will see success toast message after joined campaign

    Examples:
      |         email        |    password    |  fullname   |      firstname       |     lastname    |
      |	      bddtnrandroid	 |    test123     |    newtnr   |      address1        |   1address      |