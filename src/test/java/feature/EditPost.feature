Feature: User Edit Post

  In order to perform sucessfull edit post
  I should able to fill all option of add post process

  #FDBRMA-312 #FDBRMA-313 #FDBRMA-314
  @Android @EditPost @Staging
  Scenario Outline: Edit post - Edit caption, hashtag and add tag product from feed
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<email>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    Then User will be directed to homescreeen app
    When User clicks edit post from feed menu
    Then User enters caption of post contains hashtag "<hashtag>"
    And User tag product and select by search product "<search>"
    When User clicks submit edit post
    Then User directed to feed and see post updated with "<hashtag>"

    Examples:
      |         email        |        password       |       hashtag    |     search  |
      |	      vnsphl	     |        dora12345        |    #cobaskin   |     lips	  |

  #FDBRMA-350 #FDBRMA-351 #FDBRMA-352
  @Android @EditPost @Staging
  Scenario Outline: Edit post - Edit caption, hashtag and add tag product from profile
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<email>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    Then User will be directed to homescreeen app
    When User clicks edit post from profile menu
    Then User enters caption of post contains hashtag "<hashtag>"
    And User tag product and select by search product "<search>"
    When User clicks submit edit post
    Then User directed to own user feed and see post updated with "<hashtag>"

    Examples:
      |         email        |        password       |     hashtag      |   search  |
      |	      vnsphl02	     |        test123      |    #cobaskin     |   tint    |

  #FDBRMA-353 test data have 1 tagged product
  @Android @EditPost @Staging
  Scenario Outline: Edit post - Remove tag product from feed
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<email>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    Then User will be directed to homescreeen app
    When User clicks edit post from feed menu
    Then User takeout tagged product
    When User clicks submit edit post without tag
    Then User directed to feed and see post updated without tagged product

    Examples:
      |         email        |        password       |
      |	      vnsphl03	 |        test123        |

  #FDBRMA-315 test data have 1 tagged product
  @Android @EditPost @Staging @EditPostDemo @Staging
  Scenario Outline: Edit post - Remove tag product from profile
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<email>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    Then User will be directed to homescreeen app
    When User clicks edit post from profile menu
    Then User takeout tagged product
    When User clicks submit edit post without tag
    Then User directed to own user feed and see post updated without tagged product

    Examples:
      |      email       |        password       |
      |	    vnsphl04	 |        test123        |

  #FDBRMA-318
  @Android @EditPost @Staging
  Scenario Outline: Cancel Edit post
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<email>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    Then User will be directed to homescreeen app
    When User clicks edit post from feed menu
    Then User enters caption of post contains hashtag "<hashtag>"
    When User click back to cancel add post
    Then User will see confirm modal to cancel edit post

    Examples:
      |         email        |        password       |       hashtag    |
      |	      vnsphl	 |        dora12345        |    cobaskincare  |

  #FDBRMA-62 run setelah add post #FDBRMA-61
  @Android @EditPost @Staging
  Scenario Outline: Edit post - remove reviewed product from tag until only one product in tag
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<email>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    Then User will be directed to homescreeen app
    When User clicks edit post from feed menu
    Then User enters caption of post contains hashtag "<hashtag>"
    And User remove multiple product from tag
    When User clicks submit edit post
    Then User will direct to feed

    Examples:
      |         email            |        password       |                hashtag                 |
      |	      vnsphl05	 |        test123        |        edit post tag only 1 product    |
