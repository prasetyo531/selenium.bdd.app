Feature: User Edit Post

  In order to perform sucessfull edit post
  I should able to fill all option of add post process

  #FDBRMA-312 #FDBRMA-313 #FDBRMA-314
  @EditPost1 @Production
  Scenario Outline: Edit post - Edit caption, hashtag and add tag product from feed
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then user enters the "<email>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    Then User will see modal account status on homescreen
    When User clicks edit post from feed menu
    Then User enters caption of post contains hashtag "<hashtag>"
    And User tag product and select by search product "<search>"
    When User clicks submit edit post
    Then User directed to feed and see post updated with "<hashtag>"

    Examples:
      |         email        |        password       |       hashtag    |     search  |
      |	      vnsphl	     |        dora12345        |    #cobaskin   |     lips	  |

  #FDBRMA-350 #FDBRMA-351 #FDBRMA-352
  @EditPost1 @Production
  Scenario Outline: Edit post - Edit caption, hashtag and add tag product from profile
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then user enters the "<email>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    Then User will see modal account status on homescreen
    When User clicks edit post from profile menu
    Then User enters caption of post contains hashtag "<hashtag>"
    And User tag product and select by search product "<search>"
    When User clicks submit edit post
    Then User directed to own user feed and see post updated with "<hashtag>"

    Examples:
      |         email        |        password       |     hashtag      |   search  |
      |	      vnsphl	     |        dora12345      |    #cobaskin     |   tint    |

  #FDBRMA-353
  @EditPost1 @Staging
  Scenario Outline: Edit post - Remove tag product from feed
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then user enters the "<email>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    Then User will see modal account status on homescreen
    When User clicks edit post from feed menu
    Then User takeout tagged product
    When User clicks submit edit post without tag
    Then User directed to feed and see post updated without tagged product

    Examples:
      |         email        |        password       |
      |	      testflight	 |        test123        |

  #FDBRMA-315
  @EditPost @Staging
  Scenario Outline: Edit post - Remove tag product from profile
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then user enters the "<email>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    Then User will see modal account status on homescreen
    When User clicks edit post from profile menu
    Then User takeout tagged product
    When User clicks submit edit post without tag
    Then User directed to own user feed and see post updated without tagged product

    Examples:
      |      email       |        password       |
      |	    apkprod20	 |        test123        |

  #FDBRMA-318
  @EditPost
  Scenario Outline: Cancel Edit post
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then user enters the "<email>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    Then User will see modal account status on homescreen
    When User clicks edit post from feed menu
    Then User enters caption of post contains hashtag "<hashtag>"
    When User click back to cancel add post
    Then User will see confirm modal to cancel edit post

    Examples:
      |         email        |        password       |       hashtag    |
      |	      apkprod20	 |        test123        |    cobaskincare  |
