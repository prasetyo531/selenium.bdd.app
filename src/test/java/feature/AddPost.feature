Feature: User Add Post

  In order to perform sucessfull submit post
  I should able to fill all option of add post process
  If user cancel post, user will direct to current menu

  #FDBRMA-54
  @Android @AddPost @Smoke @RealAccount @RealDevices @IntegrationTest
  Scenario Outline: Add post image only camera - Add post with tag product
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<email>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    Then User will see modal account status on homescreen
    When User clicks add post from homescreen menu
    And User take picture to add post
    Then User enters caption of post
    And User clicks submit post and choose not to skip tagging product
    Then User will direct to product list screen to tag product

    Examples:
      |         email            |        password       |
      |	      bddtestaddpost01	 |        test123        |

  #FDBRMA-55
  @Android @AddPost @Smoke @RealAccount @RealDevices @IntegrationTest
  Scenario Outline: Add post image from gallery - Add post without tag product
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<email>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    Then User will see modal account status on homescreen
    When User clicks add post from homescreen menu
    And User pick picture from gallery add post
    Then User enters caption of post
    And User clicks submit post and choose yes to skip tagging product
    Then User will direct to feed where last post is at most top

    Examples:
      |         email            |        password       |
      |	      bddtestaddpost01	 |        test123        |

  #FDBRMA-57 #FDBRMA-65 #FDBRMA-317
  @Android @AddPost @Smoke @RealAccount @RealDevices @IntegrationTest
  Scenario Outline: Add post cancel tag post and cancel post
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<email>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    Then User will see modal account status on homescreen
    When User clicks add post from homescreen menu
    And User take picture to add post
    Then User enters caption of post
    And User cancel to tag product
    When User click back to cancel add post
    Then User will see confirm modal to cancel add post

    Examples:
      |         email            |        password       |
      |	      bddtestaddpost01	 |        test123        |

  #FDBRMA-58 #FDBRMA-59
  @Android @AddPost @Smoke @RealAccount @RealDevices @IntegrationTest
  Scenario Outline: Add post with tag product - Review product
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<email>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    Then User will see modal account status on homescreen
    When User clicks add post from homescreen menu
    And User take picture to add post
    Then User enters caption of post
    And User tag product and select from popular product
    And User add review product in tag
    And User clicks submit post with tag product
    Then User will direct to feed where last post is at most top

    Examples:
      |         email            |        password       |
      |	      bddtestaddpost01	 |        test123        |

  #FDBRMA-56 #FDBRMA-60
  @Android @AddPost @Staging @RealAccount @RealDevices @IntegrationTest
  Scenario Outline: Add post - Tag reviewed product by search product
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<email>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    Then User will see modal account status on homescreen
    When User clicks add post from homescreen menu
    And User take picture to add post
    Then User enters caption of post
    And User tag product and select by search product "<search>"
    And User will see tagged product has reviewed already
    And User clicks submit post with tag product
    Then User will direct to feed where last post is at most top

    Examples:
      |         email            |      password       |           search               |
      |	      bddtestaddpost01	 |	      test123      |       nature republic          |

  #FDBRMA-61  #FDBRMA-63
  @FDBRMA-61
  Scenario Outline: Add post with multiple tag product - review each tagged product
    Given User navigates to onboarding screen by swipe
    When User clicks login button on onboarding screen
    Then User enters the "<email>" email to login
    And User clicks next button on login screen
    And User enters the "<password>" password on login screen
    When User clicks login button on login screen
    Then User will see modal account status on homescreen
    When User clicks add post from homescreen menu
    And User take picture to add post
    Then User enters caption of post
    Then User enters caption of post contains special char "<caption>"
    And User tag multiple product and select by search product "<search>"
    And User add review all product in tag
    And User clicks submit post with tag product
    Then User will direct to feed where last post is at most top

    Examples:
      |         email        |     password      |            caption            |     search      |
      |	   bddtestaddpost03	 |      test123      |    try&review post dari #qa   |      lip        |


