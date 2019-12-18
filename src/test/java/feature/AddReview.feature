Feature: User Add Review

  In order to perform sucessfull submit review
  As user that have complete profile
  I should able to fill all option of add review process

  Scenario Outline: Add review from product matches
    Given User navigates to onboarding screen by click next
    When User click login button on onboarding screen
    Then User input "<username>" username and "<password>" password
    When User click login button on login screen
    Then User should be directed to homescreen
    When User click most top product from product matches
    Then User should be directed to product detail screen
    When User click add review button on product detail screen
    Then User directed to add review screen
    And User fill overall rating, period of use, where get this product, is this recommended product
    When User click submit review
    Then User click see my review screen
    And User should see review detail is from feed

    Examples:
      |   username    |		password		 |
      |	  testqa	  |		test123 		 |


