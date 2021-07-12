Feature: User Check Review

  In order to perform sucessfull check post
  I should able see post only tagged product
  I should able see post tagged product with review
  I should able report, share, delete post

   #FDBRMA-348 #FDBRMA-349
  @Android @CheckReview @Staging @testShareReview @OkrDone @FDBRMA-348
  Scenario Outline: Report - Share review other user from other user profile
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<email>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    Then User will be directed to homescreeen app
    And User clicks other user profile menu "<fullname>" and select review
    When User clicks share review from review detail
    Then User will see option which app to taking share
    When User clicks report review from review detail
    And User will see option which reason to reporting review
    Then User will see toast msg after report review

    Examples:
      |         email    |        password       |     fullname     |
      |	      editreviewbdd	 |        test123        |    hanafeberia      |