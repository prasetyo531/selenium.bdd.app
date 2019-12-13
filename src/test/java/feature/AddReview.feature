Feature: User Add Review

  In order to perform sucessfull submit review
  As user that have complete profile
  I should able to fill all option of add review process

  Scenario Outline: Add review from product detail
    Given User navigates to onboarding screen by click next
    When User click login button on onboarding screen
    Then User input the "<username>" username
    And User input the "<password>" password
    When User click login button on login screen
    Then User should be directed to homescreen
    When User click most top product from product matches
    Then User should be directed to product detail screen
    When User click add review button on product detail screen
    Then User directed to add review screen
    And User fill all option of add review process
    And User choose fd flash sale as source where they get the product
    When User click submit review
    Then User click see my review screen
    And User should see review detail from feed

    Examples:
      |   username    |		password		 |
      |	  testqa	  |		test123 		 |


