Feature: User Add Review

  In order to perform sucessfull submit review
  I should able to fill all option of add review process

  Background: User is Logged In
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the username on login screen
    And User clicks next button on login screen
    And User enters the password on login screen
    And User clicks login button on login screen
    Then User will be directed to homescreeen app

  @RPA-148 @AddReview @Production @testABC
  Scenario Outline: Add Review from profile tab Review
    Given User open profile then see add review button on review tab
    When User clicks fifth of popular product to review
    Then User choose overall rating
    And User choose usage periode product
    And User choose new purchase point product "<source>"
    And User choose would recommend this product
    And User fill in add review box that should contain than 200 char
    And User clicks submit review button
    Then User will see congrats screen and direct to review detail

    Examples:
      | source            |
      | addreviewprofile |

  @FDBRMA-23 @AddReview @Production @OkrDone
  Scenario: Add Review by select Category
    Given User clicks menu category from homescreen menu
    When User clicks one of category to find product
    And User will clicks one of product on product category screen
    When User clicks add review button on product detail screen
    Then User choose overall rating
    And User choose usage periode product
    And User choose purchase point product
    And User choose would recommend this product
    And User fill in add review box that should contain than 200 char
    And User clicks submit review button
    Then User will see congrats screen and direct to review detail from product detail

  @FDBRMA-24 @AddReview @Production @OkrDone
  Scenario: Add Review by select Popular Product
    Given User clicks add review from homescreen menu
    When User clicks second of popular product to review
    Then User choose overall rating
    And User choose usage periode product
    And User choose purchase point product
    And User choose would recommend this product
    And User fill in add review box that should contain than 200 char
    And User clicks submit review button
    Then User will see congrats screen and direct to review detail from feed

  @FDBRMA-25 @AddReview @Production @OkrDone
  Scenario: Add Review Edit Previous Step
    Given User clicks add review from homescreen menu
    When User clicks third popular product to review
    Then User choose overall rating
    And User choose usage periode product
    And User choose purchase point product
    And User choose would recommend this product
    And User fill in add review box that should contain than 200 char
    When User clicks previous screen until rating screen
    Then User edit choose overall rating
    And User edit choose usage periode product
    And User edit choose purchase point product
    And User edit choose would recommend this product
    And User edit review box that should contain than 200 char
    And User clicks submit review button
    Then User will see congrats screen and review detail inputed last condition

  @FDBRMA-219 @AddReview @Production @OkrDone
  Scenario Outline: Add Review input new purchase point
    Given User clicks add review from homescreen menu
    When User clicks fourth of popular product to review
    Then User choose overall rating
    And User choose usage periode product
    And User choose new purchase point product "<source>"
    And User choose would recommend this product
    And User fill in add review box that should contain than 200 char
    And User clicks submit review button
    Then User will see congrats screen and direct to review detail from feed

    Examples:
      | source            |
      | addreviewfreetext |

  @FDBRMA-367 @AddReview @Production @testABCD
  Scenario Outline: Add Review by Search Product
    Given User clicks add review from homescreen menu
    When User search "<product>" and select product from popular product to review
    Then User choose overall rating
    And User choose usage periode product
    And User choose new purchase point product "<product>"
    And User choose would recommend this product
    And User fill in add review box that should contain than 200 char
    And User clicks submit review button
    Then User will see congrats screen and direct to review detail from feed

    Examples:
      | product   |
      | lips |