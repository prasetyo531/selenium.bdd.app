Feature: User Check Post

  In order to perform sucessfull check post
  I should able see post only tagged product
  I should able see post tagged product with review
  I should able report, share, delete post

  #FDBRMA-345 #FDBRMA-346
  @CheckPost
  Scenario Outline: Report - Share post other user from discover
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then user enters the "<email>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    Then User will see modal account status on homescreen
    And User clicks discover from homescreen menu and select post
    When User clicks report post from feed menu
    And User will see option which reason to reporting post
    Then User will see toast msg after report post
    When User clicks share post from feed menu
    Then User will see option which app to taking share

    Examples:
      |         email        |        password       |
      |	      apkprod20	     |        test123        |

  #FDBRMA-346 #FDBRMA-347
  @CheckPost
  Scenario Outline: Share - Delete own post from profile
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then user enters the "<email>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    Then User will see modal account status on homescreen
    And User clicks profile menu and select post
    When User clicks share post from profile menu
    Then User will see option which app to taking share
    When User clicks delete post from profile menu
    Then User will see confirmation dialog to delete post

    Examples:
      |         email        |        password   |
      |	      apkprod20	     |        test123        |

  #FDBRMA-421
  @CheckPostTest
  Scenario Outline: Check tagged post with user review from feed
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then user enters the "<email>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    Then User will see modal account status on homescreen
    When User clicks tag icon in post from feed menu
    Then User will see personal rating and review for product

    Examples:
      |         email        |        password   |
      |	      apkprod19	     |        test123    |

  #FDBRMA-422
  @CheckPostTest
  Scenario Outline: Check tagged post without user review from feed
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then user enters the "<email>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    Then User will see modal account status on homescreen
    When User clicks tag icon in post from feed menu
    Then User will see overall rating for product

    Examples:
      |         email        |        password   |
      |	      apkprod20	     |        test123    |
