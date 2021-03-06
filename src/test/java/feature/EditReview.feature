Feature: User Edit Review

  In order to perform sucessfull edit review
  I should able to fill all option of add review process
  Update purchase point using new input

  Precondition : set test data already verified and completed
                 set all field to only choose first field

  #FDBRMA-39 #FDBRMA-41
  @Android @EditReview @Staging @OkrDone @FDBRMA-39
  Scenario Outline: Update review - from feed
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<email>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    Then User will be directed to homescreeen app
    When User clicks reviewed product from feed menu
    And User clicks edit review on review detail
    Then User edit choose overall rating
    And User edit choose usage periode product
    And User edit choose purchase point product
    And User edit choose would recommend this product
    And User edit submitted review box that should contain than 200 char
    And User clicks submit review button
    Then User will see review updated

    Examples:
      |         email        |        password       |
      |	      editreviewbdd	 |        test123        |

  #FDBRMA-420 #FDBRMA-415 #FDBRMA-416
  @Android @EditReview @Staging @OkrDone @FDBRMA-420
  Scenario Outline: Update review - from tagged modal feed and Product detail
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<email>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    Then User will be directed to homescreeen app
    When User clicks edit review from modal tagged product
    Then User edit choose overall rating
    And User edit choose usage periode product
    And User edit choose purchase point product
    And User edit choose would recommend this product
    And User edit submitted review box that should contain than 200 char
    And User clicks submit review button
    Then User would directed to product detail screen

    Examples:
      |         email        |        password       |
      |	      postreviewbdd01	 |        test123        |

  #FDBRMA-414 #FDBRMA-40
  @Android @EditReview @Staging @OkrDone @FDBRMA-414
  Scenario Outline: Update review - from profile
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<email>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    Then User will be directed to homescreeen app
    When User clicks reviewed product from profile menu
    And User clicks edit review on review detail
    Then User edit choose overall rating
    And User edit choose usage periode product
    And User edit choose purchase point product
    And User edit choose would recommend this product
    And User edit submitted review box that should contain than 200 char
    And User clicks submit review button
    Then User will see review updated

    Examples:
      |         email        |        password       |
      |	      editreviewbdd	 |        test123        |