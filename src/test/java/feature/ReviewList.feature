Feature: Review List

  In order to acceptence criteria
  Label description thumbnail should have 3 row
  This thumbnail located on snippet review on product detail, review list screen and review list profile

  #FDBRMA-323 #FDBRMA-324 #FDBRMA-325
  @Android @reviewlist @Staging @OkrDone @FDBRMA-323
  Scenario Outline: User filter - sort review list
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<username>" username on login screen
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    And User clicks login button on login screen
    Then User will be directed to homescreeen app
    And User clicks see more reviews on product detail
    When User clicks filter reviews
    And User clicks sort option by most likes
    Then Reviews list will changed following sort and filter option

    Examples:
      |   username        |   password    |
      |	  editreviewbdd	      |   test123     |